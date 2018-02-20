package com.junz.dataFormat;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

public class JsonParser {

	public static void main(String[] args) {
		//
		jsonObjectParser();
		
	}

	/**
	 * json对象解析
	 * 使用refactor--rename可以保证所有调用该方法的地方一起修改
	 * 
	 * 解析{}   就用JSONObject
	 * 解析[]   就用JSONArray
	 */
	private static void jsonObjectParser() {
		//创建王小二json对象
		JSONObject wxr = new JSONObject();
		Object nullObj = null;
		try {
			wxr.put("name", "王小二");
			wxr.put("age", 25.2);
			wxr.put("brthday", "1990-01-01");
			wxr.put("school", "蓝翔");
			wxr.put("major", new String[]{"法律","挖掘机"});
			wxr.put("has_girlfriend", false);
			wxr.put("car", nullObj);
			wxr.put("house", nullObj);
			wxr.put("commment", "这是一个注释");
			//print
			System.out.println(wxr.toString());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
	}

}



