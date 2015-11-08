## TakeWhile

发射Observable发射的数据，直到一个指定的条件不成立

![takeWhile](../images/operators/takeWhile.c.png)

`TakeWhile`发射原始Observable，直到你指定的某个条件不成立的那一刻，它停止发射原始Observable，并终止自己的Observable。

RxJava中的`takeWhile`操作符返回一个镜像原始Observable行为的Observable，直到某一项数据你指定的函数返回`false`那一刻，这个新的Observable发射`onCompleted`终止通知。

`takeWhile`默认不在任何特定的调度器上执行。

* Javadoc: [takeWhile(Func1)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#takeWhile(rx.functions.Func1))
