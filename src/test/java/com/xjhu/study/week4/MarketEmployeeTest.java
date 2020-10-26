package com.xjhu.study.week4;

import lombok.var;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author huxinjie
 * @description
 * @date 2020/10/26 14:15
 */
public class MarketEmployeeTest {

    @Test
    public void print() {
        MarketEmployee marketEmployee = new MarketEmployee("admin");
        marketEmployee.print();
    }

    @Test
    public void getSalary() {
        MarketEmployee marketEmployee = new MarketEmployee("admin");
        var salary = marketEmployee.getSalary();
        assertEquals(3000,salary);
    }
}