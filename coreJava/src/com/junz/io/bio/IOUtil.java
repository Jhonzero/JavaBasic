package com.junz.io.bio;

import java.io.FileInputStream;
import java.io.IOException;

public class IOUtil {

	/**
	 * 读取指定文件内容，按照16进制输出到控制台
	 * 并且每输出10个byte换行
	 * @param fileNme
	 * @throws IOException 
	 */
	public static void printHex(String fileName) throws IOException{
		//把文件作为字节流进行读操作
		FileInputStream in = new FileInputStream(fileName);
		int b;
		int i = 1;
		while((b = in.read()) != -1){//读到-1就结束
			//单位数前面补0
			if(b < 0xf){
				System.out.print("0");
			}
			//
			System.out.print(Integer.toHexString(b)+" ");
			if(i++%10 == 0){
				System.out.println();
			}
		}
		//关闭流
		in.close();
		
	}
	
	//
	public static void printHexByByteArray(String fileName) throws IOException{
		
		FileInputStream in = new FileInputStream(fileName);
		byte[] buf = new byte[8 * 1024];
		/*
		 * 从in中批量读取字节，放入到buf这个字节数组中；
		 * 从第0个位置开始放，最多放buf.length个；
		 * 返回的是读到的字节的个数。
		 */
//		int bytes = in.read(buf, 0, buf.length);//一次性读完，说明字节数组足够大
//		int j = 1;
//		for(int i=0;i<bytes;i++){
//			if(buf[i] < 0xf){
//				System.out.print("0");
//			}
//			System.out.print(Integer.toHexString(buf[i])+" ");
//			if(j++%10 == 0){
//				System.out.println();
//			}
//		}
		
		//方式二
		int bytes = 0;
		int j = 1;
		while((bytes = in.read(buf, 0, buf.length)) != -1){
			for(int i=0; i<bytes; i++){
				//byte类型为8位，int类型为32位；为了避免数据转换错误，通常 &0xff将高24位清零
				System.out.print(Integer.toHexString(buf[i] & 0xff)+" ");
				if(j++%10 == 0){
					System.out.println();
				}
			}
			
		}
		
		//关闭流
		in.close();
		
	}
	
	
	
	
}
