package com.junz.reflection;

import java.lang.reflect.Array;

/**
 * java 反射 --- Array 类：提供了动态创建和访问数组元素的各种静态方法
 * @author YY小主
 * 
 * 1、
 *
 */
public class ArrayTester1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class classType = Class.forName("java.lang.String");
		
		//创建一个长度为10 的字符串数组
		Object array = Array.newInstance(classType, 10);
		//把索引位置为5 的元素设置为"Hello"
		Array.set(array, 5, "hello");
		//读取索引位置为5的元素的之
		String s = (String)Array.get(array, 5);
		System.out.println(s);
		
	}

}
