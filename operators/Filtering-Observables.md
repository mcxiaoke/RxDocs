这个页面展示的操作符可用于过滤和选择Observable发射的数据序列。

* [**`filter( )`**](Filter.md) — 过滤数据
* [**`takeLast( )`**](TakeLast.md) — 只发射最后的N项数据
* [**`last( )`**](Last.md) — 只发射最后的一项数据
* [**`lastOrDefault( )`**](Last.md) — 只发射最后的一项数据，如果Observable为空就发射默认值
* [**`takeLastBuffer( )`**](TakeLast.md) — 将最后的N项数据当做单个数据发射
* [**`skip( )`**](Skip.md) — 跳过开始的N项数据
* [**`skipLast( )`**](SkipLast.md) — 跳过最后的N项数据
* [**`take( )`**](Take.md) — 只发射开始的N项数据
* [**`first( )` and `takeFirst( )`**](First.md) — 只发射第一项数据，或者满足某种条件的第一项数据
* [**`firstOrDefault( )`**](First.md) — 只发射第一项数据，如果Observable为空就发射默认值
* [**`elementAt( )`**](ElementAt.md) — 发射第N项数据
* [**`elementAtOrDefault( )`**](ElementAt.md) — 发射第N项数据，如果Observable数据少于N项就发射默认值
* [**`sample( )` or `throttleLast( )`**](Sample.md) — 定期发射Observable最近的数据
* [**`throttleFirst( )`**](Sample.md) — 定期发射Observable发射的第一项数据
* [**`throttleWithTimeout( )` or `debounce( )`**](Debounce.md) — 只有当Observable在指定的时间后还没有发射数据时，才发射一个数据
* [**`timeout( )`**](Timeout.md) — 如果在一个指定的时间段后还没发射数据，就发射一个异常
* [**`distinct( )`**](Distinct.md) — 过滤掉重复数据
* [**`distinctUntilChanged( )`**](Distinct.md) — 过滤掉连续重复的数据
* [**`ofType( )`**](Filter.md) — 只发射指定类型的数据
* [**`ignoreElements( )`**](IgnoreElements.md) — 丢弃所有的正常数据，只发射错误或完成通知
