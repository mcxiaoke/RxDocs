## TakeUntil

当第二个Observable发射了一项数据或者终止时，丢弃原始Observable发射的任何数据

![takeUntil](../images/operators/takeUntil.c.png)

`TakeUntil`订阅并开始发射原始Observable，它还监视你提供的第二个Observable。如果第二个Observable发射了一项数据或者发射了一个终止通知，`TakeUntil`返回的Observable会停止发射原始Observable并终止。

![takeUntil](../images/operators/takeUntil.png)

RxJava中的实现是`takeUntil`。注意：第二个Observable发射一项数据或一个`onError`通知或一个`onCompleted`通知都会导致`takeUntil`停止发射数据。

`takeUntil`默认不在任何特定的调度器上执行。

* Javadoc: [takeUntil(Observable)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#takeUntil(rx.Observable))

![takeUntil](../images/operators/takeUntil.p.png)

还有一个版本的`takeUntil `，不在RxJava 1.0.0版中，它使用一个谓词函数而不是第二个Observable来判定是否需要终止发射数据，它的行为类似于`takeWhile`。

* Javadoc: [takeUntil(Func1)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#takeUntil(rx.functions.Func1))
