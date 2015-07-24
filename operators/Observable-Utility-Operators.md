这个页面列出了很多用于Observable的辅助操作符

* [**`materialize( )`**](Materialize.md) — 将Observable转换成一个通知列表convert an Observable into a list of Notifications
* [**`dematerialize( )`**](Materialize.md) — 将上面的结果逆转回一个Observable
* [**`timestamp( )`**](Timestamp.md) — 给Observable发送的每个数据项添加一个时间戳
* [**`serialize( )`**](Serialize.md) — 强制Observable按次序发送数据并且要求功能是完好的
* [**`cache( )`**](Replay.md) — 记住Observable发送的数据序列并发送相同的数据序列给后续的订阅者
* [**`observeOn( )`**](ObserveOn.md) — 指定观察者观察Observable的调度器
* [**`subscribeOn( )`**](SubscribeOn.md) — 指定Observable执行任务的调度器
* [**`doOnEach( )`**](Do.md) — 注册一个动作，对Observable发送的每个数据项使用
* [**`doOnCompleted( )`**](Do.md) — 注册一个动作，对正常完成的Observable使用
* [**`doOnError( )`**](Do.md) — 注册一个动作，对发生错误的Observable使用
* [**`doOnTerminate( )`**](Do.md) — 注册一个动作，对完成的Observable使用，无论是否发生错误
* [**`doOnSubscribe( )`**](Do.md) — 注册一个动作，在观察者订阅时使用
* [**`doOnUnsubscribe( )`**](Do.md) — 注册一个动作，在观察者取消订阅时使用
* [**`finallyDo( )`**](Do.md) — 注册一个动作，在Observable完成时使用
* [**`delay( )`**](Delay.md) — 延时发送Observable的结果
* [**`delaySubscription( )`**](Delay.md) — 延时处理订阅请求
* [**`timeInterval( )`**](TimeInterval.md) — 定期发送数据
* [**`using( )`**](Using.md) — 创建一个只在Observable生命周期存在的资源
* [**`single( )`**](First.md) — 强制返回单个数据，否则抛出异常
* [**`singleOrDefault( )`**](First.md) — 如果Observable完成时返回了单个数据，就返回它，否则返回默认数据
* [**`toFuture( )`**, **`toIterable( )`**, **`toList( )`**](To.md) — 将Observable转换为其它对象或数据结构
