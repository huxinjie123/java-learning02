package com.xjhu.study.Computer;

/**
 * @author huxinjie
 * @description
 * @date 2020/10/17 22:10
 */
public class PC {
    private CPU cpu;
    private HardDisk hardDisk;

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String show() {
        return "CPU�ٶȣ�" + cpu.getSpeed() + ",HD������" + hardDisk.getAmount();
    }
}
