package com.junz.collection.map;

import java.util.HashMap;

/**
 * Map 解析
 * @author YY小主
 *
 */
public class ParseMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		HashMap<String, String> map = new HashMap<String, String>();
		
		int n = 100;
		int a = 100;
//		a = a >>> 1;
		a = (a | (a>>>1));
		
		 n |= n >>> 1;
		 
		 System.out.println(n);
		 System.out.println(a);
		
		
	}

	
	
	
}
