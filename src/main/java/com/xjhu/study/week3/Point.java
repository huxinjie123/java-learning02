package com.xjhu.study.week3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author huxinjie
 * @description
 * @date 2020/10/19 16:09
 */
//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
public class Point {
    private Integer x;
    private Integer y;
    public Point(){
        System.out.println("点被初始化");
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    void print(){
        System.out.println("横坐标：" + this.x + "纵坐标：" + this.y);
    }
    static double length(Point point,Point point1){
        double c = 0;
        double i = Math.pow((point.x - point1.x),2);
        double j = Math.pow((point.y - point1.y),2);
        c = Math.sqrt(i + j);
        return c;
    }
}
