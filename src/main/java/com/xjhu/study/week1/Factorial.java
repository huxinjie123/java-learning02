package com.xjhu.study.week1;

/**
 * @author huxinjie
 * @date 2020/10/5 16:40
 */
public class Factorial {
    public static int factorial(int n){
        if (n ==1){
            return n = 1;
        }
        else if (n == 0){
            return n = 0;
        }
        else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(factorial(n));

    }
}
