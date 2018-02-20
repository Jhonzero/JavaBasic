package com.junz.io.bio.jbyte;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * 字节输入输出流 - 字节数组
 * 
 * 【注1】生成随机数在用流读取时产生乱码的原因，思考下！！
 * 【注2】汉字是如何存储的
 * 
 */
public class ByteIOTest2 {

	public static void main(String[] args) throws IOException {
		
//		byte[] source = new byte[128];
//		new Random().nextBytes(source);
		
		String str = "This is a bug!";
		byte[] source = str.getBytes();
		
		java.io.ByteArrayOutputStream os = null;
		try {
			os = new ByteArrayOutputStream();

			os.write(source);
			
			System.out.println(new String(os.toByteArray(), "utf-8"));
		} finally {
			if (os != null) {
				os.close();// 关闭流
			}
		}

		java.io.InputStream is = null;
		try {
			is = new ByteArrayInputStream(source);

			int data = -1;
			while ((data = is.read()) != -1) {
				//操作数据
				System.out.print((char) data);
			}
		} finally {
			if (is != null) {
				is.close();// 关闭流
			}
		}
	}

}
