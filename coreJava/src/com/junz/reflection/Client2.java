package com.junz.reflection;

/**
 * 动态代理类的客户端
 * @author YY小主
 *
 */
public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloService helloService = new HelloServiceImpl();
		
		HelloService helloServiceProxy = HelloServiceProxyFactory.getHelloServiceProxy(helloService);
		
		System.out.println("动态代理类的名字为： " + helloServiceProxy.getClass().getName());
		
		System.out.println(helloServiceProxy.echo("hello!"));
		
	}

}
