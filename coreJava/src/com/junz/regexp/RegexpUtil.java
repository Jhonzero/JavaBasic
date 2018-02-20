package com.junz.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式工具方法类
 * @author Junz
 *
 */
public class RegexpUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String content = "testContent;+";
		String regex="^[a-zA-Z0-9\u4E00-\u9FA5]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher match=pattern.matcher(content);
		boolean b=match.matches();
		if(b)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("包含非法字符！");
		}
		
	}
	
	
	/**
	 * 
	 */
	

}
