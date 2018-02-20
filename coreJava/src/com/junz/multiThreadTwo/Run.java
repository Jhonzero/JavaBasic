package com.junz.multiThreadTwo;



/**
 * 多线程主方法
 * @author YY小主
 *
 */
public class Run {

	public static void main(String[] args) {
		// 【1】 测试线程的名称和线程是否存活
//		testThreadConstructorDiff();
		
		// 【2】 测试 停止线程的相关内容
//		testInterruptThread();
//		testIsInterruptThread();
		
		// 【3】暂停和恢复 线程
//		testSuspendThread();
		
		// 【4】yield 使线程放弃CPU 资源
		testYieldThread();
		
		
		
		
		
	}
	
	
	/**
	 * 【1】 测试线程名称 和 线程是否存活
	 */
	public static void testThreadConstructorDiff() {
		
		ThreadConstructorDiff tcd = new ThreadConstructorDiff();
//		ThreadConstructorDiff tcd = new ThreadConstructorDiff("I'm the zero");
		Thread t1 = new Thread(tcd, "AA");
		System.out.println("main begin t1 isAlive = " + t1.isAlive());
//		t1.setName("A");
		t1.start();
		System.out.println("main end t1 isAlive = " + t1.isAlive());
	}
	
	/**
	 * 【2-1】 测试 停止线程的相关内容
	 * 	interrupted()
	 */
	public static void testInterruptThread() {
		try{
			InterruptThread ithread = new InterruptThread();
			ithread.start();
			Thread.sleep(500);
			ithread.interrupt();
//			Thread.currentThread().interrupt();
			System.out.println("当前线程为 ： " + Thread.currentThread().getName());
			System.out.println("是否停止1 ：=  " + Thread.interrupted());
			System.out.println("是否停止2 ：=  " + Thread.interrupted());
			
		} catch (InterruptedException e) {
			System.out.println("catch exception : ");
			e.printStackTrace();
		}
		
		System.out.println("end");
	}
	
	
	/**
	 * 【2-2】 测试 停止线程的相关内容
	 * 	isInterrupted()
	 *  查看结果，与遍历的量大小、sleep 时长有关系
	 */
	public static void testIsInterruptThread() {
		try{
			InterruptThread ithread = new InterruptThread();
			ithread.start();
			Thread.sleep(1000);
			ithread.interrupt();
//			Thread.currentThread().interrupt();
//			System.out.println("当前线程为 ： " + Thread.currentThread().getName());
			System.out.println("是否停止1 ：=  " + ithread.isInterrupted());
			System.out.println("是否停止2 ：=  " + ithread.isInterrupted());
			
		} catch (InterruptedException e) {
			System.out.println("catch exception : ");
			e.printStackTrace();
		}
		
		System.out.println("end");
	}
	
	
	/**
	 * 【3】暂停线程 和 恢复线程
	 * 	suspend 和 resume
	 */
	@SuppressWarnings("deprecation")
	public static void testSuspendThread() {
		try{
			SuspendThread st = new SuspendThread();
			st.start();
			Thread.sleep(5000);
			//A 段
			st.suspend();//暂停线程
			System.out.println("A =  " + System.currentTimeMillis() + "  count = " + st.getCount());
			Thread.sleep(5000);
			System.out.println("A =  " + System.currentTimeMillis() + "  count = " + st.getCount());
			
			//B 段
			st.resume();
			Thread.sleep(5000);
			
			//C 段
			st.suspend();
			System.out.println("C =  " + System.currentTimeMillis() + "  count = " + st.getCount());
			Thread.sleep(5000);
			System.out.println("C =  " + System.currentTimeMillis() + "  count = " + st.getCount());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
		
	}
	
	
	/**
	 * 【4】yield 使线程放弃CPU 资源
	 * 
	 */
	public static void testYieldThread() {
		//
		YieldThread yt = new YieldThread();
		yt.start();
				
	}
	
	
	
	

}
