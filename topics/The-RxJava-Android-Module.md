# 介绍

`rxjava-android` 模块包含RxJava的Android特定的绑定代码。它给RxJava添加了一些类，用于帮助在Android应用中编写响应式(`reactive`)的组件。

- 它提供了一个可以在给定的Android `Handler` 上调度 `Observable` 的调度器 `Scheduler `，特别是在UI主线程上。
- 它提供了一些操作符，让你可以更容易的处理 `Fragment` 和 `Activity` 的生命周期方法。
- 它提供了很多Android消息和通知组件的包装类，用于与Rx的调用链搭配使用。
- 针对常见的Android用例和重要的UI，它提供了可复用的、自包含的响应式组件。（*即将到来*）

# Binaries

你可以在 [http://search.maven.org](http://search.maven.org/#search%7Cga%7C1%7Ca%3A%22rxandroid%22) 找到用于Maven, Ivy, Gradle和其它构建系统的二进制文件和依赖信息。

[Maven](http://search.maven.org/#search%7Cga%7C1%7Ca%3A%22rxandroid%22) 示例：

```xml
<dependency>
    <groupId>io.reactivex</groupId>
    <artifactId>rxandroid</artifactId>
    <version>0.23.0</version>
</dependency>
```

Ivy 示例：

```xml
<dependency org="io.reactivex" name="rxandroid" rev="0.23.0" />
```

当前支持的最低API版本(`minSdkVersion`)是 `10` (Android 2.3/Gingerbread)

# 示例

## 在UI线程观察(Observing)

在Android上，通常处理异步任务时你会在主线程上等待(observing)处理结果，一般情况下你使用 `AsyncTask` 达到这个目的。使用RxJava，你会使用 `observeOn` 操作符声明你要在主线程等待 `Observable` 的结果：

```java
public class ReactiveFragment extends Fragment {

@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Observable.from("one", "two", "three", "four", "five")
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(/* an Observer */);
}
```
 
这个例子中，Observable在一个新的线程执行，结果通过 `onNext` 在主线程发射。

## 在任意线程观察(Observing)

前面的例子是一个普遍概念的特殊版本：Android使用一个叫 `Handler` 的类绑定异步通信到消息循环。为了在任意线程 `观察` 一个Observable，需要创建一个与那个类关联的 `Handler`，然后使用 `AndroidSchedulers.handlerThread` 调度器：

```java
new Thread(new Runnable() {
    @Override
    public void run() {
        final Handler handler = new Handler(); // bound to this thread
        Observable.from("one", "two", "three", "four", "five")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.handlerThread(handler))
                .subscribe(/* an Observer */)
                    
        // perform work, ...
    }
}, "custom-thread-1").start();
```

这个例子中，Observable在一个新的线程执行，结果通过 `onNext` 在 `custom-thread-1` 线程上发射。（这个例子不太自然，因为你可以调用`observeOn(Schedulers.currentThread())`，但是它说清楚了这个想法。）

## Fragment和Activity生命周期

在Android上，要在异步操作中访问框架中的对象有些棘手，那是因为Andoid系统可以决定销毁(`destroy`)一个 `Activity`，例如，当一个后台线程还在运行的时候，如果这个线程尝试访问一个已经死掉的`Activity`中的View对象，会导致异常退出(Crash)。（这也会导致内存泄露，因为 `Activity` 已经不可见了，你的后台线程还持有它的引用。）

这仍然是在Android上使用RxJava需要关注的一个问题，但是通过使用 `Subscription`和其它Observable操作符，你可以优雅地解决这个问题。通常来说，当你在`Activity`中订阅一个`Observable`的结果时（无论是直接的还是通过一个内部类），你必须在 `onDestroy` 里取消订阅，就像下面例子里展示的那样：

```java
// MyActivity
private Subscription subscription;

protected void onCreate(Bundle savedInstanceState) {
    this.subscription = observable.subscribe(this);
}

...

protected void onDestroy() {
    this.subscription.unsubscribe();
    super.onDestroy();
}
```


这样确保所有指向订阅者(这个`Activity`)的引用尽快释放，不会再有通知通过 `onNext` 发射给这个订阅者。

有一个问题，如果由于屏幕方向的变化导致这个 `Activity` 被销毁，在 `onCreate` 中这个Observable会再次启动。你可以使用 `cache` 或 `replay` 操作符阻止它发生，这些操作符保证Observable在 `Activity` 的生命周期内存在（你可以在一个全局的缓存中保存它，比如放在Fragment中。）你可以使用任何操作符，只要能保证：当订阅者订阅一个已经在运行的Observable时，在它与`Activity` 解除关联的这段时间里发射的数据都会被`回放`，并且来自这个Observable的任何离线通知都会正常分发。

# 参考资料
* [How the New York Times is building its Android app with Groovy/RxJava](http://open.blogs.nytimes.com/2014/08/18/getting-groovy-with-reactive-android/?_php=true&_type=blogs&_php=true&_type=blogs&_r=1&) by Mohit Pandey
* [Functional Reactive Programming on Android With RxJava](http://mttkay.github.io/blog/2013/08/25/functional-reactive-programming-on-android-with-rxjava/) and [Conquering concurrency - bringing the Reactive Extensions to the Android platform](https://speakerdeck.com/mttkay/conquering-concurrency-bringing-the-reactive-extensions-to-the-android-platform) by Matthias Käppler
* [Learning RxJava for Android by example](https://github.com/kaushikgopal/Android-RxJava) by Kaushik Gopal
* [Top 7 Tips for RxJava on Android](http://blog.futurice.com/top-7-tips-for-rxjava-on-android) and [Rx Architectures in Android](http://www.slideshare.net/TimoTuominen1/rxjava-architectures-on-android-8-android-livecode-32531688) by Timo Tuominen
* [FRP on Android](http://slid.es/yaroslavheriatovych/frponandroid) by Yaroslav Heriatovych
* [Rx for .NET and RxJava for Android](http://blog.futurice.com/tech-pick-of-the-week-rx-for-net-and-rxjava-for-android) by Olli Salonen
* [RxJava in Xtend for Android](http://blog.futurice.com/android-development-has-its-own-swift) by Andre Medeiros
* [RxJava and Xtend](http://mnmlst-dvlpr.blogspot.de/2014/07/rxjava-and-xtend.html) by Stefan Oehme
* Grokking RxJava, [Part 1: The Basics](http://blog.danlew.net/2014/09/15/grokking-rxjava-part-1/), [Part 2: Operator, Operator](http://blog.danlew.net/2014/09/22/grokking-rxjava-part-2/), [Part 3: Reactive with Benefits](http://blog.danlew.net/2014/09/30/grokking-rxjava-part-3/), [Part 4: Reactive Android](http://blog.danlew.net/2014/10/08/grokking-rxjava-part-4/) - published in Sep/Oct 2014 by Daniel Lew
