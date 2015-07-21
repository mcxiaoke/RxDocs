[`Subject`](../docs/Subject.md) 可以看成是一个桥梁或者代理，它同时充当了 `Subscriber` 和 [`Observable`](../docs/Observables.md) 的角色。因为它是一个`Subscriber `，它可以订阅一个或多个Observable；又因为它是一个`Observable`，它可以转发它收到的数据，也可以发送新的数据。

更多关于`Subject `的种类和如何使用的信息，请参考 [Subject中文文档](../docs/Subject.md)。

### 串行化
如果你把 `Subject` 当作一个 `Subscriber ` 使用，注意不要从多个线程中调用它的onNext方法（包括其它的on系列方法），这可能导致同时（非顺序）调用，这会违反Observable协议，给Subject的结果增加了不确定性。

要避免此类问题，你可以将 `Subject` 转换为一个 [`SerializedSubject`](http://reactivex.io/RxJava/javadoc/rx/subjects/SerializedSubject.html) ，类似于这样：

```java
mySafeSubject = new SerializedSubject( myUnsafeSubject );
```
