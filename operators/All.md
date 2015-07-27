## All

判定是否Observable发射的所有数据都满足某个条件

![all](../images/operators/all.c.png)

传递一个谓词函数给`All`操作符，这个函数接受原始Observable发射的数据，根据计算返回一个布尔值。`All`返回一个只发射一个单个布尔值的Observable，如果原始Observable正常终止并且每一项数据都满足条件，就返回true；如果原始Observable的任意一项数据不满足条件就返回False。

![all](../images/operators/all.png)

RxJava将这个操作符实现为`all`，它默认不在任何特定的调度器上执行。

* Javadoc: [all(Func1)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#all(rx.functions.Func1))
