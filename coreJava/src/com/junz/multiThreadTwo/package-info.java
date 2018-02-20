/**
 * 
 */
/**
 * @author YY小主
 *	多线程学习
 *	整理 《Java 多线程编程核心技术》 一书，汇总知识点和注意点
 *	
 *	1、	创建多线程的方式
 *
 *
 *
 *  2、线程的构造器（八个）
 *  
 *  
 *  【注】本质都是调用本地方法
 *   @param g			线程组参数
 *   @param target		设置一个Runnbale接口类型的target 对象，可以接收实现Runnable接口的类或者继承Thread的类作为参数
 *   					实际 上就是将参数绑定到target 对象上。在调用this.getName() 的时候就会默认调用target.getName(); 
 *   @param name		新线程的名字：1）不可为空，默认会Thread- 加上线程号	init(null, null, "Thread-" + nextThreadNum(), 0, null);
 *   @param stackSize	为新线程设置栈大小，也可以设置为0 表示忽略该参数
 *   @param acc
 *   private void init(ThreadGroup g, Runnable target, String name, long stackSize, AccessControlContext acc) {}
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package com.junz.multiThreadTwo;

import java.security.AccessControlContext;
