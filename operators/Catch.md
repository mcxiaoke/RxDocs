## Catch

从`onError`通知中恢复发射数据

![catch](../images/operators/catch.png)

`Catch`操作符拦截原始Observable的`onError`通知，将它替换为其它的数据项或数据序列，让产生的Observable能够正常终止或者根本不终止。

在某些ReactiveX的实现中，有一个叫`onErrorResumeNext`的操作符，它的行为与`Catch`相似。

RxJava将`Catch`实现为三个不同的操作符：

**`onErrorReturn`**

让Observable遇到错误时发射一个特殊的项并且正常终止。

**`onErrorResumeNext`**

让Observable在遇到错误时开始发射第二个Observable的数据序列。

**`onExceptionResumeNext`**

让Observable在遇到错误时继续发射后面的数据项。

### onErrorReturn

![onErrorReturn](../images/operators/onErrorReturn.png)

`onErrorReturn`方法返回一个镜像原有Observable行为的新Observable，后者会忽略前者的`onError`调用，不会将错误传递给观察者，作为替代，它会发发射一个特殊的项并调用观察者的`onCompleted`方法。

* Javadoc: [onErrorReturn(Func1)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#onErrorReturn(rx.functions.Func1))

### onErrorResumeNext

![onErrorResumeNext](../images/operators/onErrorResumeNext.png)

`onErrorResumeNext`方法返回一个镜像原有Observable行为的新Observable，后者会忽略前者的`onError`调用，不会将错误传递给观察者，作为替代，它会开始镜像另一个，备用的Observable。

* Javadoc: [onErrorResumeNext(Func1)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#onErrorResumeNext(rx.functions.Func1))
* Javadoc: [onErrorResumeNext(Observable)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#onErrorResumeNext(rx.Observable))

### onExceptionResumeNext

![onExceptionResumeNext](../images/operators/onExceptionResumeNextViaObservable.png)

和`onErrorResumeNext`类似，`onExceptionResumeNext`方法返回一个镜像原有Observable行为的新Observable，也使用一个备用的Observable，不同的是，如果`onError`收到的`Throwable`不是一个`Exception`，它会将错误传递给观察者的`onError`方法，不会使用备用的Observable。

* Javadoc: [onExceptionResumeNext(Observable)](http://reactivex.io/RxJava/javadoc/rx/Observable.html#onExceptionResumeNext(rx.Observable))




