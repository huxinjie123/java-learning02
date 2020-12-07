package com.xjhu.study.week9;

import java.io.File;
import java.time.LocalDate;

/**
 * @author huxinjie
 * @date 2020/11/30 14:06
 */
public class FileTest {
    public static void main(String[] args) {
//        File file = new File("D:" + File.separator + "1.txt");
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getName());
//        File dir = new File("C:\\Users\\Tom\\Desktop\\Java");
//        if (!dir.exists()){
//            boolean flag = dir.mkdirs();
//            System.out.println(flag);
//        }
        //创建目录，用当前系统日期命名
//        LocalDate today = LocalDate.now();
//        String data = today.getYear() + "-" + today.getMonthValue() + "-" + today.getDayOfMonth();
//        File dir = new File("C:\\Users\\Tom\\Desktop\\" + data);
//        if (!dir.exists()){
//            boolean flag = dir.mkdirs();
//            System.out.println(flag + "新建目录成功");
//        }
//        //课堂练习1-2：删除刚才创建的目录
//        else {
//            boolean flag = dir.delete();
//            System.out.println(flag + "删除成功");
//        }
        //课堂练习1-3：递归创建目录，顶级目录名：Java  一级目录名：面向对象、异常、集合、io、多线程  io下目录：字符流、字符节
        String[] list = {"面向对象","异常","集合","io","多线程"};
        String[] list2 = {"字符流","字节流"};
        File dir = new File("C:\\Users\\Tom\\Desktop\\java");
        if (!dir.exists()){
            boolean flag = dir.mkdirs();
            System.out.println(flag + "Java目录创建成功");
        }
        for (String s : list){
            File file = new File("C:\\Users\\Tom\\Desktop\\java" +File.separator + s);
            if (!file.exists()){
                boolean flag = file.mkdirs();
                System.out.println(flag + "Java下子目录创建成功");
            }
            if (s.equals("io")) {
                for (String a : list2){
                    File file1 = new File("C:\\Users\\Tom\\Desktop\\java\\io\\" + a);
                    if (!file1.exists()){
                        boolean flag = file1.mkdirs();
                        System.out.println(flag + "io下子目录创建成功");
                    }
                }
            }


        }
        //课堂练习1-1：键盘输入一串文本数据，使用三种方法将其持久化到创建的目录中，文件名用UUID命名

    }
}
