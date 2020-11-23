package com.xjhu.study.week7;

        import java.sql.SQLOutput;
        import java.util.ArrayList;
        import java.util.Iterator;
        import java.util.List;

/**
 * @author huxinjie
 * @date 2020/11/16 14:19
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(8);
        list.add("javascript");
        list.add("java");
        list.add("javascript");
        int r = (int) (Math.random()*3);
        System.out.println(list.get(r));
        System.out.println("用for循环遍历list");
        for (String s : list){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("用Iterator迭代器遍历list");
        Iterator<String> iterable = list.iterator();
        while (iterable.hasNext()){
            System.out.print(iterable.next() + " ");
        }
        System.out.println();
        System.out.println("用lambda表达式遍历list");
        list.forEach(s -> System.out.println(s));
        System.out.println("使用lambda的方法应用来遍历list，终极简单版本");
        list.forEach(System.out::println);
    }
}
