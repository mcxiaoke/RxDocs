很多操作符可用于对Observable发射的`onError`通知做出响应或者从错误中恢复，例如，你可以：

1. 吞掉这个错误，切换到一个备用的Observable继续发射数据
2. 吞掉这个错误然后发射默认值
3. 吞掉这个错误并立即尝试重启这个Observable
4. 吞掉这个错误，在一些回退间隔后重启这个Observable

这是操作符列表：

* [**`onErrorResumeNext( )`**](Catch.md#onErrorResumeNext) — 指示Observable在遇到错误时发射一个数据序列
* [**`onErrorReturn( )`**](Catch.md#onErrorReturn) — 指示Observable在遇到错误时发射一个特定的数据
* [**`onExceptionResumeNext( )`**](Catch.md#onExceptionResumeNext) — instructs an Observable to continue emitting items after it encounters an exception (but not another variety of throwable)指示Observable遇到错误时继续发射数据
* [**`retry( )`**](Retry.md#retry) — 指示Observable遇到错误时重试
* [**`retryWhen( )`**](Retry.md#retryWhen) — 指示Observable遇到错误时，将错误传递给另一个Observable来决定是否要重新给订阅这个Observable
