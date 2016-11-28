这个页面的操作符可用于根据条件发射或变换Observables，或者对它们做布尔运算：

### 条件操作符

* [**`amb( )`**](Conditional.md#Amb) — 给定多个Observable，只让第一个发射数据的Observable发射全部数据
* [**`defaultIfEmpty( )`**](Conditional.md#DefaultIfEmpty) — 发射来自原始Observable的数据，如果原始Observable没有发射数据，就发射一个默认数据
* (`rxjava-computation-expressions`) [**`doWhile( )`**](Conditional.md#Repeat) — 发射原始Observable的数据序列，然后重复发射这个序列直到不满足这个条件为止
* (`rxjava-computation-expressions`) [**`ifThen( )`**](Conditional.md#Defer) — 只有当某个条件为真时才发射原始Observable的数据序列，否则发射一个空的或默认的序列
* [**`skipUntil( )`**](Conditional.md#SkipUntil) — 丢弃原始Observable发射的数据，直到第二个Observable发射了一个数据，然后发射原始Observable的剩余数据
* [**`skipWhile( )`**](Conditional.md#SkipWhile) — 丢弃原始Observable发射的数据，直到一个特定的条件为假，然后发射原始Observable剩余的数据
* (`rxjava-computation-expressions`) [**`switchCase( )`**](Conditional.md#Defer) — 基于一个计算结果，发射一个指定Observable的数据序列
* [**`takeUntil( )`**](Conditional.md#TakeUntil) — 发射来自原始Observable的数据，直到第二个Observable发射了一个数据或一个通知
* [**`takeWhile( )` and `takeWhileWithIndex( )`**](Conditional.md#TakeWhile) — 发射原始Observable的数据，直到一个特定的条件为真，然后跳过剩余的数据
* (`rxjava-computation-expressions`) [**`whileDo( )`**](Conditional.md#Repeat) — 如果条件为`true`，则发射源Observable数据序列，并且只要条件保持为`true`就重复发射此数据序列

> (`rxjava-computation-expressions`) — 表示这个操作符当前是可选包 `rxjava-computation-expressions` 的一部分，还没有包含在标准RxJava的操作符集合里

### 布尔操作符

* [**`all( )`**](Conditional.md#All) — 判断是否所有的数据项都满足某个条件
* [**`contains( )`**](Conditional.md#Contains) — 判断Observable是否会发射一个指定的值
* [**`exists( )` and `isEmpty( )`**](Conditional.md#Contains) — 判断Observable是否发射了一个值
* [**`sequenceEqual( )`**](Conditional.md#Sequenceequal) — 判断两个Observables发射的序列是否相等
