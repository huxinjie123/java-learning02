package com.xjhu.study.week2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author huxinjie
 * @date 2020/10/12 14:20
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String name;
    private Integer price;
    private Date publishDate;

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String date = simpleDateFormat.format(new Date());
        return "《" + this.name + "》,价格：" + this.price + ",Date:" + date;
    }

    public static void main(String[] args){
        Book book = new Book("java",122,new Date());
        System.out.println(book.toString());
    }


}

