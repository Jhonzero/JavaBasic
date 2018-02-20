package com.junz.multiThreadTwo;

/**
 * 停止线程的方法
 * @author YY小主
 * 
 * 【I】有三种方式：
 * 1、
 * 2、
 * 3、
 * 
 * 【II】判断线程是否停止的方法：
 * 【注】底层都是通过本地方法实现  private native boolean isInterrupted(boolean ClearInterrupted);
 * 1、interrupted() ： 
 * 		-- 测试当前线程（当前正在运行的线程）是否已经中断；
 * 		-- 执行后具有将状态标志清除的功能，并返回false。（即多次调用返回false）
 * 2、isInterrupted() ： 
 * 		-- 测试线程（调用的线程）是否已经中断
 * 		-- 执行后不具有将状态标志清除的功能。（即多次调用返回值一致）
 * 
 *
 */
public class InterruptThread extends Thread{

	//重写run 方法
	@Override
	public void run() {
		super.run();
		for(int i=0; i<500000; i++) {
			if(this.interrupted()) {
				System.out.println("已经是停止状态！ 我要退出了！");
				break;//break 不能解决for 循环外部还有语句的情况，此时线程并未结束
//				throw new InterruptedException();	//抛出异常，可以使线程结束
			}
			System.out.println("参数 i =   " + (i+1));
		}
	}
	
	
	
	
	
	
	
//	@Override
//	public void run() {
//		super.run();
//		for(int i=0; i<500000; i++) {
//			System.out.println("参数 i =   " + (i+1));
//		}
//	}
	
	
}
