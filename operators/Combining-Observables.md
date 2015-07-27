这个页面展示的操作符可用于组合多个Observables。

* [**`startWith( )`**](StartWith.md) — 在数据序列的开头增加一项数据
* [**`merge( )`**](Merge.md) — 将多个Observable合并为一个
* [**`mergeDelayError( )`**](Merge.md) — 合并多个Observables，让没有错误的Observable都完成后再发射错误通知
* [**`zip( )`**](Zip.md) — 使用一个函数组合多个Observable发射的数据集合，然后再发射这个结果
* [**`and( )`, `then( )`, and `when( )`**](And.md) — (`rxjava-joins`) 通过模式和计划组合多个Observables发射的数据集合
* [**`combineLatest( )`**](CombineLatest.md) — 当两个Observables中的任何一个发射了一个数据时，通过一个指定的函数组合每个Observable发射的最新数据（一共两个数据），然后发射这个函数的结果
* [**`join( )` and `groupJoin( )`**](Join.md) — 无论何时，如果一个Observable发射了一个数据项，只要在另一个Observable发射的数据项定义的时间窗口内，就将两个Observable发射的数据合并发射
* [**`switchOnNext( )`**](Switch.md) — 将一个发射Observables的Observable转换成另一个Observable，后者发射这些Observables最近发射的数据

> (`rxjava-joins`) — 表示这个操作符当前是可选的`rxjava-joins`包的一部分，还没有包含在标准的RxJava操作符集合里
