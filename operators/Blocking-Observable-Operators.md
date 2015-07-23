这一节解释 [`BlockingObservable`](http://reactivex.io/RxJava/javadoc/rx/observables/BlockingObservable.html) 的子类. 一个阻塞的Observable 继承普通的Observable类，增加了一些可用于阻塞Observable发送的数据的操作符。

要将一个普通的`Observable` 转换为 `BlockingObservable`，可以使用 [`Observable.toBlocking( )`](http://reactivex.io/RxJava/javadoc/rx/Observable.html#toBlocking()) 方法或者[`BlockingObservable.from( )`](http://reactivex.io/RxJava/javadoc/rx/observables/BlockingObservable.html#from(rx.Observable)) 方法。

* [**`forEach( )`**](http://reactivex.io/documentation/operators/subscribe.html) — 对Observable发送的每一项数据调用一个方法，会阻塞直到Observable完成
* [**`first( )`**](http://reactivex.io/documentation/operators/first.html) — 阻塞直到Observable发送了一个数据，然后返回第一项数据
* [**`firstOrDefault( )`**](http://reactivex.io/documentation/operators/first.html) — 阻塞直到Observable发送了一个数据或者完成，返回第一项数据，或者返回默认值
* [**`last( )`**](http://reactivex.io/documentation/operators/last.html) — 阻塞直到Observable完成，然后返回最后一项数据
* [**`lastOrDefault( )`**](http://reactivex.io/documentation/operators/last.html) — 阻塞直到Observable完成，然后返回最后一项的数据，或者返回默认值
* [**`mostRecent( )`**](http://reactivex.io/documentation/operators/first.html) — 返回一个总是返回Observable最近发送的数据的iterable
* [**`next( )`**](http://reactivex.io/documentation/operators/takelast.html) — 返回一个iterable，会阻塞直到Observable发送了另一个值，然后返回那个值
* [**`latest( )`**](http://reactivex.io/documentation/operators/first.html) — 返回一个iterable，会阻塞直到或者除非Observable发送了一个iterable没有返回的值，然后返回这个值
* [**`single( )`**](http://reactivex.io/documentation/operators/first.html) — 如果Observable完成时只发送了一个值，返回那个值，否则抛出异常
* [**`singleOrDefault( )`**](http://reactivex.io/documentation/operators/first.html) — 如果Observable完成时只发送了一个值，返回那个值，否则否好默认值
* [**`toFuture( )`**](http://reactivex.io/documentation/operators/to.html) — 将Observable转换为一个Future
* [**`toIterable( )`**](http://reactivex.io/documentation/operators/to.html) — 将一个发送数据序列的Observable转换为一个Iterable
* [**`getIterator( )`**](http://reactivex.io/documentation/operators/to.html) — 将一个发送数据序列的Observable转换为一个Iterator

> 伴随这个解释还有一个修改版的弹珠图，这里就是表示阻塞Observable的弹珠图：

![BlockingObservables](images/rx-operators/B.legend.png)

#### 参见：
* javadoc: <a href="http://reactivex.io/RxJava/javadoc/rx/observables/BlockingObservable.html">`BlockingObservable`</a>
* javadoc: <a href="http://reactivex.io/RxJava/javadoc/rx/Observable.html#toBlocking()">`toBlocking()`</a>
* javadoc: <a href="http://reactivex.io/RxJava/javadoc/rx/observables/BlockingObservable.html#from(rx.Observable)">`BlockingObservable.from()`</a>

## 附录：相似的阻塞和非阻塞操作符列表

<table>
 <thead>
  <tr><th rowspan="2">操作符</th><th colspan="3">执行结果</th><th rowspan="2">Rx.NET等价操作</th></tr>
  <tr><th>发送多个数据的Observable</th><th>发送单个数据的Observable</th><th>不发送数据的Observable</th></tr>
 </thead>
 <tbody>
  <tr><td><code>Observable.first</code></td><td> 第一项</td><td>单个数据</td><td><i>该元素不存在</i></td><td><code>firstAsync</code></td></tr>
  <tr><td><code>BlockingObservable.first</code></td><td> 第一项</td><td>单个数据</td><td><i>该元素不存在</i></td><td><code>first</code></td></tr>
  <tr><td><code>Observable.firstOrDefault</code></td><td> 第一项</td><td>单个数据</td><td>默认数据</td><td><code>firstOrDefaultAsync</code></td></tr>
  <tr><td><code>BlockingObservable.firstOrDefault</code></td><td> 第一项</td><td>单个数据</td><td>默认数据</td><td><code>firstOrDefault</code></td></tr>
  <tr><td><code>Observable.last</code></td><td>最后一项</td><td>单个数据</td><td><i>该元素不存在</i></td><td><code>lastAsync</code></td></tr>
  <tr><td><code>BlockingObservable.last</code></td><td>最后一项</td><td>单个数据</td><td><i>该元素不存在</i></td><td><code>last</code></td></tr>
  <tr><td><code>Observable.lastOrDefault</code></td><td>最后一项</td><td>单个数据</td><td>默认数据</td><td><code>lastOrDefaultAsync</code></td></tr>
  <tr><td><code>BlockingObservable.lastOrDefault</code></td><td>最后一项</td><td>单个数据</td><td>默认数据</td><td><code>lastOrDefault</code></td></tr>
  <tr><td><code>Observable.single</code></td><td><i>非法参数</i></td><td>单个数据</td><td><i>该元素不存在</i></td><td><code>singleAsync</code></td></tr>
  <tr><td><code>BlockingObservable.single</code></td><td><i>非法参数</i></td><td>单个数据</td><td><i>该元素不存在</i></td><td><code>single</code></td></tr>
  <tr><td><code>Observable.singleOrDefault</code></td><td><i>非法参数</i></td><td>单个数据</td><td>默认数据</td><td><code>singleOrDefaultAsync</code></td></tr>
  <tr><td><code>BlockingObservable.singleOrDefault</code></td><td><i>非法参数</i></td><td>单个数据</td><td>默认数据</td><td><code>singleOrDefault</code></td></tr>
 </tbody>
</table>
