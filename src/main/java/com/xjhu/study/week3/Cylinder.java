package com.xjhu.study.week3;

/**
 * @author huxinjie
 * @description
 * @date 2020/10/19 16:32
 */
public class Cylinder extends Circle {
    private Integer h;
    public Cylinder(){}
    public Cylinder(int x,int y,int random,int h){
        super(x,y,random);
        this.h = h;
    }
    @Override
    void print(){
        super.print();
        System.out.println("圆柱体的体积：" + super.getArea() * this.h);
    }
}
