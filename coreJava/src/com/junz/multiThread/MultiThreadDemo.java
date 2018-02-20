package com.junz.multiThread;

public class MultiThreadDemo {

	public static void main(String[] args) {
		// 

		new NewThreadImpl("One");//start threads
		new NewThreadImpl("Two");
		new NewThreadImpl("Three");
		
		try{
			//wait for otherthreads to 
			Thread.sleep(10000);
		}catch(InterruptedException e){
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}

}
