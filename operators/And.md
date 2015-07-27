

## And/Then/When

使用Pattern和Plan作为中介，将两个或多个Observables发射的数据集组合到一起

![and/then/when](../images/operators/and_then_when.C.png)

And/Then/When操作符组合的行为类似于`zip`，但是它们使用一个中间数据结构。接受两个或多个Observables，一次一个将它们的发射物结合到`Pattern`对象，然后操作那个`Pattern`对象，将它们变换为一个`Plan`。随后将这些`Plan`变换为Observable的发射物。

![and/then/when](../images/operators/and_then_when.png)

它们属于`rxjava-joins`模块，不是核心RxJava包的一部分。
