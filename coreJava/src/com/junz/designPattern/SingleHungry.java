package com.junz.designPattern;

/**
 * 单例模式--饿汉式
 * @author YY小主
 * 特点：
 *	1、立即加载、非延迟加载
 *	2、线程安全（基于类加载机制）
 *
 */
public class SingleHungry {
	//1-声明私有实例对象(直接实例化)
	private static SingleHungry instance = new SingleHungry();
	//2-私有构造函数
	private SingleHungry(){}
	//3-实例对象的get 方法
	public static SingleHungry getInstance() {
		//3-1 直接返回创建的实例
		return instance;
	}
	
}
