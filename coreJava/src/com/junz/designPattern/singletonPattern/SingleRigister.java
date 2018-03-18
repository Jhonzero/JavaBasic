package com.junz.designPattern.singletonPattern;

/**
 * 单例模式---登记式/静态内部类
 * @author YY小主
 *	特点：
 *	1-线程安全（基于类加载机制）
 *	2-延迟加载，主动调用getInstance()方法获取实例时才会实例化
 *	3-这种方式只适用于静态域场合
 *	4-可以实现和双检锁一样的效果
 */
public class SingleRigister {
	//1-声明私有静态内部类
	private static class SingletonHolder {
		//1-1 私有静态不可变 的实例对象
		private static final SingleRigister instance = new SingleRigister();
	}
	//2-私有构造函数
	private SingleRigister(){}
	//3-获取实例对象的get方法
	public static final SingleRigister getInstance() {
		//3-1 直接返回内部类的实例对象（instance 为空则新建）
		return SingletonHolder.instance;
	}
}
