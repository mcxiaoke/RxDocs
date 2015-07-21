在RxJava中，一个实现了_Observer_接口的对象可以订阅(_subscribes_)一个_Observable_ 类的实例。然后，订阅者(subscriber)对Observable发送(_emit_)的任何数据或数据序列作出响应。这种模式简化了并发操作，因为它不需要在等待Observable发送数据时阻塞，而是以观察者的形式创建了一个处于待命状态的哨兵，哨兵适当地响应未来某个时间Observable要做的事。


更多有关Observable类的信息可以参考 [RxDocs项目Observable的中文文档](https://github.com/mcxiaoke/RxDocs/blob/master/docs/Observables.md).
