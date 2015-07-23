RxJava是 [ReactiveX](http://reactivex.io/) 在JVM上的一个实现，ReactiveX使用Observable序列组合异步和基于事件的程序。更多关于ReactiveX的资料，可以查看 [ReactiveX 介绍](../docs/Intro.md) 页面。

## RxJava介绍

### RxJava 是轻量级的

RxJava尽力做到非常轻巧。它仅关注Observable的抽象和与之相关的高层函数，实现为一个单独的JAR文件。

### RxJava 是一个多语言实现

RxJava 支持Java 6或者更新的版本，以及其它的JVM语言如 [Groovy](https://github.com/ReactiveX/RxGroovy), [Clojure](https://github.com/ReactiveX/RxClojure), [JRuby](https://github.com/ReactiveX/RxJRuby), [Kotlin](https://github.com/ReactiveX/RxKotlin) 和 [Scala](https://github.com/ReactiveX/RxScala)。RxJava 可用于更多的语言环境，而不仅仅是Java和Scala，而且它致力于尊重每一种JVM语言的习惯。

### RxJava 第三方库

下面是可与RxJava协作的第三方库：

* [Hystrix](https://github.com/Netflix/Hystrix/wiki/How-To-Use#wiki-Reactive-Execution) - 用于分布式系统的一个延时和容错处理框架
* [Camel RX](http://camel.apache.org/rx.html)  - 一个用于[Apache Camel](http://camel.apache.org/components.html) 的 RxJava 兼容层
* [rxjava-http-tail](https://github.com/myfreeweb/rxjava-http-tail) - 让你可以跟踪HTTP日志，就像使用 `tail -f` 一样
* [mod-rxvertx - Extension for VertX](https://github.com/vert-x/mod-rxvertx) - 使用 RxJava 封装的VertX库
* [rxjava-jdbc](https://github.com/davidmoten/rxjava-jdbc) - 使用RxJava流式处理JDBC连接，还支持语句的函数式组合
* [rtree](https://github.com/davidmoten/rtree) - 使用RxJava实现的一个纯内存的可变的R-tree和R*-tree

## 使用指南

你可以在Maven Central [http://search.maven.org](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22io.reactivex%22%20AND%20a%3A%22rxjava%22) 找到用于Maven, Ivy, Gradle, SBT和其它构建工具需要的二进制文件和依赖信息.

Maven示例:

```xml
<dependency>
    <groupId>io.reactivex</groupId>
    <artifactId>rxjava</artifactId>
    <version>1.0.10</version>
</dependency>
```
Ivy示例:

```xml
<dependency org="io.reactivex" name="rxjava" rev="1.0.10" />
```

SBT示例:

```scala
libraryDependencies += "com.netflix.rxjava" % "rxjava-scala" % "1.0.10"
```

Gradle示例:
```groovy
compile 'io.reactivex:rxjava:1.0.10'
```

如果你没有使用构建系统，想直接下载JAR文件的话可以在这里找到：

<https://repo1.maven.org/maven2/io/reactivex/>

## 编译构建

检出和构建RxJava的源码，使用以下命令：

```
$ git clone git@github.com:ReactiveX/RxJava.git
$ cd RxJava/
$ ./gradlew build
```

要执行一个完整的构建，使用这个命令：

```
$ ./gradlew clean build
```

构建命令的输出大概是这样的：

```
$ ./gradlew build
:rxjava:compileJava
:rxjava:processResources UP-TO-DATE
:rxjava:classes
:rxjava:jar
:rxjava:sourcesJar
:rxjava:signArchives SKIPPED
:rxjava:assemble
:rxjava:licenseMain UP-TO-DATE
:rxjava:licenseTest UP-TO-DATE
:rxjava:compileTestJava
:rxjava:processTestResources UP-TO-DATE
:rxjava:testClasses
:rxjava:test
:rxjava:check
:rxjava:build

BUILD SUCCESSFUL

Total time: 30.758 secs
```

执行完整的构建的话，你会看到单元测试的执行，输出类似于这样：

```
> Building > :rxjava:test > 91 tests completed
```

## 故障排除

有一位开发者上报了下面这个错误：

> Could not resolve all dependencies for configuration ':language-adaptors:rxjava-scala:provided'

他在从`.gradle/caches`和`.m2/repository/org/scala-lang/`移除了旧版本的 `scala-library`之后解决了这个问题，然后执行了一次完整构建。<a href="https://gist.github.com/jaceklaskowski/9496058">(查看详细信息)</a>

在构建RxJava时你可能会遇到下面的错误:

> Failed to apply plugin [id 'java']
> Could not generate a proxy class for class nebula.core.NamedContainerProperOrder.

这是JVM的问题，详细信息可以参考 [GROOVY-6951](https://jira.codehaus.org/browse/GROOVY-6951) 。如果遇到这个问题，可以在构建RxJava之前执行 `export GRADLE_OPTS=-noverify`，或者升级你机器上的JDK。
