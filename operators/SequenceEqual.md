## SequenceEqual

判定两个Observables是否发射相同的数据序列。

![sequenceEqual](../images/operators/sequenceEqual.c.png)

传递两个Observable给`SequenceEqual`操作符，它会比较两个Observable的发射物，如果两个序列是相同的（相同的数据，相同的顺序，相同的终止状态），它就发射true，否则发射false。

![sequenceEqual](../images/operators/sequenceEqual.png)

它还有一个版本接受第三个参数，可以传递一个函数用于比较两个数据项是否相同。

这个操作符默认不在任何特定的调度器上执行。

* Javadoc: [sequenceEqual(Observable,Observable)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#sequenceEqual(rx.Observable,%20rx.Observable))
* Javadoc: [sequenceEqual(Observable,Observable,Func2)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#sequenceEqual(rx.Observable,%20rx.Observable,%20rx.functions.Func2))
