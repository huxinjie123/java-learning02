package com.xjhu.study.week3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author huxinjie
 * @description
 * @date 2020/10/19 15:06
 */
public class MyDate extends Date {
    @Override
    public String toString(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(this);
    }

    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        System.out.println(myDate);
    }
}
