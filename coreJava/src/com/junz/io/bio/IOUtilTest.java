package com.junz.io.bio;

import java.io.IOException;

public class IOUtilTest {

	public static void main(String[] args) {

		/**
		 * IOUtilTest1
		 */
//		try {
//			IOUtil.printHex("E:\\YYtry\\javaIOTest\\A\\aaa.txt");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		/**
		 * IOUtilTest2
		 */
		try {
			IOUtil.printHexByByteArray("E:\\YYtry\\javaIOTest\\A\\aaa.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
