package com.junz.io.bio;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.RandomAccess;

/**
 * RandomAccessFile
 * @author YY小主
 *
 */
public class RafDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File demo = new File("demo");
		if(!demo.exists()){
			demo.mkdir();
		}
		File file = new File(demo,"raf.dat");
		if(!file.exists()){
			file.createNewFile();
		}
		
		
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		//指针的位置
		System.out.println(raf.getFilePointer());
		
		//
		raf.write('A');
		System.out.println(raf.getFilePointer());
		raf.write('B');
		
		int i = 0x7fffffff;
		//用write方法，每次只能写一个字节，如果要把i写进去就得写4次
		raf.write(i >>> 24);//高8位，右移24位
		raf.write(i >>> 16);//高[9-16]位，右移24位
		raf.write(i >>> 8);//高[17-24]位，右移24位
		raf.write(i);
		System.out.println(raf.getFilePointer());
		
		//可以直接写一个int
		raf.write(i);
		
		//可以直接写一个汉字
		String s= "中";
		byte[] utf = s.getBytes("utf-8");
		raf.write(utf);
		System.out.println(raf.getFilePointer());
		
		/**
		 * 读文件，必须把指针移到头部
		 */
		raf.seek(0);
		//一次性读取，把文件中的内容都读到字节数组中
		byte[] buf = new byte[(int)raf.length()];
		raf.read(buf);//读取到字节数组buf中
		System.out.println(Arrays.toString(buf));
		
		//
		String s1 = new String(buf);
		System.out.println(s1);
		
		//关闭读写操作
		raf.close();
	}

}
