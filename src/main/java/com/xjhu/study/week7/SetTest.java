package com.xjhu.study.week7;

import java.util.*;

/**
 * @author huxinjie
 * @date 2020/11/16 14:40
 */
public class SetTest {
    public static void main(String[] args) {
        System.out.println("hashSet");
        Set<String> strings = new HashSet<>();
        strings.add("a");
        strings.add("n");
        strings.add("a");
        System.out.println("用for循环遍历");
        Object[] array = strings.toArray();
        for (Object o : array){
            System.out.println(o.toString());
        }
        System.out.println("用Iterator迭代器遍历");
        Iterator<String> iterable = strings.iterator();
        while (iterable.hasNext()){
            System.out.println(iterable.next());
        }
        System.out.println("用lambda表达式遍历");
        strings.forEach(s -> System.out.println(s));
        System.out.println("使用lambda的方法应用来遍历，终极简单版本");
        strings.forEach(System.out::println);
        System.out.println("treeSet的例子");
        Student student1 = Student.builder().name("许大脑袋").age(19).build();
        Student student2 = Student.builder().name("许锋大傻子").age(21).build();
        Set<Student> objects = new TreeSet<>();
        objects.add(student2);
        objects.add(student1);
        System.out.println(objects);
    }
}
