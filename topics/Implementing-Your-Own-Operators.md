# 实现自己的操作符

你可以实现你自己的Observable操作符，本文展示怎么做。

如果你的操作符是被用于*创造*一个Observable，而不是变换或者响应一个Observable，使用 [`create( )`](http://reactivex.io/documentation/operators/create.html) 方法，不要试图手动实现 `Observable`。另外，你可以按照下面的用法说明创建一个自定义的操作符。

如果你的操作符是用于Observable发送的单独的数据项，按照下面的说明做：[_Sequence Operators_](Implementing-Your-Own-Operators#序列操作符) 。如果你的操作符是用于变换Observable发送的整个数据序列，按照这个说明做：[_Transformational Operators_](Implementing-Your-Own-Operators#变换操作符) 。

**提示：** 在一个类似于Groovy的语言Xtend中，你可以以 _extension methods_ 的方式实现你自己的操作符 ,不使用本文的方法，它们也可以链式调用。详情参见 [RxJava and Xtend](http://mnmlst-dvlpr.blogspot.de/2014/07/rxjava-and-xtend.html)

# 序列操作符

下面的例子向你展示了怎样使用`lift( )`操作符将你的自定义操作符（在这个例子中是 `myOperator`）与标准的RxJava操作符（如`ofType`和`map`）一起使用：

```groovy
fooObservable = barObservable.ofType(Integer).map({it*2}).lift(new MyOperator<T>()).map({"transformed by myOperator: " + it});
```

下面这部分向你展示了你的操作符的脚手架形式，以便它能正确的与`lift()`搭配使用。

## 实现你的操作符

将你的自定义操作符定义为实现了 [`Operator`](http://reactivex.io/RxJava/javadoc/rx/Observable.Operator.html) 接口的一个公开类, 就像这样：

```java
public class MyOperator<T> implements Operator<T> {
  public MyOperator( /* any necessary params here */ ) {
    /* 这里添加必要的初始化代码 */
  }

  @Override
  public Subscriber<? super T> call(final Subscriber<? super T> s) {
    return new Subscriber<t>(s) {
      @Override
      public void onCompleted() {
        /* 这里添加你自己的onCompleted行为，或者仅仅传递完成通知： */
        if(!s.isUnsubscribed()) {
          s.onCompleted();
        }
      }

      @Override
      public void onError(Throwable t) {
        /* 这里添加你自己的onError行为, 或者仅仅传递错误通知：*/
        if(!s.isUnsubscribed()) {
          s.onError(t);
        }
      }

      @Override
      public void onNext(T item) {
        /* 这个例子对结果的每一项执行排序操作，然后返回这个结果 */
        if(!s.isUnsubscribed()) {
          transformedItem = myOperatorTransformOperation(item);
          s.onNext(transformedItem);
        }
      }
    };
  }
}
``` 

# 变换操作符

下面的例子向你展示了怎样使用 `compose( )` 操作符将你得自定义操作符（在这个例子中，是一个名叫`myTransformer`的操作符，它将一个发送整数的Observable转换为发送字符串的）与标准的RxJava操作符（如`ofType`和`map`）一起使用：

```groovy
fooObservable = barObservable.ofType(Integer).map({it*2}).compose(new MyTransformer<Integer,String>()).map({"transformed by myOperator: " + it});
```

下面这部分向你展示了你的操作符的脚手架形式，以便它能正确的与`compose()`搭配使用。

## 实现你的变换器

将你的自定义操作符定义为实现了 [`Transformer`](http://reactivex.io/RxJava/javadoc/rx/Observable.Transformer.html) 接口的一个公开类，就像这样：

````java
public class MyTransformer<Integer,String> implements Transformer<Integer,String> {
  public MyTransformer( /* any necessary params here */ ) {
    /* 这里添加必要的初始化代码 */
  }

  @Override
  public Observable<String> call(Observable<Integer> source) {
    /* 
     * 这个简单的例子Transformer应用一个map操作，
     * 这个map操作将发送整数变换为发送整数的字符串表示。
     */
    return source.map( new Func1<Integer,String>() {
      @Override
      public String call(Integer t1) {
        return String.valueOf(t1);
      }
    } );
  }
}
````

## 参见

* [&ldquo;Don&#8217;t break the chain: use RxJava&#8217;s compose() operator&rdquo;](http://blog.danlew.net/2015/03/02/dont-break-the-chain/) by Dan Lew

# 其它需要考虑的

* 在发送任何数据（或者通知）给订阅者之前，你的序列操作符可能需要检查它的 [`Subscriber.isUnsubscribed( )`](Observable#unsubscribing) 状态，如果没有订阅者了，没必要浪费时间生成数据项。
* 请注意：你的序列操作符必须复合Observable协议的核心原则：
  * 它可能调用订阅者的 [`onNext( )`](Observable#onnext-oncompleted-and-onerror) 方法任意次，但是这些调用必须是不重叠的。
  * 它只能调用订阅者的 [`onCompleted( )`](Observable#onnext-oncompleted-and-onerror) 或 [`onError( )`](Observable#onnext-oncompleted-and-onerror) 正好一次，但不能都调用，而且不能在这之后调用订阅者的 [`onNext( )`](Observable#onnext-oncompleted-and-onerror) 方法。
  * 如果你不能保证你得操作符遵从这两个原则，你可以给它添加 [`serialize( )`](Observable-Utility-Operators#serialize) 操作符，它会强制保持正确的行为。
* 请关注这里 [Issue #1962](https://github.com/ReactiveX/RxJava/issues/1962) &mdash；需要有一个计划创建一个测试脚手架，你可以用它来写测试验证你的新操作符遵从了Observable协议。
* 不要让你的操作符阻塞别的操作。
* When possible, you should compose new operators by combining existing operators, rather than implementing them with new code. RxJava itself does this with some of its standard operators, for example:
* 如果可能，你应该组合现有的操作符创建你的新操作符，而不是从零开始实现它。RxJava自身的标准操作符也是这样做的，例如：
  * [`first( )`](http://reactivex.io/documentation/operators/first.html) 被定义为 <tt>[take(1)](http://reactivex.io/documentation/operators/take.html).[single( )](http://reactivex.io/documentation/operators/first.html)</tt>
  * [`ignoreElements( )`](http://reactivex.io/documentation/operators/ignoreelements.html) 被定义为 <tt>[filter(alwaysFalse( ))](http://reactivex.io/documentation/operators/filter.html)</tt>
  * [`reduce(a)`](http://reactivex.io/documentation/operators/reduce.html) 被定义为 <tt>[scan(a)](http://reactivex.io/documentation/operators/scan.html).[last( )](http://reactivex.io/documentation/operators/last.html)</tt>
* 如果你的操作符使用了函数或者lambda表达式作为参数，请注意它们可能是异常的来源，而且要准备好捕获这些异常，并且使用 `onError()` 通知订阅者。
  * 某些异常被认为是致命的，对它们来说，调用 `onError()`毫无意义，那样或者是无用的，或者只是对问题的妥协。你可以使用 `Exceptions.throwIfFatal(throwable)` 方法过滤掉这些知名的异常，并重新抛出它们，而不是试图发送关于它们的通知。
* 一般说来，一旦发生错误应立即通知订阅者，而不是首先尝试发送更多的数据。
* 请注意 `null` 可能是Observable发送的一个合法数据。频繁发生错误的一个来源是：测试一些变量并且将持有一个非 `null` 值作为是否发送了数据的替代。一个值为 `null` 的数据仍然是一个发送数据项，它与没有发送任何东西是不能等同的。
* 想让你的操作符在反压(*backpressure*)场景中变得得好可能会非常棘手。可以参考Dávid Karnok的博客 [Advanced RxJava](http://akarnokd.blogspot.hu/)，这里有一个涉及到的各种因素和怎样处理它们的很值得看的讨论。
