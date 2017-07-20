# ReactiveX/RxJava文档中文版

**项目地址：<https://github.com/mcxiaoke/RxDocs>，欢迎Star和帮忙改进。**

有任何意见或建议，到这里提出 [Create New Issue](https://github.com/mcxiaoke/RxDocs/issues/new)

## 阅读地址

* [ReactiveX文档中文翻译](http://mcxiaoke.gitbooks.io/rxdocs/content/)
* [PDF/ePub/Mobi格式下载](https://www.gitbook.com/book/mcxiaoke/rxdocs/details)

## 说明

* 大部分是翻译自 [ReactiveX.io](http://reactivex.io/) 和 [RxJava Wiki](https://github.com/ReactiveX/rxjava/wiki)，修正了原文的一些错误，补充了详细的说明和示例

## 版本历史

* 1.0.1 - 2017.07.20 图片链接修正，文本修正
* 1.0.0 - 2016.11.28 文本修正和润色，感谢@jiefly/@donglua/@cccxm等帮忙完善
* 0.9.5 - 2016.03.14 文本修正和润色，感谢@htoooth/@AlanCheen/@Ydcool/@loshine/@ppoffice帮忙完善
* 0.9.0 - 2015.11.25 修正错误和文本润色，感谢@slb1988/@htoooth/@jiyee/@donglua帮忙完善
* 0.8.0 - 2015.07.27 完成全部文档的初步审校，修正了部分用词不当的地方
* 0.7.0 - 2015.07.24 完成全部文档的初译，调整了目录的部分链接和文本
* 0.6.0 - 2015.07.22 完成绝大部分文档的翻译，使用GitBook发布初始版本

## 目录

* [ReactiveX](Intro.md) - 什么是Rx，Rx的理念和优势
* [Observables](Observables.md) - 简要介绍Observable的观察者模型
* [Single](Single.md) - 一种特殊的只发射单个值的Observable
* [Subject](Subject.md) - Observable和Observer的复合体，也是二者的桥梁
* [Scheduler](Scheduler.md) - 介绍了各种异步任务调度和默认调度器
* [All Operators List](All-Operators-List.md) - 按字母顺序的全部操作符列表
* [Operators Categories](Operators.md) - 按目录分类的主要操作符列表
  * [Creating 创建操作](operators/Creating-Observables.md) - `Create`/`Defer`/`From`/`Just`/`Start`/`Repeat`/`Range`
  * [Transforming 变换操作](operators/Transforming-Observables.md) - `Buffer`/`Window`/`Map`/`FlatMap`/`GroupBy`/`Scan`
  * [Filtering 过滤操作](operators/Filtering-Observables.md) - `Debounce`/`Distinct`/`Filter`/`Sample`/`Skip`/`Take`
  * [Combining 结合操作](operators/Combining-Observables.md) - `And`/`StartWith`/`Join`/`Merge`/`Switch`/`Zip`
  * [Error Handling 错误处理](operators/Error-Handling-Operators.md) - `Catch`/`Retry`
  * [Utility 辅助操作](operators/Observable-Utility-Operators.md) - `Delay`/`Do`/`ObserveOn`/`SubscribeOn`/`Subscribe`
  * [Conditional 条件和布尔操作](operators/Conditional-and-Boolean-Operators.md) - `All`/`Amb`/`Contains`/`SkipUntil`/`TakeUntil`
  * [Mathematical 算术和聚合操作](operators/Mathematical-and-Aggregate-Operators.md) - `Average`/`Concat`/`Count`/`Max`/`Min`/`Sum`/`Reduce`
  * [Async 异步操作](operators/Async-Operators.md) - `Start`/`ToAsync`/`StartFuture`/`FromAction`/`FromCallable`/`RunAsync`
  * [Connect 连接操作](operators/Connectable-Observable-Operators.md) - `Connect`/`Publish`/`RefCount`/`Replay`
  * [Convert 转换操作](operators/To.md) - `ToFuture`/`ToList`/`ToIterable`/`ToMap`/`toMultiMap`
  * [Blocking 阻塞操作](operators/Blocking-Observable-Operators.md) - `ForEach`/`First`/`Last`/`MostRecent`/`Next`/`Single`/`Latest`
  * [String 字符串操作](operators/String-Observables.md) - `ByLine`/`Decode`/`Encode`/`From`/`Join`/`Split`/`StringConcat`
* [RxJava文档和教程](Topics.md)
  * [RxJava入门指南](topics/Getting-Started.md)
  * [RxJava使用示例](topics/How-To-Use-RxJava.md)
  * [实现自定义操作符](topics/Implementing-Your-Own-Operators.md)
  * [自定义插件](topics/Plugins.md)
  * [Backpressure](topics/Backpressure.md)
  * [错误处理](topics/Error-Handling.md)
  * [Android模块](topics/The-RxJava-Android-Module.md)
  * [参与开发](topics/How-to-Contribute.md)
  * [补充阅读材料](topics/Additional-Reading.md)


## 链接

* [ReactiveX.io](http://reactivex.io/intro.html)
* [RxJava Wiki](https://github.com/ReactiveX/RxJava/wiki)
* [RxJava Javadoc](http://reactivex.io/RxJava/javadoc/)
* [RxMarbles](http://rxmarbles.com/)
* [Advanced RxJava](http://akarnokd.blogspot.com/)
* [Intro to Rx](http://www.introtorx.com/content/v1.0.10621.0/01_WhyRx.html)
* [MSDN](https://msdn.microsoft.com/en-us/data/gg577609.aspx)


------

## 许可协议

- [署名-非商业性使用-相同方式共享 4.0 国际](https://creativecommons.org/licenses/by-nc-sa/4.0/legalcode)

------

## 联系方式

* Blog: <http://blog.mcxiaoke.com>
* Github: <https://github.com/mcxiaoke>
* Email: [github@mcxiaoke.com](mailto:github#mcxiaoke.com)

## 开源项目

* Rx文档中文翻译: <https://github.com/mcxiaoke/RxDocs>
* MQTT协议中文版: <https://github.com/mcxiaoke/mqtt>
* Awesome-Kotlin: <https://github.com/mcxiaoke/awesome-kotlin>
* Kotlin-Koi: <https://github.com/mcxiaoke/kotlin-koi>
* Next公共组件库: <https://github.com/mcxiaoke/Android-Next>
* PackerNg极速打包: <https://github.com/mcxiaoke/packer-ng-plugin>
* Gradle渠道打包: <https://github.com/mcxiaoke/gradle-packer-plugin>
* EventBus实现xBus: <https://github.com/mcxiaoke/xBus>
* 蘑菇饭App: <https://github.com/mcxiaoke/minicat>
* 饭否客户端: <https://github.com/mcxiaoke/fanfouapp-opensource>
* Volley镜像: <https://github.com/mcxiaoke/android-volley>

------
