package com.junz.io.bio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * 文件访问
 * @author YY小主
 *	1、读取文件
 *	1）单字节、2）字节数组、3）单字符、4）字符数组
 *	
 *	2、写入文件
 *	1）单字节、2）字节数组、3）单字符、4）字符数组
 *
 *	3、随机访问
 *	
 */
public class ReadOrWriteDemo {

	public static void main(String[] args) throws IOException {
		//1-调用写入方法
//		writeFileAsByte();
//		writeFileAsByteArray();
		
//		writeFileAsChar();
		writeFileAsCharArray();
		
		
		//2-调用读取方法
//		readFileAsByte();
//		readFileAsByteArray();
		
//		readFileAsChar();
		readFileAsCharArray();

	}


	
	
	
	//-------------------读取文件--------------------------	
	/**
	 * 01-单字节读取
	 */
	public static void readFileAsByte() throws IOException {
		String filepath = "fileDemo.bin";
		java.io.InputStream is = null;
		try {
			is = new FileInputStream(filepath);
			int data = -1;
			while ((data = is.read()) != -1) {// -1 表示读取到达文件结尾
				//操作数据
				System.out.print((byte)data + " ");
			}
		} finally {
			if (is != null) {
				is.close();// 关闭流
			}
		}
	}
	
	/**
	 * 02-字节数组读取
	 */
	public static void readFileAsByteArray() throws IOException {
		String filepath = "fileDemo1.bin";
		java.io.InputStream is = null;
		try {
			is = new BufferedInputStream(new FileInputStream(filepath));// 组装BufferedInputStream流，加入缓冲能力
			byte[] data = new byte[256];
			int len = -1;
			while ((len = is.read(data)) != -1) {// -1 表示读取到达文件结尾
				//操作数据
				for (int i = 0; i < len; i++) {
					System.out.print(data[i] + " ");
				}
			}
		} finally {
			if (is != null) {
				is.close();// 关闭流
			}
		}
	}
	
	/**
	 * 03-单字符读取
	 */
	public static void readFileAsChar() throws IOException {
		String filepath = "fileDemo.txt";
		java.io.Reader r = null;
		try {
			r = new FileReader(filepath);
			int data = -1;
			while ((data = r.read()) != -1) {// -1 表示读取到达文件结尾
				//操作数据
				System.out.print((char) data);
			}
		} finally {
			if (r != null) {
				r.close();// 关闭流
			}
		}
	}
	
	/**
	 * 04-字符数组读取
	 */
	public static void readFileAsCharArray() throws IOException {
		String filepath = "fileDemo1.txt";
		java.io.Reader r = null;
		try {
			r = new BufferedReader(new FileReader(filepath));// 组装BufferedReader流，加入缓冲能力
			char[] data = new char[256];
			int len = -1;
			while ((len = r.read(data)) != -1) {// -1 表示读取到达文件结尾
				//操作数据
				for (int i = 0; i < len; i++) {
					System.out.print(data[i]);
				}
			}
		} finally {
			if (r != null) {
				r.close();// 关闭流
			}
		}
	}
	
	//-------------------写入文件--------------------------	
	/**
	 * 11-单字节写入
	 */
	public static void writeFileAsByte() throws IOException {
		String filepath = "fileDemo.bin";
		java.io.OutputStream os = null;
		try {
			os = new FileOutputStream(filepath);
			os.write('1');
			os.write('2');
			os.write('3');
			os.write('4');
			os.write('A');
			os.write('a');
			os.flush();// 把缓冲区内的数据刷新到磁盘
			
		} finally {
			if (os != null) {
				os.close();// 关闭流
			}
		}
	}
	
	/**
	 * 12-字节数组写入
	 */
	public static void writeFileAsByteArray() throws IOException {
		String filepath = "fileDemo1.bin";
		java.io.OutputStream os = null;
		try {
			os = new BufferedOutputStream(new FileOutputStream(filepath));
			// 模拟
			byte[] data = new byte[256];
			new Random().nextBytes(data);//随机数
			
			os.write(data);
			os.flush();// 把缓冲区内的数据刷新到磁盘
		} finally {
			if (os != null) {
				os.close();// 关闭流
			}
		}
	}
	
	/**
	 * 13-单字符写入
	 */
	public static void writeFileAsChar() throws IOException {
		String filepath = "fileDemo.txt";
		java.io.Writer w = null;
		try {
			w = new FileWriter(filepath);
			w.write('1');
			w.write('2');
			w.write('3');
			w.write('4');
			w.flush();// 把缓冲区内的数据刷新到磁盘
			
		} finally {
			if (w != null) {
				w.close();// 关闭流
			}
		}
	}
	
	/**
	 * 14-字符数组写入
	 */
	public static void writeFileAsCharArray() throws IOException {
		String filepath = "fileDemo1.txt";
		java.io.Writer w = null;
		try {
			w = new BufferedWriter(new FileWriter(filepath));// 组装BufferedWriter流，加入缓冲能力
			// 模拟
			char[] data = new char[256];
			String f = "0123456789abcdefghijklmnopqrstuvwxyz";
			Random rd = new Random();
			for (int i = 0; i < data.length; i++) {
				data[i] = f.charAt(rd.nextInt(f.length()));
			}
			w.write(data);
			w.flush();// 把缓冲区内的数据刷新到磁盘
		} finally {
			if (w != null) {
				w.close();// 关闭流
			}
		}
	}
	
	
	
}
