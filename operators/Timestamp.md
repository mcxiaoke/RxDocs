## Timestamp

给Observable发射的数据项附加一个时间戳

![Timestamp](../images/operators/timestamp.c.png)

RxJava中的实现为`timestamp`，它将一个发射T类型数据的Observable转换为一个发射类型为`Timestamped<T>`的数据的Observable，每一项都包含数据的原始发射时间。

`timestamp`默认在`immediate`调度器上执行，但是可以通过参数指定其它的调度器。

* Javadoc: [timestamp()](http://reactivex.io/RxJava/javadoc/rx/Observable.html#timestamp())
* Javadoc: [timestamp(Scheduler)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#timestamp(rx.Scheduler))


