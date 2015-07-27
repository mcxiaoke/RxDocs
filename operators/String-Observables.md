`StringObservable` 类包含一些用于处理字符串序列和流的特殊操作符，如下：

* [**`byLine( )`**](Map.md) — 将一个字符串的Observable转换为一个行序列的Observable，这个Observable将原来的序列当做流处理，然后按换行符分割
* [**`decode( )`**](From.md) — 将一个多字节的字符流转换为一个Observable，它按字符边界发射字节数组
* [**`encode( )`**](Map.md) — 对一个发射字符串的Observable执行变换操作，变换后的Observable发射一个在原始字符串中表示多字节字符边界的字节数组
* [**`from( )`**](From.md) — 将一个字符流或者Reader转换为一个发射字节数组或者字符串的Observable
* [**`join( )`**](Sum.md) — 将一个发射字符串序列的Observable转换为一个发射单个字符串的Observable，后者用一个指定的字符串连接所有的字符串
* [**`split( )`**](FlatMap.md) — 将一个发射字符串的Observable转换为另一个发射字符串的Observable，后者使用一个指定的正则表达式边界分割前者发射的所有字符串
* [**`stringConcat( )`**](Sum.md) — 将一个发射字符串序列的Observable转换为一个发射单个字符串的Observable，后者连接前者发射的所有字符串
