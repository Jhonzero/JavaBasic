package com.junz.reflection;

import java.util.Date;

/**
 * 代理类
 * @author YY小主
 *
 */
public class HelloServiceProxy implements HelloService{

	//表示被代理的 HelloService 实例
	private HelloService helloService;
	
	//
	public HelloServiceProxy(HelloService helloService) {
		this.helloService = helloService;
	}
	
	//
	public void setHelloServiceProxy(HelloService helloService) {
		this.helloService = helloService;
	}
	
	
	@Override
	public String echo(String msg) {
		// TODO Auto-generated method stub
		System.out.println("before calling echo(): ");	//预处理
		String result = helloService.echo(msg);			//调用被代理的  HelloService 实例的 echo() 方法
		System.out.println("after calling echo(): ");	//后置处理
		
		return result;
	}

	@Override
	public Date getTime() {
		// TODO Auto-generated method stub
		System.out.println("before calling getTime(): ");	//预处理
		Date date = helloService.getTime();			//调用被代理的  HelloService 实例的 echo() 方法
		System.out.println("after calling getTime(): ");	//后置处理
		return date;
	}

	//
	
	
	
}
