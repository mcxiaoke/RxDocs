下面的这些操作符属于单独的`rxjava-async`模块，它们用于将同步对象转换为Observable。

* [**`start( )`**](Start.md#start) — 创建一个Observable，它发射一个函数的返回值
* [**`toAsync( )` or `asyncAction( )` or `asyncFunc( )`**](Start.md#toAsync) — 将一个函数或者Action转换为已Observable，它执行这个函数并发射函数的返回值
* [**`startFuture( )`**](Start.md#startFuture) — 将一个返回Future的函数转换为一个Observable，它发射Future的返回值
* [**`deferFuture( )`**](Start.md#deferFuture) — 将一个返回Observable的Future转换为一个Observable，但是并不尝试获取这个Future返回的Observable，直到有订阅者订阅它
* [**`forEachFuture( )`**](Start.md#forEachFuture) — 传递Subscriber方法给一个Subscriber，但是同时表现得像一个Future一样阻塞直到它完成
* [**`fromAction( )`**](Start.md#fromAction) — 将一个Action转换为Observable，当一个订阅者订阅时，它执行这个action并发射它的返回值
* [**`fromCallable( )`**](Start.md#fromCallable) — 将一个Callable转换为Observable，当一个订阅者订阅时，它执行这个Callable并发射Callable的返回值，或者发射异常
* [**`fromRunnable( )`**](Start.md#fromRunnable) — convert a Runnable into an Observable that invokes the runable and emits its result when a Subscriber subscribes将一个Runnable转换为Observable，当一个订阅者订阅时，它执行这个Runnable并发射Runnable的返回值
* [**`runAsync( )`**](Start.md#runAsync) — 返回一个StoppableObservable，它发射某个Scheduler上指定的Action生成的多个actions
