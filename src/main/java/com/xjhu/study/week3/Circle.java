package com.xjhu.study.week3;

/**
 * @author huxinjie
 * @description 圆类
 * @date 2020/10/19 16:10
 */
public class Circle extends Point {
    private Integer random;
    public Circle(){
        System.out.println("圆被初始化");
    }
    public Circle(int x,int y,int random){
        super(x,y);
        this.random = random;
    }
    @Override
    void print(){
        System.out.println("圆的面积：" + Math.PI * random * random);
    }
    public double getArea(){
        return Math.PI * random * random;
    }
    public int getRandom(){
        return random;
    }
}
