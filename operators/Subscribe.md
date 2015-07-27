## Subscribe

操作来自Observable的发射物和通知

`Subscribe`操作符是连接观察者和Observable的胶水。一个观察者要想看到Observable发射的数据项，或者想要从Observable获取错误和完成通知，它首先必须使用这个操作符订阅那个Observable。

`Subscribe`操作符的一般实现可能会接受一到三个方法（然后由观察者组合它们），或者接受一个实现了包含这三个方法的接口的对象（有时叫做`Observer`或`Subscriber`）：

**`onNext`**

每当Observable发射了一项数据它就会调用这个方法。这个方法的参数是这个Observable发射的数据项。

**`onError`**

Observable调用这个方法表示它无法生成期待的数据或者遇到了其它错误。这将停止Observable，它在这之后不会再调用`onNext`或`onCompleted`。`onError`方法的参数是导致这个错误的原因的一个表示（有时可能是一个Exception或Throwable对象，其它时候也可能是一个简单的字符串，取决于具体的实现）。

**`onCompleted`**

如果没有遇到任何错误，Observable在最后一次调用`onCompleted`之后会调用这个方法。

如果一个Observable直到有一个观察者订阅它才开始发射数据项，就称之为"冷"的Observable；如果一个Observable可能在任何时刻开始发射数据，就称之为"热"的Observable，一个订阅者可能从开始之后的某个时刻开始观察它发射的数据序列，它可能会错过在订阅之前发射的数据。

RxJava中的实现是`subscribe`方法。

如果你使用无参数的版本，它将触发对Observable的一个订阅，但是将忽略它的发射物和通知。这个操作会激活一个"冷"的Observable。

你也可以传递一到三个函数给它，它们会按下面的方法解释：

1. 	`onNext`
2. `onNext`和`onError`
3. `onNext`, `onError`和`onCompleted`

最后，你还可以传递一个`Observer`或`Subscriber`接口给它，`Observer`接口包含这三个以`on`开头的方法。`Subscriber`接口也实现了这三个方法，而且还添加了几个额外的方法，用于支持使用反压操作(`reactive pull backpressure`)，这让`Subscriber`可以在Observable完成前取消订阅。

`subscribe`方法返回一个实现了`Subscription`接口的对象。这个接口包含`unsubscribe`方法，任何时刻你都可以调用它来断开`subscribe`方法建立的Observable和观察者之间的订阅关系。

* Javadoc: [subscribe()](http://reactivex.io/RxJava/javadoc/rx/Observable.html#subscribe())
* Javadoc: [subscribe(Action1)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#subscribe(rx.functions.Action1))
* Javadoc: [subscribe(Action1,Action1)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#subscribe(rx.functions.Action1,%20rx.functions.Action1))
* Javadoc: [subscribe(Action1,Action1,Action0)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#subscribe(rx.functions.Action1,%20rx.functions.Action1,%20rx.functions.Action0))
* Javadoc: [subscribe(Observer)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#subscribe(rx.Observer))
* Javadoc: [subscribe(Subscriber)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#subscribe(rx.Subscriber))


### foreach

`forEach`方法是简化版的`subscribe`，你同样可以传递一到三个函数给它，解释和传递给`subscribe`时一样。

不同的是，你无法使用`forEach`返回的对象取消订阅。也没办法传递一个可以用于取消订阅的参数。因此，只有当你明确地需要操作Observable的所有发射物和通知时，你才应该使用这个操作符。

* Javadoc: [forEach(Action1)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#forEach(rx.functions.Action1))
* Javadoc: [forEach(Action1,Action1)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#forEach(rx.functions.Action1,%20rx.functions.Action1))
* Javadoc: [forEach(Action1,Action1,A/Users/mcxiaoke/github/RxDocs/docs/BlockingObservable.mdction0)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#forEach(rx.functions.Action1,%20rx.functions.Action1,%20rx.functions.Action0))

### BlockingObservable

`BlockingObservable`类中也有一个类似的叫作`forEach`的方法。详细的说明见 [`BlockingObservable `](../BlockingObservable.md)
