package com.junz.io.bio;

import java.io.UnsupportedEncodingException;

public class EncodeDemo {

	/**
	 * 关于编码
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException{
		String s = "慕课网ABC";
		byte[] bytes = s.getBytes();//转换成字节序列,用的是项目默认的编码utf-8
		/* utf-8一个汉字用三个字节表示，英文用一个字节表示 	*/
		for(byte b:bytes){
			//把字节(转换成int)以16进制显示
			System.out.print(Integer.toHexString(b & 0xff)+" ");
		}
		
		System.out.println();
		byte[] byte2 = s.getBytes("gbk");
		/* gbk一个汉字用两个个字节表示，英文用一个字节表示 	*/
		for(byte b:byte2){
			//把字节(转换成int)以16进制显示
			System.out.print(Integer.toHexString(b & 0xff)+" ");
		}
		
		//Java是双字节编码 （utf-16be）
		System.out.println();
		byte[] byte3 = s.getBytes("utf-16be");
		/* utf-16be一个汉字用两个个字节表示，英文用两个字节表示 	*/
		for(byte b:byte3){
			//把字节(转换成int)以16进制显示
			System.out.print(Integer.toHexString(b & 0xff)+" ");
		}
		
		System.out.println();
		/**
		 * 当字节序列是某种编码时，这个时候想把字节序列标称字符串，
		 * 也需要使用这种编码，否则会出现乱码
		 */
		String str1 = new String(byte3);
		System.out.println(str1);
		String str2 = new String(byte3,"utf-16be");//第二个参数指定编码方式
		System.out.println(str2);
		
		/**
		 * 1.文本文件  就是字节序列，可以使任意编码的字节序列
		 * 2.如果在中文机器上直接创建文本文件，那么该文本文件只是别ANSI编码
		 * 3.复制的文件，或者拷贝的内容不会出现这种情况
		 */
		
	
	}
}
