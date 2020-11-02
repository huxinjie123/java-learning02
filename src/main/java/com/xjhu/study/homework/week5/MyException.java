package com.xjhu.study.homework.week5;

/**
 * @author huxinjie
 * @date 2020/11/2 15:30
 */
public class MyException extends Exception {
    private String msg;

    public MyException() {
        super();
    }

    public MyException(String msg) {
        super();
        this.msg = msg;
    }

    @Override
    public String toString() {
        return this.msg;
    }
}
