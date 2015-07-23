## SubscribeOn

指定Observable自身在哪个调度器上执行

![SubscribeOn](../images/operators/subscribeOn.c.png)

很多ReactiveX实现都使用调度器 ["`Scheduler`"](Scheduler.md)来管理多线程环境中Observable的转场。你可以使用`SubscribeOn`操作符指定Observable在一个特定的调度器上运转。

`ObserveOn`操作符的作用类似，但是功能很有限，它指示Observable在一个指定的调度器上给观察者发通知。

在某些实现中还有一个`UnsubscribeOn`操作符。

* Javadoc: [subscribeOn(Scheduler)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#subscribeOn(rx.Scheduler))
* Javadoc: [unsubscribeOn(Scheduler)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#unsubscribeOn(rx.Scheduler))


