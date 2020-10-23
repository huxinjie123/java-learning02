package com.xjhu.study.test;

/**
 * @author huxinjie
 * @description
 * @date 2020/10/15 18:47
 */

public class Test {
    public static void main(String[] args) {
        Fish redFish = new Fish();
        Lake lake = new Lake();
        lake.setFish(redFish);
        lake.foodFish(120);
        int w = lake.fish.weight;
        Fish fishOk = lake.getFish();
        System.out.println("w:" + w + "" + lake.fish.weight + "" + fishOk.weight);
    }
}
class Fish{
    int weight;
}
class Lake{
    Fish fish;
    void setFish(Fish s){
        fish = s;
    }
    void foodFish(int m){
        fish.weight = fish.weight + m;
    }
    Fish getFish(){
        fish.weight -= 10;
        return fish;
    }
}
