package com.junz.jvm.memoryModel;

import java.util.ArrayList;
import java.util.List;


public class Demo {

	public byte[] placeholder = new byte[64 * 1024];
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		fillHeap(1000);
		
		System.out.println("开始执行GC！");
		System.gc();
	}
	
	public static void fillHeap(int num) throws InterruptedException {
		
		List<Demo> list = new ArrayList<Demo>();
		//
		System.out.println("开始创建！！！");
		
		for(int i=0; i < num; i++) {
			//稍作延时，令监视曲线的变化更加明显
			Thread.sleep(50);
			list.add(new Demo());
		}
		
//		System.out.println("开始执行GC！");
//		System.gc();
	}

}
