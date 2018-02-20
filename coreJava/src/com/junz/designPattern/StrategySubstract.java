package com.junz.designPattern;

/**
 * 策略模式
 * @author YY小主
 * 定义一个策略接口实现类, 减法
 */
public class StrategySubstract implements StrategyInterface {

	@Override
	public int doOperation(int num1, int num2) {
		// 返回相减的结构
		return num1 - num2;
	}

}
