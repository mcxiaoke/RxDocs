## Connect

让一个可连接的Observable开始发射数据给订阅者

![connect](../images/operators/publishConnect.c.png)

可连接的Observable (*connectable Observable*)与普通的Observable差不多，不过它并不会在被订阅时开始发射数据，而是直到使用了`Connect`操作符时才会开始。用这个方法，你可以等待所有的观察者都订阅了Observable之后再开始发射数据。

![connect](../images/operators/publishConnect.png)

RxJava中`connect`是`ConnectableObservable`接口的一个方法，使用`publish`操作符可以将一个普通的Observable转换为一个`ConnectableObservable`。

调用`ConnectableObservable`的`connect`方法会让它后面的Observable开始给发射数据给订阅者。

`connect`方法返回一个`Subscription`对象，可以调用它的`unsubscribe`方法让Observable停止发射数据给观察者。

即使没有任何订阅者订阅它，你也可以使用`connect`方法让一个Observable开始发射数据（或者开始生成待发射的数据）。这样，你可以将一个"冷"的Observable变为"热"的。

* Javadoc: [connect()](http://reactivex.io/RxJava/javadoc/rx/observables/ConnectableObservable.html#connect())
* Javadoc: [connect(Action1)](http://reactivex.io/RxJava/javadoc/rx/observables/ConnectableObservable.html#connect(rx.functions.Action1))


