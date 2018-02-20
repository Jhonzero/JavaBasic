package com.junz.designPattern;

/**
 * 策略模式
 * @author YY小主
 * 定义Demo类，程序入口
 * 通过Context 来查看当它改变策略时的行为变化
 * 
 * 【思考】
 * 	1、Spring 中Resource 接口，采用了策略类
 * 	---通过调用的容器不同，决定调用对应的资源接口。
 * 比如：
 * 	2、
 * 
 */
public class StrategyDemo {

	public static void main(String[] args) {
		// 此时Conetxt 行为是 StrategyAdd()，所以调用StrategyAdd()方法
		StrategyContext sc1 = new StrategyContext(new StrategyAdd());
		System.out.println("10 + 5 = " + sc1.executeStrategy(10, 5));
		
		StrategyContext sc2 = new StrategyContext(new StrategySubstract());
		System.out.println("10 - 5 = " + sc2.executeStrategy(10, 5));
		
		StrategyContext sc = new StrategyContext(new StrategyMultiply());
		System.out.println("10 * 5 = " + sc.executeStrategy(10, 5));
		
	}
	

}
