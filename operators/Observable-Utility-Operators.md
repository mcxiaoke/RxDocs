这个页面列出了很多用于Observable的辅助操作符

* [**`materialize( )`**](http://reactivex.io/documentation/operators/materialize-dematerialize.html) — 将Observable转换成一个通知列表convert an Observable into a list of Notifications
* [**`dematerialize( )`**](http://reactivex.io/documentation/operators/materialize-dematerialize.html) — 将上面的结果逆转回一个Observable
* [**`timestamp( )`**](http://reactivex.io/documentation/operators/timestamp.html) — 给Observable发送的每个数据项添加一个时间戳
* [**`serialize( )`**](http://reactivex.io/documentation/operators/serialize.html) — 强制Observable按次序发送数据并且要求功能是完好的
* [**`cache( )`**](http://reactivex.io/documentation/operators/replay.html) — 记住Observable发送的数据序列并发送相同的数据序列给后续的订阅者
* [**`observeOn( )`**](http://reactivex.io/documentation/operators/observeon.html) — 指定观察者观察Observable的调度器
* [**`subscribeOn( )`**](http://reactivex.io/documentation/operators/subscribeon.html) — 指定Observable执行任务的调度器
* [**`doOnEach( )`**](http://reactivex.io/documentation/operators/do.html) — 注册一个动作，对Observable发送的每个数据项使用
* [**`doOnCompleted( )`**](http://reactivex.io/documentation/operators/do.html) — 注册一个动作，对正常完成的Observable使用
* [**`doOnError( )`**](http://reactivex.io/documentation/operators/do.html) — 注册一个动作，对发生错误的Observable使用
* [**`doOnTerminate( )`**](http://reactivex.io/documentation/operators/do.html) — 注册一个动作，对完成的Observable使用，无论是否发生错误
* [**`doOnSubscribe( )`**](http://reactivex.io/documentation/operators/do.html) — 注册一个动作，在观察者订阅时使用
* [**`doOnUnsubscribe( )`**](http://reactivex.io/documentation/operators/do.html) — register an action to take when an observer unsubscribes from an Observable注册一个动作，在观察者取消订阅时使用
* [**`finallyDo( )`**](http://reactivex.io/documentation/operators/do.html) — 注册一个动作，在Observable完成时使用
* [**`delay( )`**](http://reactivex.io/documentation/operators/delay.html) — 延时发送Observable的结果
* [**`delaySubscription( )`**](http://reactivex.io/documentation/operators/delay.html) — 延时处理订阅请求
* [**`timeInterval( )`**](http://reactivex.io/documentation/operators/timeinterval.html) — 定期发送数据
* [**`using( )`**](http://reactivex.io/documentation/operators/using.html) — 创建一个只在Observable生命周期存在的资源
* [**`single( )`**](http://reactivex.io/documentation/operators/first.html) — 强制返回单个数据，否则抛出异常
* [**`singleOrDefault( )`**](http://reactivex.io/documentation/operators/first.html) — 如果Observable完成时返回了单个数据，就返回它，否则返回默认数据
