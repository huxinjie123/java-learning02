package com.xjhu.study.week4;

/**
 * @author huxinjie
 * @description
 * @date 2020/10/26 13:39
 */
public abstract class BaseEmployee {
    public void print(){
        System.out.println("this is a abstract class.");
    }

    /**
     * ������
     * @return int
     */
    //����ǩ��
    public abstract int getSalary();
}
