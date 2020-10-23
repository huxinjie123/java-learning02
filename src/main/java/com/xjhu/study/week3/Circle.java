package com.xjhu.study.week3;

/**
 * @author huxinjie
 * @description Բ��
 * @date 2020/10/19 16:10
 */
public class Circle extends Point {
    private Integer random;
    public Circle(){
        System.out.println("Բ����ʼ��");
    }
    public Circle(int x,int y,int random){
        super(x,y);
        this.random = random;
    }
    @Override
    void print(){
        System.out.println("Բ�������" + Math.PI * random * random);
    }
    public double getArea(){
        return Math.PI * random * random;
    }
    public int getRandom(){
        return random;
    }
}
