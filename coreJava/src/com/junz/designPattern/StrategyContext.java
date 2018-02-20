package com.junz.designPattern;

/**
 * 策略模式
 * @author YY小主
 * 定义一个Context类
 * 不同的Context（类似于容器或上下文）调用，对应不同的策略行为
 */
public class StrategyContext {
	//1-声明私有策略接口对象
	private StrategyInterface strategy; 
	//2-构造函数
	public StrategyContext(StrategyInterface strategy){
		this.strategy = strategy;
	}
	//3-定义执行策略的方法
	public int executeStrategy(int num1, int num2) {
		//3-1 直接调用策略接口的方法并返回
		return strategy.doOperation(num1, num2);
	}
	
}
