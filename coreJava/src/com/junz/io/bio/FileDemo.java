package com.junz.io.bio;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// 了解构造函数的情况  查帮助
		File file = new File("C:\\Users\\YY小主\\Desktop\\JavaIO11111");
//		File file1 = new File("C:"+File.separator);//设置分隔符
//		System.out.println(file.exists());//判断文件是否存在
		//
		if(!file.exists()){
			file.mkdir();//创建文件或文件夹，file.mkdirs();//创建多级目录
		}else{
			file.delete();//删除文件或文件夹
		}
		
		//判断是否是一个目: 如果是目录，则返回true,如果不是目录或者目录不存在则返回false
		System.out.println(file.isDirectory());
		//判断是否是一个文件
		System.out.println(file.isFile());
		
		
//		File file2 = new File("C:\\Users\\YY小主\\Desktop\\日记.txt");
		File file2 = new File("C:\\Users\\YY小主\\Desktop","日记.txt");
		if(!file2.exists()){
			try{
				file2.createNewFile();//创建新的文件
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}else{
			file2.delete();
		}
		
		//常用的File对象的API
		System.out.println(file);//file.toString()的内容，即文件路径
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());//获取文件名称
		System.out.println(file.getParent());//获取父对象文件路径
		System.out.println(file.getParentFile().getAbsolutePath());
		
	}

}
