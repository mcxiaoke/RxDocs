本页展示的操作符用于对整个序列执行算法操作或其它操作，由于这些操作必须等待数据发送完成（通常也必须缓存这些数据），它们对于非常长或者无限的序列来说是危险的，不推荐使用。

#### `rxjava-math` 模块的操作符
* [**`averageInteger( )`**](http://reactivex.io/documentation/operators/average.html) — 求序列平均数并发送
* [**`averageLong( )`**](http://reactivex.io/documentation/operators/average.html) — 求序列平均数并发送
* [**`averageFloat( )`**](http://reactivex.io/documentation/operators/average.html) — 求序列平均数并发送
* [**`averageDouble( )`**](http://reactivex.io/documentation/operators/average.html) — 求序列平均数并发送
* [**`max( )`**](http://reactivex.io/documentation/operators/max.html) — 求序列最大值并发送
* [**`maxBy( )`**](http://reactivex.io/documentation/operators/max.html) — 求最大key对应的值并发送
* [**`min( )`**](http://reactivex.io/documentation/operators/min.html) — 求最小值并发送
* [**`minBy( )`**](http://reactivex.io/documentation/operators/min.html) — 求最小Key对应的值并发送
* [**`sumInteger( )`**](http://reactivex.io/documentation/operators/sum.html) — 求和并发送
* [**`sumLong( )`**](http://reactivex.io/documentation/operators/sum.html) — 求和并发送
* [**`sumFloat( )`**](http://reactivex.io/documentation/operators/sum.html) — 求和并发送
* [**`sumDouble( )`**](http://reactivex.io/documentation/operators/sum.html) — 求和并发送

#### 其它聚合操作符
* [**`concat( )`**](http://reactivex.io/documentation/operators/concat.html) — 顺序连接多个Observables
* [**`count( )` and `countLong( )`**](http://reactivex.io/documentation/operators/count.html) — 计算数据项的个数并发送结果
* [**`reduce( )`**](http://reactivex.io/documentation/operators/reduce.html) — 对序列使用reduce()函数并发送对吼的结果
* [**`collect( )`**](http://reactivex.io/documentation/operators/reduce.html) — 将原Observable发送的数据放到一个单一的可变的数据结构中，然后返回一个发送这个数据结构的Observable
* [**`toList( )`**](http://reactivex.io/documentation/operators/to.html) — 收集原Observable发送的所有数据到一个列表，然后返回这个列表
* [**`toSortedList( )`**](http://reactivex.io/documentation/operators/to.html) — 收集原Observable发送的所有数据到一个有序列表，然后返回这个列表
* [**`toMap( )`**](http://reactivex.io/documentation/operators/to.html) — 将序列数据转换为一个Map，Map的key是根据一个函数计算的
* [**`toMultiMap( )`**](http://reactivex.io/documentation/operators/to.html) — 将序列数据转换为一个列表，同时也是一个Map，Map的key是根据一个函数计算的
