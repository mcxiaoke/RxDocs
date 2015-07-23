这个页面展示的操作符可用于组合多个Observables。

* [**`startWith( )`**](http://reactivex.io/documentation/operators/startwith.html) — 在数据序列的开头增加一项数据
* [**`merge( )`**](http://reactivex.io/documentation/operators/merge.html) — 将多个Observable合并为一个
* [**`mergeDelayError( )`**](http://reactivex.io/documentation/operators/merge.html) — 合并多个Observables，让没有错误的Observable都完成后再发送错误通知
* [**`zip( )`**](http://reactivex.io/documentation/operators/zip.html) — 使用一个函数组合多个Observable发送的数据集合，然后再发送这个结果
* [**`and( )`, `then( )`, and `when( )`**](http://reactivex.io/documentation/operators/and-then-when.html) — (`rxjava-joins`) 通过模式和计划组合多个Observables发送的数据集合
* [**`combineLatest( )`**](http://reactivex.io/documentation/operators/combinelatest.html) — 当两个Observables中的任何一个发送了一个数据时，通过一个指定的函数组合每个Observable发送的最新数据（一共两个数据），然后发送这个函数的结果 
* [**`join( )` and `groupJoin( )`**](http://reactivex.io/documentation/operators/join.html) — 无论何时，如果一个Observable发送了一个数据项，只要在另一个Observable发送的数据项定义的时间窗口内，就将两个Observable发送的数据合并发送
* [**`switchOnNext( )`**](http://reactivex.io/documentation/operators/switch.html) — 将一个发送Observables的Observable转换成另一个Observable，后者发送这些Observables最近发送的数据

> (`rxjava-joins`) — 表示这个操作符当前是可选的`rxjava-joins`包的一部分，还没有包含在标准的RxJava操作符集合里
