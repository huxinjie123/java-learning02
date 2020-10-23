package com.xjhu.study.week3;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author huxinjie
 * @Description
 * @date 2020/10/19 14:59
 */
public class FormatUtil {
    public static String format(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(date);
    }
    public static String format(Date date,String regex){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(regex);
        return simpleDateFormat.format(date);
    }
    public static String format(double number){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(number);
    }
    public static String format(double number,String pattern){
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        return decimalFormat.format(number);
    }
    public synchronized static String format(Date date, Locale locale){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",locale);

        return "";
    }
}
