package com.xjhu.study.homework.week5;

/**
 * @author huxinjie
 * @date 2020/11/2 15:29
 */
public class Book {
    private String ISBN;
    private String name;
    private int price;

    public Book() {
    }

    public Book(String ISBN, String name, int price) {
        this.ISBN = ISBN;
        this.name = name;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
