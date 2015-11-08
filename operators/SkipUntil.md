## skipUntil

丢弃原始Observable发射的数据，直到第二个Observable发射了一项数据

![skipUntil](../images/operators/skipUntil.c.png)

`SkipUntil`订阅原始的Observable，但是忽略它的发射物，直到第二个Observable发射了一项数据那一刻，它开始发射原始Observable。

RxJava中对应的是`skipUntil`，它默认不在任何特定的调度器上执行。

* Javadoc: [skipUntil(Observable)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#skipUntil(rx.Observable))
