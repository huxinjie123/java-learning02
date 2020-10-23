package com.xjhu.study.test;

/**
 * @author huxinjie
 * @description
 * @date 2020/10/17 22:03
 */
public class Eech {
    public static void main(String[] args) {
        AAA aaa = null;
        System.out.print(AAA.m);
    }
}
class AAA{
    static int m;
    static {
        m = 888;
    }
}
