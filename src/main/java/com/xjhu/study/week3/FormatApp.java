package com.xjhu.study.week3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author huxinjie
 * @description
 * @date 2020/10/19 15:02
 */
public class FormatApp {
    public static void main(String[] args) throws InterruptedException, ParseException {
        Date date = new Date();
        System.out.println(FormatUtil.format(date));
        System.out.println(FormatUtil.format(date,"HH:mm:ss"));
        long start = System.currentTimeMillis();
        System.out.println(start);
        Thread.sleep(3000);
        long end = System.currentTimeMillis();
        System.out.println("");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
        long unkown = simpleDateFormat.parse("2020-10-13 16:02:20+0000").getTime();
        System.out.println(unkown);
        System.out.println(Math.abs(unkown - System.currentTimeMillis()) / 1000 / 3600 + "Сʱ");
    }
}
