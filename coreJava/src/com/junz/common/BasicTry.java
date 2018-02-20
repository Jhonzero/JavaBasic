package com.junz.common;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BasicTry {

	public static void main(String[] args) {
		//匹配中文字符的正则表达式为 [\u4e00-\u9fa5]
		//该正则表达式匹配简体中文，也包含了部分繁体中文
		// [\u4E00-\u9FFF]
		
//		String a = "123";
//		Digester
//		HashMap aa = new HashMap();
		
		/**
		 * equals默认是比较引用 覆盖equals才会比较对象的内容
		 *
		 */
		Student s1 = new Student("张三");
		Student s2 = new Student("张三");
//		Student s2 = new Student("张三");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1);
		System.out.println(s2);
		
		
		
	}

}
