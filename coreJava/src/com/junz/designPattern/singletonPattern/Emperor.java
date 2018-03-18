package com.junz.designPattern.singletonPattern;

public class Emperor {

	private static final Emperor emperor = new Emperor();
	//constructor
	private Emperor() {
		//
	}
	
	//get the instance
	public static Emperor getInstance() {
		return emperor;
	}
	
	//say()
	public static void say() {
		System.out.println("I am the QinSH");
	}
	
}
