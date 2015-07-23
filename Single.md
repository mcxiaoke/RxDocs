Single
======

### 介绍

RxJava（以及它派生出来的RxGroovy和RxScala）开发了一个名为"Single"的Observable变种。

Single有些像Observable，不同的是，它总是只发送一个值，或者一个错误通知，而不是发送一系列的值。

因此，不同于Observable需要三个方法onNext, onError, onCompleted，订阅Single只需要两个方法：

* onSuccess - Single发送单个的值到这个方法
* onError - 如果无法发送需要的值，Single发送一个Throwable对象到这个方法

Single只会调用这两个方法中的一个，而且只会调用一次，调用了任何一个方法之后，订阅关系结束。

### Single的操作符组合

就像Observable一样，Single也可以组合使用多种操作，一些操作符让你可以混合使用Observable和Single：

操作符 | 返回值 | 说明
------| ------|-----
compose | Single |  让你可以创建一个自定义的操作符
concat and concatWith   | Observable |  连接多个Single和Observable发送的数据
create  | Single |  显示调用观察者的create方法创建一个Single
error   | Single |  返回一个立即给订阅者发送错误通知的Single
flatMap | Single |  返回一个Single，它对原Single发送的数据执行flatMap操作后的结果
flatMapObservable   | Observable |  返回一个Observable，它对原Single发送的数据执行flatMap操作后的结果
from    | Single |  将Future转换成Single
just    | Single |  返回一个发送一个指定值的Single
map | Single |  返回一个Single，它对原Single发送的数据执行map操作后的结果
merge   | Single |  将一个Single(它发送的数据是另一个Single，假设为B)转换成另一个Single(它发送来自另一个Single(B)的数据)
merge and mergeWith | Observable |  合并发送来自多个Single的数据
observeOn   | Single |  指示Single在指定的调度程序上调用订阅者的方法
onErrorReturn   | Single |  将一个发送错误通知的Single转换成一个发送指定数据项的Single
subscribeOn | Single |  指示Single在指定的调度程序上执行操作
timeout | Single |  它给原有的Single添加超时控制，如果超时了就发送一个错误通知
toSingle    | Single |  将一个发送单个值的Observable转换为一个Single
zip and zipWith | Single |  将多个Single转换为一个，后者发送的数据是使用对前者应用一个函数后的结果

### 操作符图示

下面的部分使用弹珠图解释这些操作符，下面的图标解释了Single在弹珠图中是如何表示的：

详细的图解可以参考英文文档：[Single](http://reactivex.io/documentation/single.html)
