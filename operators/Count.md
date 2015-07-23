## Count

计算原始Observable发射物的数量，然后只发射这个值

![count](../images/operators/count.c.png)

`Count`操作符将一个Observable转换成一个发射单个值的Observable，这个值表示原始Observable发射的数据的数量。

如果原始Observable发生错误终止，`Count`不发射数据而是直接传递错误通知。如果原始Observable永远不终止，`Count`既不会发射数据也不会终止。

RxJava的实现是`count`和`countLong`。

示例代码

```java

String[] items = new String[] { "one", "two", "three" };
assertEquals( new Integer(3), Observable.from(items).count().toBlocking().single() );

```

* Javadoc: [count()](http://reactivex.io/RxJava/javadoc/rx/Observable.html#count())
* Javadoc: [countLong()](http://reactivex.io/RxJava/javadoc/rx/Observable.html#countLong())
