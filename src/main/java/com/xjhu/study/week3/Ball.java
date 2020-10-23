package com.xjhu.study.week3;

import java.util.Random;

/**
 * @author huxinjie
 * @description
 * @date 2020/10/19 16:42
 */
public class Ball extends Circle {
    public Ball(int x,int y, int random){
        super(x,y,random);
    }
    @Override
    void print(){
        System.out.println("????????" + Math.PI * super.getRandom() * super.getRandom() * super.getRandom() * 4 / 3 );
    }
}
