Operators
======

ReactiveX的每种编程语言的实现都实现了一组操作符的集合。然而，不同的实现之间有很多重叠的部分，也有一些操作符只存在特定的实现中。而且，每种实现都倾向于用那种编程语言中、他们熟悉的上下文中相似的方法给这些操作符命名。

本文首先会给出ReactiveX的核心操作符列表和对应的文档链接，后面还有一个决策树用于帮助你根据具体的场景选择合适的操作符。最后有一个语言特定实现的按字母排序的操作符列表。

## 操作符目录

### 创建操作

用于创建Observable的操作符

* [Create](operators/Create.md) — 通过调用观察者的方法从头创建一个Observable
* [Defer](operators/Defer.md) — 在观察者订阅之前不创建这个Observable，并且为每一个观察者创建一个新的Observable
* [Empty/Never/Throw](operators/Empty.md) — 创建只有明确和受限行为的Observable
* [From](operators/From.md) — 将其它的对象或数据结构转换到一个Observable
* [Interval](operators/Interval.md) — 创建一个定时发送整数序列的Observable
* [Just](operators/Just.md) — 将一个对象或者对象集合转换到一个会发送这些对象的Observable
* [Range](operators/Range.md) — 创建一个发送一个指定范围的整数序列的Observable
* [Repeat](operators/Repeat.md) — 创建一个重复发送特定的数据或数据序列的Observable
* [Start](operators/Start.md) — 创建一个发送一个函数的返回值的Observable
* [Timer](operators/Timer.md) — 创建一个在一个指定的延迟之后发送单个数据的Observable

### 变换操作

这些操作符可用于对Observable发送的数据进行变换，详细解释可以看每个操作符的文档

* [Buffer](operators/Buffer.md) — 缓存，可以简单的理解为缓存，它定期从Observable收集数据到一个集合，然后把这些数据集合打包发送，而不是一次发送一个
* [FlatMap](operators/FlatMap.md) — 扁平映射，将Observable发送的数据变换为Observables集合，然后将这些Observable发送的数据平坦化的放进一个单独的Observable，可以认为是一个将嵌套的数据结构展开的过程。
* [GroupBy](operators/GroupBy.md) — 分组，将原来的Observable分拆为Observable集合，将原来Observable发送的数据按Key分组，每一个Observable发送一组不同的数据
* [Map](operators/Map.md) — 映射，通过对序列的每一项都应用一个函数变换Observable发送的数据，实质是对序列中的每一项执行一个函数，函数的参数就是这个数据项
* [Scan](operators/Scan.md) — 扫描，对Observable发送的每一项数据应用一个函数，然后按顺序依次发送这些值
* [Window](operators/Window.md) — 窗口，定期将来自Observable的数据分拆成一些Observable窗口，然后发送这些窗口，而不是每次发送一项。类似于Buffer，但Buffer发送的是数据，Window发送的是Observable，每一个Observable发送原来Observable的数据的一个子集，然后调用onCompleted

### 过滤操作

这些操作符用于从原来的Observable发送的数据中进行选择

* [Debounce](operators/Debounce.md) — 只有在空闲了一段时间后才发送数据，通俗的说，就是如果一段时间没有操作，就执行一次操作
* [Distinct](operators/Distinct.md) — 去重，过滤掉重复数据项
* [ElementAt](ElementAt.md) — 取值，取特定位置的数据项
* [Filter](operators/Filter.md) — 过滤，过滤掉没有通过谓词测试的数据项，只发送通过测试的
* [First](operators/First.md) — 首项，只发送满足条件的第一条数据
* [IgnoreElements](operators/IgnoreElements.md) — 忽略所有的数据，只保留结束通知(onError或onCompleted)
* [Last](operators/Last.md) — 末项，只发送最后一条数据
* [Sample](operators/Sample.md) — 取样，定期发送最新的数据，等于是数据抽样，有的实现里叫ThrottleFirst
* [Skip](operators/Skip.md) — 跳过前面的若干项数据
* [SkipLast](operators/SkipLast.md) — 跳过后面的若干项数据
* [Take](operators/Take.md) — 只保留前面的若干项数据
* [TakeLast](operators/TakeLast.md) — 只保留后面的若干项数据

### 组合操作

组合操作符用于将多个Observable组合成一个单一的Observable

* [And/Then/When](operators/And.md) — 通过模式(And条件)和计划(Then次序)组合两个或多个Observable发送的数据集
* [CombineLatest](operators/CombineLatest.md) — 当两个Observables中的任何一个发送了一个数据时，通过一个指定的函数组合每个Observable发送的最新数据（一共两个数据），然后发送这个函数的结果
* [Join](operators/Join.md) — 无论何时，如果一个Observable发送了一个数据项，只要在另一个Observable发送的数据项定义的时间窗口内，就将两个Observable发送的数据合并发送
* [Merge](operators/Merge.md) — 将两个Observable发送的数据组合并成一个
* [StartWith](operators/StartWith.md) — 在发送原来的Observable的数据序列之前，先发送一个指定的数据序列
* [Switch](operators/Switch.md) — 将一个发送Observable序列的Observable转换为这样一个Observable：它逐个发送那些Observable最近发送的数据。如果把两个Observable包装忽略，可以这样理解，就是输入是一个Observable序列，只要这些Observable中的任何一个发送了数据，这个操作就立即将这个数据发送出去
* [Zip](operators/Zip.md) — 使用一个指定的函数将多个Observable发送的数据组合在一起，然后将这个函数的结果作为单项数据发送


### 错误处理

这些操作符用于从错误通知中恢复

* [Catch](operators/Catch.md) — 捕获，继续序列操作，将错误替换为正常的数据，从onError通知中恢复
* [Retry](operators/Retry.md) — 重试，如果一个Observable发送了一个错误通知，重新订阅它，希望没有错误的完成操作

### 辅助操作

一组用于处理Observable的操作符

* [Delay](operators/Delay.md) — 延迟一段时间发送结果数据
* [Do](operators/Do.md) — 注册一个动作占用一些Observable的生命周期事件，相当于Mock某个操作
* [Materialize/Dematerialize](operators/Materialize.md) — 将发送的数据和通知都当做数据发送，或者反过来
* [ObserveOn](operators/ObserveOn.md) — 指定观察者观察Observable的调度程序（工作线程）
* [Serialize](operators/Serialize.md) — 强制Observable按次序发送数据并且功能是完好的
* [Subscribe](operators/Subscribe.md) — 收到Observable发送的数据和通知后执行的操作
* [SubscribeOn](operators/SubscribeOn.md) — 指定Observable应该在哪个调度程序上执行
* [TimeInterval](operators/TimeInterval.md) — 将一个Observable转换为发送两个数据之间所耗费时间的Observable
* [Timeout](operators/Timeout.md) — 添加超时机制，如果过了指定的一段时间没有发送数据，就发送一个错误通知
* [Timestamp](operators/Timestamp.md) — 给Observable发送的每个数据项添加一个时间戳
* [Using](operators/Using.md) — 创建一个只在Observable的生命周期内存在的一次性资源

### 条件和布尔操作

这些操作符可用于单个或多个数据项，也可用于Observable

* [All](operators/Conditional.md#All) — 判断Observable发送的所有的数据项是否都满足某个条件
* [Amb](operators/Conditional.md#Amb) — 给定多个Observable，只让第一个发送数据的Observable发送全部数据
* [Contains](operators/Conditional.md#Contains) — 判断Observable是否会发送一个指定的数据项
* [DefaultIfEmpty](operators/Conditional.md#DefaultIfEmpty) — 发送来自原Observable的数据，如果原Observable没有发送数据，就发送一个默认数据
* [SequenceEqual](operators/Conditional.md#SequenceEqual) — 判断两个Observable是否按相同的数据序列
* [SkipUntil](operators/Conditional.md#SkipUntil) — 丢弃原Observable发送的数据，直到第二个Observable发送了一个数据，然后发送原Observable的剩余数据
* [SkipWhile](operators/Conditional.md#SkipWhile) — 丢弃原Observable发送的数据，直到一个特定的条件为假，然后发送原Observable剩余的数据
* [TakeUntil](operators/Conditional.md#TakeUntil) — 发送来自原Observable的数据，直到第二个Observable发送了一个数据或一个通知
* [TakeWhile](operators/Conditional.md#TakeWhile) — 发送原Observable的数据，直到一个特定的条件为真，然后跳过剩余的数据

### 算术和聚合操作

这些操作符可用于整个数据序列

* [Average](operators/Mathematical.md#Average) — 计算Observable发送的数据序列的平均值，然后发送这个结果
* [Concat](operators/Mathematical.md#Concat) — 在不交叉的情况下合并发送来自多个Observable的数据
* [Count](operators/Mathematical.md#Count) — 计算Observable发送的数据个数，然后发送这个结果
* [Max](operators/Mathematical.md#Max) — 计算并发送数据序列的最大值
* [Min](operators/Mathematical.md#Min) — 计算并发送数据序列的最小值
* [Reduce](operators/Mathematical.md#Reduce) — 按顺序对数据序列的每一个应用某个函数，然后返回这个值
* [Sum](operators/Mathematical.md#Sum) — 计算并发送数据序列的和

### 连接操作

一些有精确可控的订阅行为的特殊Observable

* [Connect](operators/Connect.md) — 指示一个可连接的Observable开始发送数据给订阅者
* [Publish](operators/Publish.md) — 将一个普通的Observable转换为可连接的
* [RefCount](operators/RefCount.md) — 使一个可连接的Observable表现得像一个普通的Observable
* [Replay](operators/Replay.md) — 确保所有的观察者收到同样的数据序列，即使他们在Observable开始发送数据之后才订阅

### 其它操作

* [To](operators/To.md) — 将Observable转换为其它的对象或数据结构


## 操作符决策树

几种主要的需求

* 直接创建一个Observable（创建操作）
* 组合多个Observable（组合操作）
* 对Observable发送的数据执行变换操作（变换操作）
* 从Observable发送的数据中取特定的值（过滤操作）
* 转发Observable的部分值（条件/布尔/过滤操作）
* 对Observable发送的数据序列求值（算术/聚合操作）

