package com.junz.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Iterator功能 测试类
 * @author YY小主
 *
 */
public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		start();
	}
	
	
	
	
	
	/**
	 * start 方法
	 */
	public static void start() {
		//get the list
		List<Integer> alst = getList("ArrayList");
		List<Integer> llst = getList("LinkedList");
		
		//remove element
		//way-1	 with normal for
		int na1for = removeEventVer1(alst);
		int nl1for = removeEventVer1(llst);
		System.out.println(na1for);
		System.out.println(nl1for);
		
		
		System.out.println("-------------");
		
		//way-2  with strengthen for
		int na2sfor = removeEventVer2(alst);
		int nl2sfor = removeEventVer2(llst);
		System.out.println(na2sfor);
		System.out.println(nl2sfor);
		
	}
	
	
	/**
	 * 01-普通遍历
	 * ArrayList  	O(N^2)
	 * LinkedList	O(N^2)
	 */
	public static int removeEventVer1(List<Integer> lst) {
		int i = 0;
		int step = 0;
		while(i < lst.size()) {
			if(lst.get(i) % 2 == 0) {
				lst.remove(i);
			}else {
				i++;
			}
			step++;
		}
		
		return step;
	}
	
	/**
	 * 02-增强for循环中的 remove
	 * ArrayList  	O(N^2)
	 * LinkedList	O(N^2)
	 */
	public static int removeEventVer2(List<Integer> lst) {
		int step = 0;
		for(Integer x : lst) {
			if(x % 2 == 0) {
				lst.remove(x);
			}
			step++;
		}
		return step;
	}

	/**
	 * 03-iterator 遍历
	 * ArrayList  	O(N^2)
	 * LinkedList	O(N)
	 */
	public static void removeEventVer3(List<Integer> lst) {
		
		Iterator<Integer> itr = lst.iterator();
		
		while(itr.hasNext()) {
			if(itr.next() % 2 ==0) {
				itr.remove();
			}
		}
	}
	
	/**
	 * 获取Arraylist
	 */
	public static List<Integer> getList(String type) {
		List<Integer> list = null;
		if("ArrayList".equals(type)) {
			list = new ArrayList<Integer>();
		}else if("LinkedList".equals(type)) {
			list = new LinkedList<Integer>();
		}
		
		//遍历给数组赋值
		for(int i=0; i <10; i++) {
			list.add(i);
		}
		
		return list;
	}
}
