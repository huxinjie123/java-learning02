package com.xjhu.study.week7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author huxinjie
 * @date 2020/11/16 16:38
 */
public class MapTest2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Tom","CoreJava");
        map.put("John","Oracle");
        map.put("Susan","Oracle");
        map.put("Jerry","Unix");
        map.put("Jim","JSP");
        map.put("Kevin","JSP");
        map.put("Lucy","JDBC");

        map.put("Allen","JDBC");
        //Lucy改为教CoreJava
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String,String> entry : entrySet){
            String key = entry.getKey();
            if (key.equals("Lucy")){
                entry.setValue("CoreJava");
            }
        }
        System.out.println("方法一");
        for (Map.Entry<String,String> entry : entrySet){
            System.out.println("老师：" + entry.getKey() + "，课程：" + entry.getValue());
        }
//        System.out.println("方法二");
//        Set<String> set = map.keySet();
//        for (String key : set){
//            String value = map.get(key);
//            System.out.println("老师：" + key + "，课程：" + value);
//        }
        System.out.println("lambda表达式遍历：");
        map.forEach((key,value) -> {
            System.out.println("老师：" + key + "，课程：" + value);
        });
        System.out.println("输出所有教JDBC的老师");
        for (Map.Entry<String,String> entry : entrySet){
            if (entry.getValue().equals("JDBC")){
                System.out.println(entry.getKey());
            }
        }
    }

}
