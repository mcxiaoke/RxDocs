一般来说，Observable不会抛异常。它会调用 `onError` 终止Observable序列，以此通知所有的观察者发生了一个不可恢复的错误。
但是，也存在一些异常。例如，如果 `onError` 调用失败了，Observable不会尝试再次调用 `onError` 去通知观察者，它会抛出 `RuntimeException`，`OnErrorFailedException` 或者 `OnErrorNotImplementedException`。

# 从错误中恢复的技术

So rather than _catch_ exceptions, your observer or operator should more typically respond to `onError` notifications of exceptions. There are also a variety of Observable operators that you can use to react to or recover from `onError` notifications from Observables. For example, you might use an operator to:
因此，你的观察者或者操作符应该对异常发生时的 `onError` 通知做出合适的响应，而不是*捕获*(_catch_)异常。很多操作符可用于对Observable发射的`onError`通知做出响应或者从错误中恢复，例如，你可以：

1. 吞掉这个错误，切换到一个备用的Observable继续发射数据
2. 吞掉这个错误然后发射默认值
3. 吞掉这个错误并立即尝试重启这个Observable
4. 吞掉这个错误，在一些回退间隔后重启这个Observable

你可以使用 [[异常处理操作符|Error Handling Operators]] 描述的操作符实现这些策略。

# RxJava特有的异常

<dl>
 <dt><code>CompositeException</code></dt><dd>表示发生了多个异常。你可以使用异常的 <code>getExceptions()</code> 方法获取单独的异常。</dd>
 
 <dt><code>MissingBackpressureException</code></dt><dd>表示一个订阅者或者操作符试图对一个不支持反压操作的Observable应用该操作。可以参考 [[Backpressure]] 查找针对没有实现反压操作的Observable的解决办法。</dd>
 
 <dt><code>OnErrorFailedException</code></dt><dd>表示Observable尝试调用观察者的 <code>onError()</code> 方法，但是那个方法自己抛出了异常。</dd>
 
 <dt><code>OnErrorNotImplementedException</code></dt><dd>表示一个Observable尝试调用它的观察者的<code>onError()</code> 方法，但是那个方法不存在。有多种方法可以消除这个错误：可以调整Observable使它不会到达这个错误条件，也可以在观察者中实现一个<code>onError</code> 处理器, 或者使用其它的操作符在错误到达之前拦截这个 <code>onError</code> 通知。</dd>
 
 <dt><code>OnErrorThrowable</code></dt><dd>观察者们可以用这种形式传递异常给它们的观察者们的 <code>onError()</code> 方法。相比标准的<code>Throwable</code>，这种Throwable包含更多的信息：错误本身和在错误发生时Observable的内部状态。</dd>
</dl>
