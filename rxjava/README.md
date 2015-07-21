RxJava是 [ReactiveX](http://reactivex.io/) 在JVM上的一个实现，ReactiveX使用Observable序列组合异步和基于事件的程序。更多关于ReactiveX的资料，可以查看 [ReactiveX 介绍](../docs/Intro.md) 页面。

### RxJava 是轻量级的

RxJava尽力做到非常轻巧。它仅关注Observable的抽象和与之相关的高层函数，实现为一个单独的JAR文件。

### RxJava 是一个多语言实现

RxJava 支持Java 6或者更新的版本，以及其它的JVM语言如 [Groovy](https://github.com/ReactiveX/RxGroovy), [Clojure](https://github.com/ReactiveX/RxClojure), [JRuby](https://github.com/ReactiveX/RxJRuby), [Kotlin](https://github.com/ReactiveX/RxKotlin) 和 [Scala](https://github.com/ReactiveX/RxScala)。RxJava 可用于更多的语言环境，而不仅仅是Java和Scala，而且它致力于尊重每一种JVM语言的习惯。(<a href="https://github.com/Netflix/RxJava/pull/304">我们仍在努力</a>)

### RxJava文档

* [入门指南](Getting-Started.md)
* [怎样使用](How-To-Use-RxJava.md)
* [补充阅读](Additional-Reading.md)
* [Observable](Observable.md)
  * [创建操作](Creating-Observables.md)
  * [变换操作](Transforming-Observables.md)
  * [过滤操作](Filtering-Observables.md)
  * [结合操作](Combining-Observables.md)
  * [错误处理](Error-Handling-Operators.md)
  * [辅助操作](Observable-Utility-Operators.md)
  * [条件和布尔操作](Conditional-and-Boolean-Operators.md)
  * [算术和聚合操作](Mathematical-and-Aggregate-Operators.md)
  * [异步操作](Async-Operators.md)
  * [连接操作](Connectable-Observable-Operators.md)
  * [阻塞操作](Blocking-Observable-Operators.md)
  * [字符串操作](String-Observables.md)
  * [操作符列表](Alphabetical-List-of-Observable-Operators.md)
  * [实现自定义操作符](Implementing-Your-Own-Operators.md)
* [Subject](Subject.md)
* [Scheduler](Scheduler.md)
* [插件 Plugins](Plugins.md)
* [反压 Backpressure](Backpressure.md)
* [错误处理 Error Handling](Error-Handling.md)
* [Android模块](The-RxJava-Android-Module.md)
* [参与开发](How-to-Contribute.md)
* [API文档](http://reactivex.io/RxJava/javadoc/rx/Observable.html)

### RxJava 第三方库

下面是可与RxJava协作的第三方库：

* [Hystrix](https://github.com/Netflix/Hystrix/wiki/How-To-Use#wiki-Reactive-Execution) - 用于分布式系统的一个延时和容错处理框架
* [Camel RX](http://camel.apache.org/rx.html)  - 一个用于[Apache Camel](http://camel.apache.org/components.html) 的 RxJava 兼容层
* [rxjava-http-tail](https://github.com/myfreeweb/rxjava-http-tail) - 让你可以跟踪HTTP日志，就像使用 `tail -f` 一样
* [mod-rxvertx - Extension for VertX](https://github.com/vert-x/mod-rxvertx) - 使用 RxJava 封装的VertX库
* [rxjava-jdbc](https://github.com/davidmoten/rxjava-jdbc) - 使用RxJava流式处理JDBC连接，还支持语句的函数式组合
* [rtree](https://github.com/davidmoten/rtree) - 使用RxJava实现的一个纯内存的可变的R-tree和R*-tree
