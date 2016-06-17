本页展示的操作符用于对整个序列执行算法操作或其它操作，由于这些操作必须等待数据发射完成（通常也必须缓存这些数据），它们对于非常长或者无限的序列来说是危险的，不推荐使用。

#### `rxjava-math` 模块的操作符
* [**`averageInteger( )`**](Mathematical.md#Average) — 求序列平均数并发射
* [**`averageLong( )`**](Mathematical.md#Average) — 求序列平均数并发射
* [**`averageFloat( )`**](Mathematical.md#Average) — 求序列平均数并发射
* [**`averageDouble( )`**](Mathematical.md#Average) — 求序列平均数并发射
* [**`max( )`**](Mathematical.md#Max) — 求序列最大值并发射
* [**`maxBy( )`**](Mathematical.md#Max) — 求最大key对应的值并发射
* [**`min( )`**](Mathematical.md#Min) — 求最小值并发射
* [**`minBy( )`**](Mathematical.md#Min) — 求最小Key对应的值并发射
* [**`sumInteger( )`**](Mathematical.md#Sum) — 求和并发射
* [**`sumLong( )`**](Mathematical.md#Sum) — 求和并发射
* [**`sumFloat( )`**](Mathematical.md#Sum) — 求和并发射
* [**`sumDouble( )`**](Mathematical.md#Sum) — 求和并发射

#### 其它聚合操作符
* [**`concat( )`**](Mathematical.md#Concat) — 顺序连接多个Observables
* [**`count( )` and `countLong( )`**](Mathematical.md#Count) — 计算数据项的个数并发射结果
* [**`reduce( )`**](Mathematical.md#Reduce) — 对序列使用reduce()函数并发射最终的结果
* [**`collect( )`**](Mathematical.md#Reduce) — 将原始Observable发射的数据放到一个单一的可变的数据结构中，然后返回一个发射这个数据结构的Observable
* [**`toList( )`**](To.md) — 收集原始Observable发射的所有数据到一个列表，然后返回这个列表
* [**`toSortedList( )`**](To.md) — 收集原始Observable发射的所有数据到一个有序列表，然后返回这个列表
* [**`toMap( )`**](To.md) — 将序列数据转换为一个Map，Map的key是根据一个函数计算的
* [**`toMultiMap( )`**](To.md) — 将序列数据转换为一个列表，同时也是一个Map，Map的key是根据一个函数计算的
