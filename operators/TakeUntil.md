## TakeUntil

当第二个Observable反射了一项数据或者终止时，丢弃原始Observable反射的任何数据

![takeUtil](../images/operators/takeUtil.c.png)

`TakeUntil`订阅并开始反射原始Observable，它还监视你提供的第二个Observable。如果第二个Observable发射了一项数据或者发射了一个终止通知，`TakeUtil`返回的Observable会停止反射原始Observable并终止。

![takeUtil](../images/operators/takeUtil.png)

RxJava中的实现是`takeUntil`。注意：第二个Observable反射一项数据或一个`onError`通知或一个`onCompleted`通知都会导致`takeUtil`停止发射数据。

`takeUtil`默认不在任何特定的调度器上执行。

* Javadoc: [takeUntil(Observable)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#takeUntil(rx.Observable))

![takeUtil](../images/operators/takeUtil.p.png)

还有一个版本的`takeUtil `，不在RxJava 1.0.0版中，它使用一个谓词函数而不是第二个Observable来判定是否需要终止发射数据，它的行为类似于`takeWhile`。

* Javadoc: [takeUntil(Func1)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#takeUntil(rx.functions.Func1))
