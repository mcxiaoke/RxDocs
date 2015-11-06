## SkipWhile

丢弃Observable发射的数据，直到一个指定的条件不成立

![skipWhile](../images/operators/skipWhile.c.png)

`SkipWhile`订阅原始的Observable，但是忽略它的发射物，直到你指定的某个天剑变为false的那一刻，它开始发射原始Observable。

`skipWhile`默认不在任何特定的调度器上执行。

* Javadoc: [skipWhile(Func1)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#skipWhile(rx.functions.Func1))
