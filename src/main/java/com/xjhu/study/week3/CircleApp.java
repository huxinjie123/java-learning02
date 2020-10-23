package com.xjhu.study.week3;

/**
 * @author huxinjie
 * @description
 * @date 2020/10/19 16:21
 */
public class CircleApp {
    public static void main(String[] args) {
        Point point = new Point(1,1);
        Circle circle = new Circle(10,20,30);
        point.print();
        circle.print();
        Cylinder cylinder = new Cylinder(10,20,10,10);
        cylinder.print();
        Ball ball = new Ball(10,10,10);
        ball.print();
        Point point1 = new Point(4,5);
        double d = Point.length(point,point1);
        System.out.println("两点间长度：" + d);
        double r = Point.length(point1,circle);
        System.out.println(r);
        if (r <= circle.getRandom()){
            System.out.println("在圆内");
        }
        else {
            System.out.println("不在园内");
        }
    }
}
