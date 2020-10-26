package com.xjhu.study.week4;

/**
 * @author huxinjie
 * @description
 * @date 2020/10/26 13:56
 */
public class MarketEmployee extends BaseEmployee{
    private String id;
    private static final String ADMIN = "admin";
    private static final int HIGH_SALARY = 3000;
    private static final int LOW_SALARY = 1000;

    public MarketEmployee() {
    }

    public MarketEmployee(String id) {
        this.id = id;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("THis is a MarketEmployee class.");
    }

    @Override
    public int getSalary() {
        if (ADMIN.equals(this.id)){
            return HIGH_SALARY;
        }else{
            return LOW_SALARY;
        }
    }
}
