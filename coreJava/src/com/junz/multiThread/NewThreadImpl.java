package com.junz.multiThread;

//Create multiple threads.
public class NewThreadImpl implements Runnable{

	String name;//name of thread
	Thread t;
	
	NewThreadImpl(String threadName){
		name = threadName;
		t = new Thread(this, name);
		System.out.println("New Thread:" + t);
		t.start();
	}
	
	@Override
	public void run() {
		// 
		try{
			for(int i = 5; i>0; i--){
				System.out.println(name + " :" + i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println(name + " interrupted.");
		}
		System.out.println(name + " Exiting.");
	}
	
	
}
