## DefaultIfEmpty

发射来自原始Observable的值，如果原始Observable没有发射任何值，就发射一个默认值


![defaultIfEmtpy](../images/operators/defaultIfEmpty.c.png)

`DefaultIfEmpty`简单的精确地发射原始Observable的值，如果原始Observable没有发射任何数据正常终止（以`onCompleted`d的形式），`DefaultIfEmpty`返回的Observable就发射一个你提供的默认值。

RxJava将这个操作符实现为`defaultIfEmpty`。它默认不在任何特定的调度器上执行。

* Javadoc: [defaultIfEmpty(T)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#defaultIfEmpty(T))

还有一个新的操作符`switchIfEmpty`，不在RxJava 1.0.0版中，它和`defaultIfEmtpy`类似，不同的是，如果原始Observable没有发射数据，它发射一个备用Observable的发射物。
