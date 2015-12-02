这个页面展示了创建Observable的各种方法。

* [**`just( )`**](Just.md) — 将一个或多个对象转换成发射这个或这些对象的一个Observable
* [**`from( )`**](From.md) — 将一个Iterable, 一个Future, 或者一个数组转换成一个Observable
* [**`repeat( )`**](Repeat.md) — 创建一个重复发射指定数据或数据序列的Observable
* [**`repeatWhen( )`**](Repeat.md) — 创建一个重复发射指定数据或数据序列的Observable，它依赖于另一个Observable发射的数据
* [**`create( )`**](Create.md) — 使用一个函数从头创建一个Observable
* [**`defer( )`**](Defer.md) — 只有当订阅者订阅才创建Observable；为每个订阅创建一个新的Observable
* [**`range( )`**](Range.md) — 创建一个发射指定范围的整数序列的Observable
* [**`interval( )`**](Interval.md) — 创建一个按照给定的时间间隔发射整数序列的Observable
* [**`timer( )`**](Timer.md) — 创建一个在给定的延时之后发射单个数据的Observable
* [**`empty( )`**](Empty.md) — 创建一个什么都不做直接通知完成的Observable
* [**`error( )`**](Empty.md) — 创建一个什么都不做直接通知错误的Observable
* [**`never( )`**](Empty.md) — 创建一个不发射任何数据的Observable
