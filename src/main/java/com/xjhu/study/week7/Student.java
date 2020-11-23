package com.xjhu.study.week7;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author huxinjie
 * @date 2020/11/16 15:05
 */
@Data
@Builder@AllArgsConstructor@NoArgsConstructor
public class Student implements Comparable<Student> {
    private String name;
    private Integer age;
    @Override
    public int compareTo(Student o) {
        return this.getAge().compareTo(o.getAge());
    }
}
