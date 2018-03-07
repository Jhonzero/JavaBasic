package com.junz.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		iteratorDemo();
	}

	/**
	 * collection simple test
	 */
	public static void collectTest() {
		
//		Iterator
		List ls = new ArrayList<>();
		
		System.out.println("");
		
		
//		Queue
		
//		Iterator ll = new 
		
	}
	
	public static void iteratorDemo(){
	    List<String> list=new ArrayList<String>();
	    list.add("xiaoming");
	    list.add("zhongji");
	    Iterator it=list.iterator();
	    while(it.hasNext()){
	    String str=(String) it.next();
	    System.out.println(str);
	    }
	}
	
	public static void listDemo(){
	    List<String> list=new ArrayList<String>();
	    List<String> list22=new LinkedList<String>();
	    list.add("xiaoming");
	    list.add("zhongji");
	    Iterator it=list.iterator();
	    while(it.hasNext()){
	    String str=(String) it.next();
	    System.out.println(str);
	    }
	}
	
	
	
}
