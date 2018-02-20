package com.junz.reflection;

import java.lang.reflect.Method;

/**
 * 反射
 * @author YY小主
 *
 *	1、Method 类的 invoke(Object obj, Object args[]) 方法接收的参数必须为对象
 *		如果参数为基本类型数据，必须转换为相应的包装类型的对象
 *	2、invoke() 方法的返回值总是对象，如果实际被调用的方法的返回类型为基本类型，那么invoke() 方法
 *		会把它转换为相应的包装类型的对象，再将其返回
 *	3、
 *	
 */
public class InvokeTester {

	//add
	public int add(int param1, int param2) {
		return param1 + param2;
	}
	
	//echo
	public String echo(String msg) {
		return "echo " + msg;
	}
	
	//main
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Class classType = InvokeTester.class;
		Object invokeTester = classType.newInstance();
		
		//调用 InvokeTester 对象的 add() 方法
		Method addMethod = classType.getMethod("add", new Class[]{int.class, int.class});
		Object result = addMethod.invoke(invokeTester, new Object[]{new Integer(100), new Integer(200)});
		System.out.println((Integer)result);
		
		//调用 InvokeTester 对象的 echo() 方法
		Method echoMethod = classType.getMethod("echo", new Class[]{String.class});
		Object result1 = echoMethod.invoke(invokeTester, new Object[]{"Hello"});
		System.out.println((String)result1);
	}

}
