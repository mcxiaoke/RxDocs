这个页面展示的操作符可用于过滤和选择Observable发送的数据序列。

* [**`filter( )`**](http://reactivex.io/documentation/operators/filter.html) — 过滤数据
* [**`takeLast( )`**](http://reactivex.io/documentation/operators/takelast.html) — 只发送最后的N项数据
* [**`last( )`**](http://reactivex.io/documentation/operators/last.html) — 只发送最后的一项数据
* [**`lastOrDefault( )`**](http://reactivex.io/documentation/operators/last.html) — 只发送最后的一项数据，如果Observable为空就发送默认值
* [**`takeLastBuffer( )`**](http://reactivex.io/documentation/operators/takelast.html) — 将最后的N项数据当做单个数据发送
* [**`skip( )`**](http://reactivex.io/documentation/operators/skip.html) — 跳过开始的N项数据
* [**`skipLast( )`**](http://reactivex.io/documentation/operators/skiplast.html) — 跳过最后的N项数据
* [**`take( )`**](http://reactivex.io/documentation/operators/take.html) — 只发送开始的N项数据
* [**`first( )` and `takeFirst( )`**](http://reactivex.io/documentation/operators/first.html) — 只发送第一项数据，或者满足某种条件的第一项数据
* [**`firstOrDefault( )`**](http://reactivex.io/documentation/operators/first.html) — 只发送第一项数据，如果Observable为空就发送默认值
* [**`elementAt( )`**](http://reactivex.io/documentation/operators/elementat.html) — 发送第N项数据
* [**`elementAtOrDefault( )`**](http://reactivex.io/documentation/operators/elementat.html) — 发送第N项数据，如果Observable数据少于N项就发送默认值
* [**`sample( )` or `throttleLast( )`**](http://reactivex.io/documentation/operators/sample.html) — 定期发送Observable最近的数据
* [**`throttleFirst( )`**](http://reactivex.io/documentation/operators/sample.html) — 定期发送Observable发送的第一项数据
* [**`throttleWithTimeout( )` or `debounce( )`**](http://reactivex.io/documentation/operators/debounce.html) — 只有当Observable在指定的时间后还没有发送数据时，才发送一个数据
* [**`timeout( )`**](http://reactivex.io/documentation/operators/timeout.html) — 如果在一个指定的时间段后还没发送数据，就发送一个异常
* [**`distinct( )`**](http://reactivex.io/documentation/operators/distinct.html) — 过滤掉重复数据
* [**`distinctUntilChanged( )`**](http://reactivex.io/documentation/operators/distinct.html) — 过滤掉连续重复的数据
* [**`ofType( )`**](http://reactivex.io/documentation/operators/filter.html) — 只发送指定类型的数据
* [**`ignoreElements( )`**](http://reactivex.io/documentation/operators/ignoreelements.html) — 丢弃所有的正常数据，只发送错误或完成通知
