## 关于

一个精简版本的spring框架。实现了spring的核心功能。（这里的spring版本是5.2.2.RELEASE）

## 功能

### IOC

* 实现了简单的bean容器
* 实现了bean元信息的定义
* 基于反射和cglib创建bean对象
* 通过反射给bean对象赋值
* 资源加载器的简易实现
* 实现了应用上下文
* 实现了初始化和销毁方法
* 实现了aware接口
* factoryBean和多例对象的创建
* 容器事件

### AOP

* 基于JDK动态代理和cglib创建代理对象
* 将代理对象融入到bean容器中
* autowired和value注解的实现

### [通过三级缓存解决循环依赖](https://seamew.top/article/spring%E8%BF%9B%E9%98%B6%E5%AD%A6%E4%B9%A0/%E4%B8%89%E7%BA%A7%E7%BC%93%E5%AD%98%E8%A7%A3%E5%86%B3%E5%BE%AA%E7%8E%AF%E4%BE%9D%E8%B5%96.html)


## 参考

* [mini-spring](https://github.com/DerekYRC/mini-spring)

本文大部分代码参考这个开源项目

* [小马哥讲 Spring AOP 编程思想](https://time.geekbang.org/course/intro/100066301?tab=catalog)

* [小马哥讲 Spring 核心编程思想](https://time.geekbang.org/course/intro/100042601)

上面两个是主要参考视频。深入源码探究。

* [spring官方文档](https://docs.spring.io/spring-framework/docs/5.2.2.RELEASE/spring-framework-reference/)

spring官方文档
