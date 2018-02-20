package com.junz.reflection;

/**
 * 
 * @author YY小主
 *
 */
public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloService helloService = new HelloServiceImpl();
		HelloService helloServiceProxy = new HelloServiceProxy(helloService);
		
		System.out.println(helloServiceProxy.echo("hello !"));
		
		
	}

}
