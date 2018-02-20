package com.junz.reflection;

//public class PackageInfo {
//
//}

/**
 * java 反射相关
 * 
 * 一、Java反射的功能
 * 1、在运行时判断任意一个对象所属的类
 * 2、在运行时构造任意一个类的对象
 * 3、在运行时判断任意一个类所具有的成员变量和方法
 * 4、在运行时调用任意一个对象的方法
 * 5、生成动态代理
 * 
 * 二、Java Reflection API
 * 	1、主要涉及的类都在 Java.lang.reflect 包中：
 * 		---Class 类：	代表一个类
 * 		---Field 类：	代表类的成员变量（属性）
 * 		---Method类：	代表类的方法
 * 		---Constructor 类：	代表类的构造方法
 * 		---Array 类：	提供了动态创建数组，以及访问数组元素的静态方法
 * 
 * 	2、JavaBean 定义：
 * 	【格式要求】必须要有一个不带参数的public类型的构造方法。具有private属性及其对应的public 类型的get\set方法
 * 
 * 	3、反射的几种获取方法
 * 	---类名.class   （如 InvokeTester.class）
 * 	---对象.getClass()
 * 	---
 * 
 * 
 * 	4、
 * 
 * 
 * 
 * 
 * 	10、在远程方法调用中使用 反射机制
 * 
 * 
 * 	11、代理模式
 * 	---静态代理
 * 		有程序员创建或由特定工具自动生成源代码，再对其编译，在程序运行前，代理类的 .class 文件就已经存在了。
 * 
 * 
 * 	---动态代理
 * 		在程序运行时，运用反射机制动态创建而成。
 * 
 * 		java.lang.reflect 包中的 Proxy 类 和 IncocationHandler 接口 提供了生成动态代理的能力
 * 
 * 
 * 
 */




