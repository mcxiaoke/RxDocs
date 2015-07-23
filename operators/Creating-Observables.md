这个页面展示了创建Observable的各种方法。

* [**`just( )`**](http://reactivex.io/documentation/operators/just.html) — 将一个或多个对象转换成发送这个或这些对象的一个Observable
* [**`from( )`**](http://reactivex.io/documentation/operators/from.html) — 讲一个Iterable, 一个Future, 或者一个数组转换成一个Observable
* [**`repeat( )`**](http://reactivex.io/documentation/operators/repeat.html) — 创建一个重复发送指定数据或数据序列的Observable
* [**`repeatWhen( )`**](http://reactivex.io/documentation/operators/repeat.html) — 创建一个重复发送指定数据或数据序列的Observable，它依赖于另一个Observable发送的数据
* [**`create( )`**](http://reactivex.io/documentation/operators/create.html) — 使用一个函数从头创建一个Observable
* [**`defer( )`**](http://reactivex.io/documentation/operators/defer.html) — 只有当订阅者订阅才创建Observable；为每个订阅创建一个新的Observable
* [**`range( )`**](http://reactivex.io/documentation/operators/range.html) — 创建一个发送指定范围的整数序列的Observable
* [**`interval( )`**](http://reactivex.io/documentation/operators/interval.html) — 创建一个按照给定的时间间隔发送整数序列的Observable
* [**`timer( )`**](http://reactivex.io/documentation/operators/timer.html) — 创建一个在给定的延时之后发送单个数据的Observable
* [**`empty( )`**](http://reactivex.io/documentation/operators/empty-never-throw.html) — 创建一个什么都不做直接通知完成的Observable
* [**`error( )`**](http://reactivex.io/documentation/operators/empty-never-throw.html) — 创建一个什么都不做直接通知错误的Observable
* [**`never( )`**](http://reactivex.io/documentation/operators/empty-never-throw.html) — 创建一个不发送任何数据的Observable
