package com.xjhu.study.week3;

/**
 * @author huxinjie
 * @date 2020/10/19 14:22
 */
public class Second {
    public static String sum(int a,int b){
        int sum = a + b;
        int mil = 0;
        int hour = 0;
        if (a <0 || b < 0){
            return "�������";
        }
        while (sum >= 60){
            mil++;
            sum -= 60;
            while (mil >= 60){
                hour++;
                mil -= 60;
            }
        }
        if (mil == 0 && hour == 0){
            return sum + "��";
        }
        else if (hour != 0){
            return hour + "ʱ" + mil + "��" + sum + "��";
        }
        else {
            return mil + "��" + sum + "��";
        }

    }
}
