package com.xjhu.study.week4;

/**
 * @author huxinjie
 * @description
 * @date 2020/10/26 14:31
 */
public class OtherEmployee extends BaseEmployee{
    @Override
    public void print() {
        super.print();
        System.out.println("THis is a OtherEmployee class.");
    }

    @Override
    public int getSalary() {
        return 0;
    }
}
