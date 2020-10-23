package com.xjhu.study.test;

/**
 * @author huxinjie
 * @description
 * @date 2020/10/17 19:12
 */
public class Tom {
    static int sum;
    int getSum(int ... item){
        for (int n:item){
            sum += n;
        }
        return sum;
    }
}
class E{
    public static void main(String[] args) {
        Tom tom1 = new Tom();
        Tom tom2 = new Tom();

        int resultTwo = tom2.getSum(10,30);
        int resultOne = tom1.getSum(1,2,3,4);
        System.out.println(resultOne + ":" + resultTwo);
    }
}
