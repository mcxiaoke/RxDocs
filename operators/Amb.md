## Amb

给定两个或多个Observable，它只发射最先发射数据或通知的那个Observable的所有数据

![amb](../images/operators/amb.c.png)

传递多个Observable给`Amb`时，它只发射其中一个Observable的数据和通知：最先发送通知给`Amb`的那个，不管发射的是一项数据还是一个`onError`或`onCompleted`通知。`Amb`将忽略和丢弃其它所有Observables的发射物。

![amb](../images/operators/amb.png)

RxJava的实现是`amb`，有一个类似的对象方法`ambWith`。例如，`Observable.amb(o1,o2)`和`o1.ambWith(o2)`是等价的。

这个操作符默认不在任何特定的调度器上执行。
