
## Average

计算原始Observable发射数字的平均值并发射它

![average](../images/operators/average.c.png)

`Average`操作一个发射数字的Observable，并发射原始Observable的数字序列的平均值。

这个操作符不包含在RxJava核心模块中，它属于不同的`rxjava-math`模块。它被实现为四个操作符：`averageDouble`, `averageFloat`, `averageInteger`, `averageLong`。

![average](../images/operators/average.f.png)

如果原始Observable不发射任何数据，这个操作符会抛异常：`IllegalArgumentException `。
