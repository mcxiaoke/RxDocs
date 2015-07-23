这个页面的操作符可用于根据条件发送或变换Observables，或者对它们做布尔运算：

### 条件操作符

* [**`amb( )`**](http://reactivex.io/documentation/operators/amb.html) — 给定多个Observable，只让第一个发送数据的Observable发送全部数据
* [**`defaultIfEmpty( )`**](http://reactivex.io/documentation/operators/defaultifempty.html) — 发送来自原Observable的数据，如果原Observable没有发送数据，就发送一个默认数据
* (`rxjava-computation-expressions`) [**`doWhile( )`**](http://reactivex.io/documentation/operators/repeat.html) — 发送原Observable的数据序列，然后重复发送这个序列直到不满足这个条件为止
* (`rxjava-computation-expressions`) [**`ifThen( )`**](http://reactivex.io/documentation/operators/defer.html) — 只有当某个条件为真时才发送原Observable的数据序列，否则发送一个空的或默认的序列
* [**`skipUntil( )`**](http://reactivex.io/documentation/operators/skipuntil.html) — 丢弃原Observable发送的数据，直到第二个Observable发送了一个数据，然后发送原Observable的剩余数据
* [**`skipWhile( )`**](http://reactivex.io/documentation/operators/skipwhile.html) — 丢弃原Observable发送的数据，直到一个特定的条件为假，然后发送原Observable剩余的数据
* (`rxjava-computation-expressions`) [**`switchCase( )`**](http://reactivex.io/documentation/operators/defer.html) — 基于一个计算结果，发送一个指定Observable的数据序列
* [**`takeUntil( )`**](http://reactivex.io/documentation/operators/takeuntil.html) — 发送来自原Observable的数据，直到第二个Observable发送了一个数据或一个通知
* [**`takeWhile( )` and `takeWhileWithIndex( )`**](http://reactivex.io/documentation/operators/takewhile.html) — 发送原Observable的数据，直到一个特定的条件为真，然后跳过剩余的数据
* (`rxjava-computation-expressions`) [**`whileDo( )`**](http://reactivex.io/documentation/operators/repeat.html) — if a condition is true, emit the source Observable's sequence and then repeat the sequence as long as the condition remains true如果满足一个条件，发送原Observable的数据，然后重复发送直到不满足这个条件为止

> (`rxjava-computation-expressions`) — 表示这个操作符当前是可选包 `rxjava-computation-expressions` 的一部分，还没有包含在标准RxJava的操作符集合里

### 布尔操作符

* [**`all( )`**](http://reactivex.io/documentation/operators/all.html) — 判断是否所有的数据项都满足某个条件
* [**`contains( )`**](http://reactivex.io/documentation/operators/contains.html) — 判断Observable是否会发送一个指定的值
* [**`exists( )` and `isEmpty( )`**](http://reactivex.io/documentation/operators/contains.html) — 判断Observable是否发送了一个值
* [**`sequenceEqual( )`**](http://reactivex.io/documentation/operators/sequenceequal.html) — test the equality of the sequences emitted by two Observables判断两个Observables发送的序列是否相等
