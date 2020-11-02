package com.xjhu.study.week5;

import javax.xml.transform.Result;
import java.util.Scanner;

/**
 * @author huxinjie
 * @date 2020/11/2 14:16
 */
public class ExceptionTest1 {
    public static void main(String[] args) {
        //1
//        int Result = 0;
//        try {
//            Result = 3 / 0;
//        }catch (ArithmeticException e){
//            System.err.println("除数不能为0！！" + "\n" + e.getMessage());
////            e.printStackTrace();
//        }
//        System.out.println(Result);

        //2
//        int[] arr = new int[]{1,2,3,4,5,6};
//        int a = 0;
//        try {
//            a = arr[6];
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.err.println("下标越界");
//            System.err.println(e.getMessage());
//        }
//        System.out.println(a);
        //3
        System.out.println("请输入价格：");
        Scanner scanner = new Scanner(System.in);
        String price = scanner.nextLine();
        int pri = 0;
        try {
            pri = Integer.parseInt(price);
        } catch (NumberFormatException e) {
            System.err.println(e.getCause() + "\n" + e.getMessage());
            System.err.println("数字格式化异常");
        }
        System.out.println(pri);
    }
}
