package com.junz.io.bio;

import java.io.File;
import java.io.IOException;

/**
 * File工具类
 * @author YY小主
 * 列出File的一些常用操作比如过滤、遍历等操作
 */
public class FileUtils {

	/**
	 * 列出指定目录下（包括其子目录）的所有文件
	 */
	public static void listDirectory(File dir) throws IOException{
		if(!dir.exists()){
			throw new IllegalArgumentException("目录："+dir+"不存在！");
		}
		if(!dir.isDirectory()){
			throw new IllegalArgumentException(dir+"不是目录！");
		}
		//list()方法用于列出当前目录下的子目录和文件
//		String[] filenames = dir.list();//返回字符串数组 
//		for(String string:filenames){
////			System.out.println(string);//打印文件夹的名称
//			System.out.println(dir+"\\"+string);//打印目录路径+文件夹名称
//		}
		
//		System.out.println("-----------我是分隔线------------");
		
		//如果要遍历子目录下的内容就需要构造成File对象做递归操作，File提供了直接返回File对象的方法
		File[] files = dir.listFiles();//返回的是直接子目录（文件）的抽象
		if(files != null && files.length > 0){
			for(File file:files){
				if(file.isDirectory()){
					//递归
					listDirectory(file);
				}else{
					System.out.println(file);
				}
			}
		}
		
		
		
		
		
		
	}
	
}
