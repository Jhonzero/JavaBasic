package com.junz.designPattern;

/**
 * 策略模式
 * @author YY小主
 * 定义一个策略接口实现类，add
 */
public class StrategyAdd implements StrategyInterface{

	@Override
	public int doOperation(int num1, int num2) {
		//返回相加的和
		return num1 + num2;
	}
	
}
