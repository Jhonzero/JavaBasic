package com.junz.designPattern.singletonPattern;

/**
 * 单例模式---双重校验锁
 * @author YY小主
 *	特点：
 *	1、延迟加载
 *	2、线程安全，且多线程下也有较高性能
 *	3、获取实例时双重校验
 */
public class SingleDCL {
	//1-声明私有实例对象
	private static SingleDCL instance;
	//2-私有构造函数
	private SingleDCL(){}
	//3-获取实例对象的get 方法
	public static SingleDCL getInstance() {
		//3-1 如果实例对象为null
		if(instance == null) {
			//3-2 加锁，保证线程安全。通过反射获取实例对象
			synchronized(SingleDCL.class){
				//3-3 实例对象认为null，则实例化
				if(instance == null){
					instance = new SingleDCL();
				}
			}
			
		}
		
		return instance;
	}
}
