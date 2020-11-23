package com.xjhu.study.week7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author huxinjie
 * @date 2020/11/16 15:42
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(8);
        map.put("apple",12);
        map.put("pear",8);
        map.put("banana",24);
        System.out.println(map);
        for (String key:map.keySet()){
            System.out.println(key + "单价为：" + map.get(key));
        }
        System.out.println("iterator遍历");
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + "单价为：" + entry.getValue());
        }
        System.out.println("通过遍历map的entrySet，遍历Key和Value，推荐使用");
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "单价为：" + entry.getValue());
        }
        System.out.println("通过遍历map的values，只能遍历value，获取不到key");
        for (Integer value : map.values()){
            System.out.println(value);
        }
        System.out.println("lambda表达式遍历，强烈推荐！！");
        map.forEach((key,value) -> System.out.println("key:" + key + ",value:" + value));
    }
}
