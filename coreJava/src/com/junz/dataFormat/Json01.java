//package com.junz.dataFormat;
//
//import org.json.JSONException;  
//import org.json.JSONObject;  
//  
//
///** 
// * JSON-->纯对象(Object)的解析 
// *  
// * 注：我们在eclipse里面操作JSON解析的时候需要第三方jar包的支持 
// * @author sKy° 
// * @date 2016-5-8 
// * @version 1.0 
// */  
//public class Json01 {  
//    public static void main(String[] args) {  
////      编辑一个我们要解析的数据对象  
////     根据JSON的官方定义，键，加"",值，如果是字符串，就加""，其他不加。  
//        String json="{'name':'李书豪','age':24}";  
//  
//        try {  
////          创建JSON解析对象(两条规则的体现:大括号用JSONObject,注意传入数据对象)  
//            JSONObject obj = new JSONObject(json);  
////          obj.后面有各种数据类型,根据对象来选择使用的数据类型  
//            String name = obj.getString("name");  
////          同理如上，这里的age为Int类型，我们就用对应的类型进行解析  
//            int age = obj.getInt("age");  
////          最后输出到控制台  
//            System.out.println(name+"<--->"+age);  
//  
//        } catch (JSONException e) {  
//            e.printStackTrace();  
//        }  
//  
//    }  
//} 