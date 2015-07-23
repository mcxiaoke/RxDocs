RxJava的开发仍在持续进行中，而且有一个很长的任务列表需要处理：[RxJava Issues](https://github.com/ReactiveX/RxJava/issues)。

如果你愿意贡献代码，我们请你：

- 阅读 [[Rx Design Guidelines|http://blogs.msdn.com/b/rxteam/archive/2010/10/28/rx-design-guidelines.aspx]]
- 审阅现有的代码，并且遵从已有的模式和习惯
- 包含单元测试
- 移植操作符的时候坚持Rx.Net实现定义的Rx协议（每一个条目都试着引用正确的MSDN文档）

有关许可协议的信息可以在这里找到：[CONTRIBUTING](https://github.com/ReactiveX/RxJava/blob/1.x/CONTRIBUTING.md)

## 将工程导入Eclipse

有两种方法：

###作为Eclipse项目导入

先执行命令：

    ./gradlew eclipse

打开Eclipse：

* choose File - Import - General - Existing Projects into Workspace
* Browse to RxJava folder
* click Finish.
* Right click on the project in Package Explorer, select Properties - Java Compiler - Errors/Warnings - click Enable project specific settings.
* Still in Errors/Warnings, go to Deprecated and restricted API and set Forbidden reference (access-rules) to Warning.

###作为Gradle项目导入

你需要安装Eclise的Gradle插件。

打开Eclipse：

* choose File - Import - Gradle - Gradle Project. 
* Browse to RxJava folder
* click Build Model
* select the project
* click Finish






