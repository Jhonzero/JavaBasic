package com.junz.multiThreadTwo;

/**
 * yield() 方法 
 * @author YY小主
 *	【作用】使线程放弃当前的CPU 资源
 *	【注意】放弃后的时间不确定（即放弃后什么时间获得CPU 时间片的时间不确定）
 *	【注2】 yield() 方法不会阻塞线程，只是让其重新进入就绪状态，可以随时获取CPU时间片开始执行
 *
 */
public class YieldThread extends Thread{

	//
	@Override
	public void run() {
		long beginTime = System.currentTimeMillis();
		int count = 0;
		for(int i=0; i<5000000; i++) {
//			Thread.yield();//使用yield 方法，时间明显增大
			count += i+1;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total time cost : " + (endTime - beginTime) + " ms !");
	}
	
}
