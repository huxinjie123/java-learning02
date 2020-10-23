package com.xjhu.study.Computer;

/**
 * @author huxinjie
 * @description
 * @date 2020/10/17 22:10
 */
public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        cpu.setSpeed(2020);
        HardDisk hardDisk = new HardDisk();
        hardDisk.setAmount(200);
        PC pc = new PC();
        pc.setCpu(cpu);
        pc.setHardDisk(hardDisk);
        String s = pc.show();
        System.out.println(s);
    }
}
