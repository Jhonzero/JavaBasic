package com.junz.juc.atomic;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.junit.Test;

public class Demo {

	@Test
	public void test() {
		
		basicAtomicTest();
		atomicArrayTest();
		
	}
	
	
	/**
	 * 基本类型
	 */
	public void basicAtomicTest() {
		
		//int 常见用法
		AtomicInteger ati = new  AtomicInteger(2);
		System.out.println("*******int******");
		System.out.println(ati.get());
		ati.set(8);
		System.out.println(ati.getAndSet(6));
		System.out.println(ati.getAndAdd(2));
		System.out.println(ati.getAndIncrement());
		System.out.println(ati.getAndDecrement());
		System.out.println(ati.addAndGet(3));
		System.out.println(ati.incrementAndGet());
		System.out.println(ati.decrementAndGet());
		System.out.println(ati.doubleValue());
		
		//boolean
		AtomicBoolean atb = new AtomicBoolean(false);
		atb.set(true);
		System.out.println("*******Boolean******");
		System.out.println(atb.get());
		atb.lazySet(false);
		System.out.println(atb.getAndSet(true));
		System.out.println(atb.getClass());
		System.out.println(atb.get());
		System.out.println(atb.toString());
		
		//long
		AtomicLong atl = new AtomicLong();
		System.out.println("*******long******");
		atl.set(8);
		System.out.println(atl.getAndSet(6));
		System.out.println(atl.getAndAdd(2));
		System.out.println(atl.getAndIncrement());
		System.out.println(atl.getAndDecrement());
		System.out.println(atl.addAndGet(3));
		System.out.println(atl.incrementAndGet());
		System.out.println(atl.decrementAndGet());
		System.out.println(atl.getClass());
		System.out.println(atl.toString());
		
	}

	/**
	 * 数组类型
	 */
	public void atomicArrayTest() {
	
		String s = "11";
		String a = "a";
		
		StringBuffer ab = new StringBuffer();
		
		System.out.println("");
		
		StringBuffer sb = new StringBuffer();
		
	}
	
	
}
