package com.junz.multiThread;

//create a second thread by extending Thread
public class NewThread extends Thread{
	/**
	 * 构造函数中的super()方法，会调用一下形式的Thread构造函数    
	 *  public Thread(String threadName);//threadName指定了线程的名称
	 */
	
	NewThread(){
		//Create a new, second thread
		super("Demo Thread");
		System.out.println("Child thread: " + this);
		start(); //start the thread
	}
	
	//This is the entry point for the second thread.
	public void run(){
		try{
			for(int i = 5; i>0; i--){
				System.out.println("Child Thread:" + i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e){
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
}
