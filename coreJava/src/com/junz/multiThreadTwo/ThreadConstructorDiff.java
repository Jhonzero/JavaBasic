package com.junz.multiThreadTwo;

/**
 * 多线程
 * @author YY小主
 *	【目标】用于展示 将线程对象以构造参数的方式传递给Thread对象进行 start() 启动时的注意点
 *	【分析】	差异原因 来自于 Thread.currentThread() 和 this 的差异
 *
 */
public class ThreadConstructorDiff extends Thread{
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ThreadConstructorDiff tcd = new ThreadConstructorDiff();
//		tcd.setName("zero");
//		Thread t1 = new Thread(tcd, "AA");
////		t1.setName("A");
//		t1.start();
//	}
	
	
	public ThreadConstructorDiff() {
		//output the info of Thread by Thread.currentThread()
		System.out.println("printThreadInfo --- begin:");
		System.out.println("currentThreadName : " + Thread.currentThread().getName());
		System.out.println("currentThread isAlive?  : " + Thread.currentThread().isAlive());
		System.out.println("printThreadInfo --- end !");
		
		//output the info of Thread by this
		System.out.println("this.printThreadInfo --- begin:");
		System.out.println("this.getName : " + this.getName());
		System.out.println("this.isAlive?  : " + this.isAlive());
		System.out.println("this.printThreadInfo --- end !");
	}
	
//	public ThreadConstructorDiff(String name) {
//		//output the info of Thread by Thread.currentThread()
//		System.out.println("printThreadInfo --- begin:");
//		System.out.println("currentThreadName : " + Thread.currentThread().getName());
//		System.out.println("currentThread isAlive?  : " + Thread.currentThread().isAlive());
//		System.out.println("printThreadInfo --- end !");
//		
//		//output the info of Thread by this
//		System.out.println("this.printThreadInfo --- begin:");
//		System.out.println("this.getName : " + this.getName());
//		System.out.println("this.isAlive?  : " + this.isAlive());
//		System.out.println("this.printThreadInfo --- end !");
//	}
	
	@Override
	public void run() {
		System.out.println("run --- begin: ");
		System.out.println("currentThreadName : " + Thread.currentThread().getName());
		System.out.println("currentThread isAlive?  : " + Thread.currentThread().isAlive());
		System.out.println("this.printThreadInfo --- begin:");
		System.out.println("this.getName : " + this.getName());
		System.out.println("this.isAlive?  : " + this.isAlive());
		System.out.println("run --- end !");
	}
}
