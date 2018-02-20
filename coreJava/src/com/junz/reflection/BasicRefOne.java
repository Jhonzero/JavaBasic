package com.junz.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class BasicRefOne {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		//调用
		IntList_addOtherTypeValue();
		
	}
	
	
	/**
	 * function： 
	 * 	1、整形的数组，图和添加对象类型（泛型）的元素
	 * 
	 * 知识点：
	 * 	1、泛型是伪泛型，编译前规范写法使用
	 *  2、泛型在编译后，classes文件中没有泛型
	 * 
	 * 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * 
	 */
	public static void IntList_addOtherTypeValue() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		List<Integer> listt = new ArrayList<Integer>();
		
		
		String pp = new String("zbc");
		
//		listt.add(pp);
		
		Class<? extends List> class1 = listt.getClass();
		Method method = class1.getMethod("add", Object.class);
		
		method.invoke(listt, pp);
		
		System.out.println(listt.size());
		System.out.println(listt.get(0));
		
	}
	

}
