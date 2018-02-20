package com.junz.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 遍历Map 的几种方式 即分析比较
 * @author YY小主
 *
 */
public class IterateMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
	}
	
	/**
	 * 方式一  for each map.entrySet()
	 * @param map
	 * @return
	 */
	public static boolean foreachEntrySet(Map<String, String> map) {

		//		 Map<String, String> map = new HashMap<String, String>();
		 for (Entry<String, String> entry : map.entrySet()) {
		 	entry.getKey();
		 	entry.getValue();
		 }
		 
		 return false;
	 }
	
	/**
	 * 方式二 显示调用map.entrySet()的集合迭代器
	 * @param map
	 * @return
	 */
	public static boolean iteratorEntrySet(Map<String, String> map) {
		
		Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			entry.getKey();
			entry.getValue();
		}
		 
		 return false;
	 }
	
	/**
	 * 方式三 for each map.keySet()，再调用get获取
	 * @param map
	 * @return
	 */
	public static boolean foreachKeySet(Map<String, String> map) {
		
		for (String key : map.keySet()) {
			map.get(key);
		}
		 
		 return false;
	 }
	
	/**
	 * 方式四  for each map.entrySet()，用临时变量保存map.entrySet()
	 * @param map
	 * @return
	 */
	public static boolean tempForeachEntrySet(Map<String, String> map) {
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			entry.getKey();
			entry.getValue();
		}
		 
		 return false;
	 }
	

}
