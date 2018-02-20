//package com.junz.server.tomcat;
//
//import java.io.IOException;
//
//import org.apache.tomcat.util.digester.Digester;
//import org.xml.sax.SAXException;
//
//public class AreaDigester {  
//    
//    public ViewCache digester() throws Exception {  
//        Digester digester = new Digester();  
//        digester.setValidating(false);  
//        digester.addObjectCreate("viewcache/areas", "ViewCache");  
////        digester.addObjectCreate("viewcache/areas", ViewCache.class);  
//        // 指明匹配模式和要创建的类   
//        digester.addObjectCreate("viewcache/areas/area", "Area");  
//        // 设置对象属性,与xml文件对应,不设置则是默认  
//        digester.addSetProperties("viewcache/areas/area/id", "id");  
//        digester.addBeanPropertySetter("viewcache/areas/area/parentId", "parentId");  
//        digester.addBeanPropertySetter("viewcache/areas/area/name", "name");  
//        digester.addBeanPropertySetter("viewcache/areas/area/areaType", "areaType");  
//        digester.addBeanPropertySetter("viewcache/areas/area/ordering", "ordering");  
//        digester.addBeanPropertySetter("viewcache/areas/area/zip", "zip");  
//        digester.addBeanPropertySetter("viewcache/areas/area/phoneArea", "phoneArea");  
//        // 当移动到下一个标签中时的动作  
//        digester.addSetNext("viewcache/areas/area", "addArea", null);  
//          
//        ViewCache vc = null;  
//        try {  
//            vc = (ViewCache) digester.parse("viewcache.xml");  
//        } catch (IOException e) {  
//            throw new Exception(e);  
//        } catch (SAXException e) {  
//            throw new Exception(e);  
//        }  
//        return vc;  
//    }  
//}
