package com.junz.designPattern.singletonPattern;

/**
 * 单例模式--懒汉式
 * @author YY小主
 *	特点：
 *	1、延迟加载
 *	2、非线程安全
 */
public class SingleLazy {
	//1-声明私有实例
	private static SingleLazy singleLazyInstance;
	//2-私有构造函数
	private SingleLazy(){}
	//3-获取实例的get方法
	public static SingleLazy getInstance() {
		//3-1 如果实例为空，就创建
		if(singleLazyInstance == null) {
			singleLazyInstance = new SingleLazy();
		}
		return singleLazyInstance;
	}
	
}
