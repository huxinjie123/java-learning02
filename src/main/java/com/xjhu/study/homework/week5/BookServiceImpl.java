package com.xjhu.study.homework.week5;

import java.util.regex.Pattern;

/**
 * @author huxinjie
 * @date 2020/11/2 15:46
 */
public class BookServiceImpl implements BookService {
    @Override
    public boolean BookUpload(Book book) throws MyException {
        boolean b = false;
        if (book.getISBN().length() != 13 || !Pattern.compile("[0-9]*").matcher(book.getISBN()).matches()){
            throw new MyException("图书编号必须为13位数字！");
        }else if (book.getName().contains("暴力")){
            throw new MyException("图书名称含有禁忌文字！！");
        }
        else if (book.getPrice() > 100){
            throw new MyException("图书价格太过昂贵！");
        }else {
            b = true;
        }
        return b;
    }
}
