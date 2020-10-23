package com.xjhu.study.week2;

import java.util.Date;

/**
 * @author huxinjie
 * @descrip
 * @date 2020/10/12 15:55
 */
public class TestGroup {
    public static void main(String[] args) {
        Book book = new Book("java",99,new Date());
        Book book1 = new Book("javascript",99,new Date());
        Book book2 = new Book("java从入门到精通",99,new Date());
        Book book3 = new Book("java大神养成记",99,new Date());
        Book book4 = new Book("java宝典",99,new Date());

        Phone phone = new Phone("iphone8",8888);
        Phone phone1 = new Phone("iphone8plus",9999);
        Phone phone2 = new Phone("iphone11",18888);

        Student student1 = new Student("1001","张三","男",phone,new Book[]{book,book1,book2,book3});
        Student student2 = new Student("1002","李四","男",phone1,new Book[]{book4,book1,book2,book3});
        Student student3 = new Student("1003","王二麻子","女",phone2,new Book[]{book,book1,book2,book4});

        Group group = new Group("大头儿子",new Student[]{student1});
        Group group2 = new Group("小头爸爸",new Student[]{student2,student3});

//        System.out.println(group);
//        System.out.println("**********************");
        Student[] students = group2.getStudents();
        for (Student student:students){
            System.out.println(student.getStudentName());
        }

    }
}
