package com.junz.server.tomcat;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.apache.tomcat.util.digester.Digester;

/**
 * 使用 Digester 
 * @author YY小主
 *
 */
public class DigesterTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department department = null;
		
		Digester digester = new Digester();
		digester.setValidating(false);
		digester.setRulesValidation(false);
		//匹配 department 节点时，创建 Department 对象
		digester.addObjectCreate("department", "com.junz.server.tomcat.Department");
//		digester.addObjectCreate("department", Department.class);
		//匹配 department 节点时，设置对象属性
		digester.addSetProperties("department");
		//匹配 department/user 节点时，创建 User 对象
		digester.addObjectCreate("department/user", "com.junz.server.tomcat.User");
//		digester.addObjectCreate("department/user", User.class);
		//匹配 department/user 节点时，设置对象属性
		digester.addSetProperties("department/user");
		//匹配 department/user 节点时，调用Department 对象的 addUser 方法
		digester.addSetNext("department/user", "addUser", "com.junz.server.tomcat.User");
		
//		//匹配 department/extension 节点时，调用Department 对象的 putExtension 方法
//		digester.addCallMethod("department/extension", "putExtension", 2);
//		//调用方法的第一个参数为节点 department/extension.property-name 的内容
//		digester.addCallParam("department/extension/property-name", 0);
//		//调用方法的第二个参数为节点 department/extension.property-value 的内容
//		digester.addCallParam("department/extension/property-value", 1);
		
		try{
			department = (Department) digester.parse(new File("E:\\YYtry\\project_resources\\xml\\test2.xml"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("haha");
		
		//遍历输出
		int len = department.getUser().size();
		List<User> users = department.getUser();
		for(int i=0; i< len; i++) {
			System.out.println(i + " 个user 的name： " + users.get(i).getName());
			System.out.println(i + " 个user 的code： " + users.get(i).getCode());
		}
		//遍历输出
//		Iterator it = department.
//		Iterator it = department.getList().iterator();
//        while ( it.hasNext()) {
//
//        }
		
	}

}
