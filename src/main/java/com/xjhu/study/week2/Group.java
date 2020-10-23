package com.xjhu.study.week2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author huxinjie
 * @descrip
 * @date 2020/10/12 15:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Group {
    private String groupName;
    private Student[] students;
}
