package com.junz.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 
 * @author YY小主
 *
 */
public class ReflectTester {

	public Object copy(Object object) throws Exception{
		//获取对象的类型
		Class classType = object.getClass();
		System.out.println("Class：" + classType.getName());
		
		//通过默认构造方法创建一个新的对象
		Object objectCopy = classType.getConstructor(new Class[]{}).newInstance(new Object[]{});
		
		//获取对象的所有属性
		Field fields[] = classType.getDeclaredFields();
		
		for(int i=0; i<fields.length; i++) {
			Field field = fields[i];
			
			String fieldName = field.getName();
			String firstLetter = fieldName.substring(0, 1).toUpperCase();
			//获得和属性相对应的 getXxx() 方法的名字
			String getMethodName = "get" + firstLetter + fieldName.substring(1);
			//获得和属性相对应的 setXxx() 方法的名字
			String setMethodName = "set" + firstLetter + fieldName.substring(1);
			
			//获得和属性相对应的 getXxx() 方法
			Method getMethod = classType.getMethod(getMethodName, new Class[]{});
			//获得和属性相对应的 getXxx() 方法
			Method setMethod = classType.getMethod(setMethodName, new Class[]{field.getType()});
			
			//调用原对象的 getXxx() 方法
			Object value = getMethod.invoke(object,  new Object[]{});
			System.out.println(fieldName + ":" + value);
			//调用原对象的 setXxx() 方法
//			Object value1 = setMethod.invoke(object,  new Object[]{});
//			System.out.println(fieldName + ":" + value1);
			
			//调用复制对象的 setXxx() 方法
			setMethod.invoke(objectCopy, new Object[]{value});
					
		}
		
		return objectCopy;
	}
	
	//
	public static void main(String[] args) throws Exception {

		Customer customer = new Customer("Tom", 21);
		customer.setId(100);
		
		Customer customerCopy = (Customer)new ReflectTester().copy(customer);
		System.out.println("Copy Info： " + customerCopy.getName() + " " + customerCopy.getAge());
		
	}

}
