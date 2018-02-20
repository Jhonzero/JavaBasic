package com.junz.reflection;

import java.lang.reflect.Array;

/**
 * 
 * @author YY小主
 *
 */
public class ArrayTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dims[] = new int[]{5,10,15};
		Object array = Array.newInstance(Integer.TYPE, dims);
		//使用arrayObj 引用 array[3]
		Object arrayObj = Array.get(array, 3);
		Class cls = arrayObj.getClass().getComponentType();
		System.out.println(cls);
		
		//使用 arrayObj 引用array[3][5]
		arrayObj = Array.get(arrayObj, 5);
		//把元素 array[3][5][10] 设置为37
		Array.setInt(arrayObj, 10, 37);
		int arrayCast[][][] = (int[][][])array;
		System.out.println(arrayCast[3][5][10]);
		
	}

}
