package com.junz.reflection;

import java.lang.reflect.Method;

/**
 * 
 * @author YY小主
 *
 */
public class DumpMethods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//加载并初始化命令行参数指定的类
		Class classType = Class.forName("java.util.Stack");
		//获得类的所有方法
		Method methods[] = classType.getDeclaredMethods();
		
		for(int i=0; i<methods.length; i++) {
			System.out.println(methods[i].toString());
		}
		
		
	}

}
