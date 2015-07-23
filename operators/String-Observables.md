`StringObservable` 类包含一些用于处理字符串序列和流的特殊操作符，如下：

* [**`byLine( )`**](http://reactivex.io/documentation/operators/map.html) — 将一个字符串的Observable转换为一个行序列的Observable，这个Observable将原来的序列当做流处理，然后按换行符分割
* [**`decode( )`**](http://reactivex.io/documentation/operators/from.html) — 将一个多字节的字符流转换为一个Observable，它按字符边界发送字节数组
* [**`encode( )`**](http://reactivex.io/documentation/operators/map.html) — 对一个发送字符串的Observable执行变换操作，变换后的Observable发送一个在原始字符串中表示多字节字符边界的字节数组
* [**`from( )`**](http://reactivex.io/documentation/operators/from.html) — 将一个字符流或者Reader转换为一个发送字节数组或者字符串的Observable
* [**`join( )`**](http://reactivex.io/documentation/operators/sum.html) — 将一个发送字符串序列的Observable转换为一个发送单个字符串的Observable，后者用一个指定的字符串连接所有的字符串
* [**`split( )`**](http://reactivex.io/documentation/operators/flatmap.html) — 将一个发送字符串的Observable转换为另一个发送字符串的Observable，后者使用一个指定的正则表达式边界分割前者发送的所有字符串
* [**`stringConcat( )`**](http://reactivex.io/documentation/operators/sum.html) — 将一个发送字符串序列的Observable转换为一个发送单个字符串的Observable，后者连接前者发送的所有字符串
