package com.xjhu.study.week3;

/**
 * @author huxinjie
 * @description
 * @date 2020/10/19 20:15
 */
public class Multiplication {
    public static void main(String[] args) {
        for (int i = 1;i <= 9;i++){
            for (int j = 1;j <= i;j++){
                System.out.print(i + "*" + j + "=" + i*j + "  " + " ");
            }
            System.out.println();
        }
    }

}
