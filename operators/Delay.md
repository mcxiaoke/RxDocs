# Delay

延迟一段指定的时间再发射来自Observable的发射物

![delay](../images/operators/delay.c.png)

`Delay`操作符让原始Observable在发射每项数据之前都暂停一段指定的时间段。效果是Observable发射的数据项在时间上向前整体平移了一个增量。

RxJava的实现是 `delay`和`delaySubscription`。

![delay](../images/operators/delay.png)

第一种`delay`接受一个定义时长的参数（包括数量和单位）。每当原始Observable发射一项数据，`delay`就启动一个定时器，当定时器过了给定的时间段时，`delay`返回的Observable发射相同的数据项。

注意：`delay`不会平移`onError`通知，它会立即将这个通知传递给订阅者，同时丢弃任何待发射的`onNext`通知。然而它会平移一个`onCompleted`通知。

`delay`默认在`computation`调度器上执行，你可以通过参数指定使用其它的调度器。

* Javadoc: [delay(long,TimeUnit)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#delay(long,%20java.util.concurrent.TimeUnit))
* Javadoc: [delay()](http://reactivex.io/RxJava/javadoc/rx/Observable.html#delay(long,%20java.util.concurrent.TimeUnit,%20rx.Scheduler))

![delay](../images/operators/delay.o.png)

另一种`delay`不实用常数延时参数，它使用一个函数针对原始Observable的每一项数据返回一个Observable，它监视返回的这个Observable，当任何那样的Observable终止时，`delay`返回的Observable就发射关联的那项数据。

这种`delay`默认不在任何特定的调度器上执行。

* Javadoc: [delay(Func1)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#delay(rx.functions.Func1))

![delay](../images/operators/delay.oo.png)

这个版本的`delay`对每一项数据使用一个Observable作为原始Observable的延时定时器。

这种`delay`默认不在任何特定的调度器上执行。

* Javadoc: [delay(Func0,Func1)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#delay(rx.functions.Func0,%20rx.functions.Func1))

![delay](../images/operators/delaySubscription.png)

还有一个操作符`delaySubscription`让你你可以延迟订阅原始Observable。它结合搜一个定义延时的参数。

`delaySubscription`默认在`computation`调度器上执行，你可以通过参数指定使用其它的调度器。

* Javadoc: [delaySubscription(long,TimeUnit)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#delaySubscription(long,%20java.util.concurrent.TimeUnit))
* Javadoc: [delaySubscription(long,TimeUnit,Scheduler)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#delaySubscription(long,%20java.util.concurrent.TimeUnit,%20rx.Scheduler))

![delay](../images/operators/delaySubscription.o.png)

还有一个版本的`delaySubscription`使用一个Obseable而不是一个固定的时长来设置订阅延时。 

这种`delaySubscription `默认不在任何特定的调度器上执行。

* Javadoc: [delaySubscription(Func0)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#delaySubscription(rx.functions.Func0))


