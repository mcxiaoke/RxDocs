

## Switch

将一个发射多个Observables的Observable转换成另一个单独的Observable，后者发射那些Observables最近发射的数据项

![switch](../images/operators/switch.c.png)

`Switch`订阅一个发射多个Observables的Observable。它每次观察那些Observables中的一个，`Switch`返回的这个Observable取消订阅前一个发射数据的Observable，开始发射最近的Observable发射的数据。注意：当原始Observable发射了一个新的Observable时（不是这个新的Observable发射了一条数据时），它将取消订阅之前的那个Observable。这意味着，在后来那个Observable产生之后到它开始发射数据之前的这段时间里，前一个Observable发射的数据将被丢弃（就像图例上的那个黄色圆圈一样）。

Java将这个操作符实现为`switchOnNext`。它默认不在任何特定的调度器上执行。

* Javadoc: [switchOnNext(Observable)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#switchOnNext(rx.Observable))

