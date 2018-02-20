package com.junz.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 
 * @author YY小主
 *
 */
public class HelloServiceProxyFactory {

	/**
	 * 创建一个实现了 HelloService 接口的动态代理类的实例
	 * 参数 HelloService 引用被代理的 HelloService 实例
	 */
	public static HelloService getHelloServiceProxy(final HelloService helloService) {
		//创建一个实现了 InvocationHandler 接口的匿名类的实例
		InvocationHandler handler = new InvocationHandler(){

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
				// TODO Auto-generated method stub
				System.out.println("before calling " + method);
				Object result = method.invoke(helloService, args);
				//调用被代理的 HelloService 实例的方法
				System.out.println("after calling " + method);
				
				return result;
			}
		};
		
		//
		Class classType = HelloService.class;
		
		return (HelloService)Proxy.newProxyInstance(classType.getClassLoader(), new Class[]{classType}, handler);
	}
	
	
}
