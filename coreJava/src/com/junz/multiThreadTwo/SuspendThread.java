package com.junz.multiThreadTwo;

/**
 * 线程暂停和线程恢复 suspend 、resume
 * @author YY小主
 * 【缺点】
 * 	1、独占：	资源独占，一旦线程被暂停，后续的线程将无法继续访问该资源（尤其是同步方法）
 * 		--独占分析：同步时获取资源获得锁，本暂停后，锁未释放，且因为被暂停永远都不会释放锁，
 * 		     	      后面线程也就无法访问该资源
 *  2、不同步（同 stop，资源操作未完成线程被暂停或者退出，其他线程再访问该资源时，访问的是操作过的数据）
 *  
 *  【注1】suspend 和 resume 被淘汰的原因：
 *  1）天生的易死锁特性 	2）安全检查容易抛出安全异常
 *
 */
public class SuspendThread extends Thread{

	private long count = 0;
	
	
	public long getCount() {
		return count;
	}


	public void setCount(long count) {
		this.count = count;
	}


	@Override
	public void run() {
		while(true) {
			count ++;
		}
	
	}
	
 }
