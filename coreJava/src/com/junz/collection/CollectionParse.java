package com.junz.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 集合相关--解析集合
 * @author YY小主
 *
 */
public class CollectionParse {

	/**
	 * 定义验证字符串
	 * 此处列举常见的非法字符部分，并未列出所有情形
	 * 【思路】1-正则过滤所有非法字符，2-在过滤数据库关键字
	 */
	public static final String regStr = "'|and|exec|insert|select|delete|update|count|*|%|chr|mid|master|truncate|char|declare|;|or|--|+|,";
	public static final String regStr_ids = "'|and|exec|insert|select|delete|update|count|*|%|chr|mid|master|truncate|char|declare|;|or|--|+";//用于验证ids传参类型
	
	/**
	 * main 方法
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Object> amap = new HashMap<String, Object>();
		amap.put("objId", "1234569874563211223");
		amap.put("date", "2017-08-28");
		amap.put("name", "jerry");
		amap.put("age", "28");
		amap.put("weight", "65");
		amap.put("address", "南京市浦口区");
		amap.put("call", "025-36541258");
		
		boolean bl = map_check_illegal_normal(amap);
		
		System.out.println(bl);
		
		//定义一个 mapList 
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		list.add(amap);
		boolean bl_two = list_check_illegal_normal(list);
		System.out.println(bl_two);
		
	}
	
	
	/**
	  * 解析传参、验证传参是否包含非法字符
	  * 适用于通用参数,通过entrySet()
	  * 用于参数格式：Map<String, Object> map
	  * @param map
	  */
	 public static boolean map_check_illegal_normal(Map<String, Object> map) {
		 //解析传参
		 int size = map.size();//获取map的长度
		 boolean bl;
		 
		 for(Entry<String, Object> entry : map.entrySet()) {
			//1-获取键和值
			String key = entry.getKey();
			String val = entry.getValue().toString();
			//2-判断是否包含非法字符
			//判断是否包含主键 objId列
			if("objId".equals(key)){
				bl = sql_inj_ids(val);
			}else {
				bl = sql_inj(val);
			}
			//验证
			if(bl) {
				return true;
			}
		 }
		 
		 return false;
	 }
	 
	
	 /**
	  * 解析传参、验证传参是否包含非法字符
	  * 适用于通用参数，通过keySet()
	  * 用于参数格式：Map<String, Object> map
	  * @param map
	  */
//	 public static boolean map_check_illegal_normal(Map<String, Object> map) {
//		 //解析传参
//		 int size = map.size();//获取map的长度
//		 Object[] keys = null;//key集合
//		 boolean bl;
//		 
//		 for (int i = 0; i < size; i++) {
//            keys = map.keySet().toArray();//获取map 的key集合
//            for (int j = 0; j < map.size(); j++) {
//            	 //遍历获取map中 key对应的value值
//                String val = map.get(keys[j]).toString();
//                //判断是否包含主键 objId列
//                if("objId".equals(keys[j].toString())){
//               	 bl = sql_inj_ids(val);
//                }else {
//               	 bl = sql_inj(val);
//                }
//                //验证
//                if(bl) {
//               	 return true;
//                }
//            }
//        }
//		 
//		 return false;
//	 }
	 
	 
	 /**
	  * 解析传参、验证传参是否包含非法字符
	  * 适用于通用参数
	  * 用于参数格式：List<Map<String, Object>>()
	  * 格式统一要求：如果有主键列，统一主键列为 objId，否则无法过滤
	  * @param list
	  */
	 public static boolean list_check_illegal_normal(List<Map<String, Object>> list) {
		 
		 for (int i = 0; i < list.size(); i++) {
			 Map<String, Object> map = list.get(i);
			
			//解析传参
			 int size = map.size();//获取map的长度
			 Object[] keys = null;//key集合
			 boolean bl;
			 
			 for (int k = 0; k < size; k++) {
	            keys = map.keySet().toArray();//获取map 的key集合
	            for (int j = 0; j < map.size(); j++) {
	            	 //遍历获取map中 key对应的value值
	                String val = map.get(keys[j]).toString();
	                //判断是否包含主键 objId列
	                if("objId".equals(keys[j].toString())){
	               	 bl = sql_inj_ids(val);
	                }else {
	               	 bl = sql_inj(val);
	                }
	                //验证
	                if(bl) {
	               	 return true;
	                }
	            }
	        }
		 }
		 
		 return false;
	 }
	
	 
		
		/**
	 	 * sql注入校验
	 	 * 校验传参参数是否包含非法字符
	 	 * 适用于通用参数
	 	 * @param str
	 	 * @return
	 	 */
		 public static boolean sql_inj(String str)
		 {
			 //非空判断
			 if(str == null) {
				 return false;
			 }
			 //遍历验证
			 String[] inj_stra = regStr.split("\\|");
			 for (int i=0 ; i < inj_stra.length ; i++ ) {
				 if (str.indexOf(inj_stra[i])>=0) {
					 return true;
				 }
			 }
			 return false;
		 }	
		
		 
	   /**
		 * sql注入校验
		 * 验证id类等是否包含非法字符
		 * @param str
		 * @return
		 */
		 public static boolean sql_inj_ids(String str)
		 {
			//非空判断
			 if(str == null) {
				 return false;
			 }
			 //遍历验证
			 String[] inj_stra = regStr_ids.split("\\|");
			 for (int i=0 ; i < inj_stra.length ; i++ ) {
				 if (str.indexOf(inj_stra[i])>=0) {
					 return true;
				 }
			 }
			 return false;
		 }

}
