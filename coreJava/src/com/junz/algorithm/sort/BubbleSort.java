package com.junz.algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡 排序（交换排序）
 * @author YY小主
 *
 */
/**
 * 算法思路：
 * void bubbleSort(int a[], int n){  
	    for(int i =0 ; i< n-1; ++i) {  
	        for(int j = 0; j < n-i-1; ++j) {  
	            if(a[j] > a[j+1])  
	            {  
	                int tmp = a[j] ; a[j] = a[j+1] ;  a[j+1] = tmp;  
	            }  
	        }  
	    }  
  } 
 *
 */

public class BubbleSort {

	public static void main(String[] args) {
		//1、 一维数组
		int[] data = {2,4,8,4,6,1};
		System.out.println("一维数组排序之前：\n" + java.util.Arrays.toString(data));
		oneBubbleSort(data);
		System.out.println("一维数组排序之后：\n" + java.util.Arrays.toString(data));
		
		//2、多维数组
		int[][] datass = {{1,3}, {2,6}, {6,7}, {6,5}, {2,8}, {1,2}};
//		System.out.println("二维数组排序之前：\n" + java.util.Arrays.toString(datass));
		System.out.println("二维数组排序之前：\n" + datass);
		multiBubbleSort(datass);
		System.out.println("二维数组排序之后：\n" + datass);
		
	}
	
	/**
	 * 一维数组排序算法（从小到大排序）
	 * 
	 * @param a[] 一维数组
	 * @param n   表示数组的长度
	 * 
	 */
	public static void oneBubbleSort(int a[]) {
		int len = a.length;
		int modCount = 0;//交换次数
		
		for(int i =0 ; i< len-1; ++i) {  
	        for(int j = 0; j < len-i-1; ++j) {  
	        	modCount++;
	            if(a[j] > a[j+1])  
	            {  
	                int tmp = a[j] ; a[j] = a[j+1] ;  a[j+1] = tmp;  
	            }  
	        }  
	    }
		
		System.out.println("比较次数为：" + modCount);//输出比较次数
	}
	
	/**
	 * 多维数组
	 */
	public static void multiBubbleSort(int a[][]) {
		int len = a.length;
		int[] temp = {0, 0}; 
		//遍历
		for(int i=0; i<len-1; i++) {
			for(int j=0; j<len-1-i; j++) {
				if(a[j][0] > a[j+1][0]) {
//					temp[0] = a[j][0];
//					Arrays.copyOf(buffer, buffer.length);
					temp = a[j];
					a[j] = a[j+1] ; 
					a[j+1] = temp;
				}else if(a[j][0] == a[j+1][0]) {
					temp[1] = a[j][1];
					a[j][1] = a[j+1][1] ; 
					a[j+1][1] = temp[1];
				}
			}
		}
	}
	
	
	/**
	 * 冒泡排序的改进
	 */
	
	
	
	//--------------------工具方法----------------------
	/**
	 * 数组交换
	 */
//	public static arrayList exchangeArray() {
//		
//		
//		return null;
//	}
	
	
	
}
