Subject
======

Subject可以看成是一个桥梁或者代理，在某些ReactiveX实现中（如RxJava），它同时充当了Observer和Observable的角色。因为它是一个Observer，它可以订阅一个或多个Observable；又因为它是一个Observable，它可以转发它收到(Observe)的数据，也可以发射新的数据。

由于一个Subject订阅一个Observable，它可以触发这个Observable开始发射数据（如果那个Observable是"冷"的--就是说，它等待有订阅才开始发射数据）。因此有这样的效果，Subject可以把原来那个"冷"的Observable变成"热"的。

## Subject的种类

针对不同的场景一共有四种类型的Subject。他们并不是在所有的实现中全部都存在，而且一些实现使用其它的命名约定（例如，在RxScala中Subject被称作PublishSubject）。

### AsyncSubject

一个AsyncSubject只在原始Observable完成后，发射来自原始Observable的最后一个值。（如果原始Observable没有发射任何值，AsyncObject也不发射任何值）它会把这最后一个值发射给任何后续的观察者。
![](images/S.AsyncSubject.png)

然而，如果原始的Observable因为发生了错误而终止，AsyncSubject将不会发射任何数据，只是简单的向前传递这个错误通知。
![](images/S.AsyncSubject.e.png)

### BehaviorSubject

当观察者订阅BehaviorSubject时，它开始发射原始Observable最近发射的数据（如果此时还没有收到任何数据，它会发射一个默认值），然后继续发射其它任何来自原始Observable的数据。
![](images/S.BehaviorSubject.png)

然而，如果原始的Observable因为发生了一个错误而终止，BehaviorSubject将不会发射任何数据，只是简单的向前传递这个错误通知。
![](images/S.BehaviorSubject.e.png)

### PublishSubject

PublishSubject只会把在订阅发生的时间点之后来自原始Observable的数据发射给观察者。需要注意的是，PublishSubject可能会一创建完成就立刻开始发射数据（除非你可以阻止它发生），因此这里有一个风险：在Subject被创建后到有观察者订阅它之前这个时间段内，一个或多个数据可能会丢失。如果要确保来自原始Observable的所有数据都被分发，你需要这样做：或者使用Create创建那个Observable以便手动给它引入"冷"Observable的行为（当所有观察者都已经订阅时才开始发射数据），或者改用ReplaySubject。
![](images/S.PublishSubject.png)

如果原始的Observable因为发生了一个错误而终止，PublishSubject将不会发射任何数据，只是简单的向前传递这个错误通知。
![](images/S.PublishSubject.e.png)

### ReplaySubject

ReplaySubject会发射所有来自原始Observable的数据给观察者，无论它们是何时订阅的。也有其它版本的ReplaySubject，在重放缓存增长到一定大小的时候或过了一段时间后会丢弃旧的数据（原始Observable发射的）。

如果你把ReplaySubject当作一个观察者使用，注意不要从多个线程中调用它的onNext方法（包括其它的on系列方法），这可能导致同时（非顺序）调用，这会违反Observable协议，给Subject的结果增加了不确定性。

![](images/S.ReplaySubject.png)

### RxJava的对应类

假设你有一个Subject，你想把它传递给其它的代理或者暴露它的Subscriber接口，你可以调用它的asObservable方法，这个方法返回一个Observable。具体使用方法可以参考Javadoc文档。

### 串行化
如果你把 `Subject` 当作一个 `Subscriber` 使用，注意不要从多个线程中调用它的onNext方法（包括其它的on系列方法），这可能导致同时（非顺序）调用，这会违反Observable协议，给Subject的结果增加了不确定性。

要避免此类问题，你可以将 `Subject` 转换为一个 [`SerializedSubject`](http://reactivex.io/RxJava/javadoc/rx/subjects/SerializedSubject.html) ，类似于这样：

```java
mySafeSubject = new SerializedSubject( myUnsafeSubject );
```
