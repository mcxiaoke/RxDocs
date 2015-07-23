插件让你可以用多种方式修改RxJava的默认行为：

* 修改默认的计算、IO和新线程调度器集合
* 为RxJava可能遇到的特殊错误注册一个错误处理器
* 注册一个函数记录一些常规RxJava活动的发生

# RxJavaSchedulersHook

这个插件让你可以使用你选择的调度器覆盖默认的计算、IO和新线程调度 (`Scheduler`)，要做到这些，需要继承 `RxJavaSchedulersHook` 类并覆写这些方法：

* `Scheduler getComputationScheduler( )`
* `Scheduler getIOScheduler( )`
* `Scheduler getNewThreadScheduler( )`
* `Action0 onSchedule(action)`

然后是下面这些步骤：

1. 创建一个你实现的 `RxJavaSchedulersHook ` 子类的对象。
2. 使用 `RxJavaPlugins.getInstance( )` 获取全局的RxJavaPlugins对象。
3. 将你的默认调度器对象传递给 `RxJavaPlugins` 的 `registerSchedulersHook( )` 方法。

完成这些后，RxJava会开始使用你的方法返回的调度器，而不是内置的默认调度器。

# RxJavaErrorHandler

这个插件让你可以注册一个函数处理传递给 `Subscriber.onError(Throwable)` 的错误。要做到这一点，需要继承 `RxJavaErrorHandler` 类并覆写这个方法：

* `void handleError(Throwable e)`

然后是下面这些步骤：

1. 创建一个你实现的 `RxJavaErrorHandler ` 子类的对象。
2. 使用 `RxJavaPlugins.getInstance( )` 获取全局的RxJavaPlugins对象。
3. 将你的错误处理器对象传递给 `RxJavaPlugins` 的 `registerErrorHandler( )` 方法。

完成这些后，RxJava会开始使用你的错误处理器处理传递给 `Subscriber.onError(Throwable)` 的错误。

# RxJavaObservableExecutionHook

这个插件让你可以注册一个函数用于记录日志或者性能数据收集，RxJava在某些常规活动时会调用它。要做到这一点，需要继承 `RxJavaObservableExecutionHook` 类并覆写这些方法：

<table><thead>
 <tr><th>方法</th><th>何时调用</th></tr>
 </thead><tbody>
  <tr><td><tt>onCreate( )</tt></td><td>在 <tt>Observable.create( )</tt>方法中</td></tr>
  <tr><td><tt>onSubscribeStart( )</tt></td><td>在 <tt>Observable.subscribe( )</tt>之前立刻</td></tr>
  <tr><td><tt>onSubscribeReturn( )</tt></td><td>在 <tt>Observable.subscribe( )</tt>之后立刻</td></tr>
  <tr><td><tt>onSubscribeError( )</tt></td><td>在<tt>Observable.subscribe( )</tt>执行失败时</td></tr>
  <tr><td><tt>onLift( )</tt></td><td>在<tt>Observable.lift( )</tt>方法中</td></tr>
 </tbody>
</table>

然后是下面这些步骤：

1. 创建一个你实现的 `RxJavaObservableExecutionHook ` 子类的对象。
2. 使用 `RxJavaPlugins.getInstance( )` 获取全局的RxJavaPlugins对象。
3. 将你的Hook对象传递给 `RxJavaPlugins` 的 `registerObservableExecutionHook( )` 方法。

When you do this, RxJava will begin to call your functions when it encounters the specific conditions they were designed to take note of.
完成这些后，在满足某些特殊的条件时，RxJava会开始调用你的方法。
