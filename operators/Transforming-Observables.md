
这个页面展示了可用于对Observable发射的数据执行变换操作的各种操作符。

* [**`map( )`**](Map.md) — 对序列的每一项都应用一个函数来变换Observable发射的数据序列
* [**`flatMap( )`, `concatMap( )`, and `flatMapIterable( )`**](flatmap.md) — 将Observable发射的数据集合变换为Observables集合，然后将这些Observable发射的数据平坦化的放进一个单独的Observable
* [**`switchMap( )`**](FlatMap.md) — 将Observable发射的数据集合变换为Observables集合，然后只发射这些Observables最近发射的数据
* [**`scan( )`**](Scan.md) — 对Observable发射的每一项数据应用一个函数，然后按顺序依次发射每一个值
* [**`groupBy( )`**](GroupBy.md) — 将Observable分拆为Observable集合，将原始Observable发射的数据按Key分组，每一个Observable发射一组不同的数据
* [**`buffer( )`**](Buffer.md) — 它定期从Observable收集数据到一个集合，然后把这些数据集合打包发射，而不是一次发射一个
* [**`window( )`**](Window.md) — 定期将来自Observable的数据分拆成一些Observable窗口，然后发射这些窗口，而不是每次发射一项
* [**`cast( )`**](Map.md) — 在发射之前强制将Observable发射的所有数据转换为指定类型
