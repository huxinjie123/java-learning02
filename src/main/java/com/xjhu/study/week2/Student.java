package com.xjhu.study.week2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author huxinjie
 * @descrip
 * @date 2020/10/12 15:51
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    private String id;
    private String studentName;
    private String gender;
    private Phone phone;
    private Book[] books;
}
