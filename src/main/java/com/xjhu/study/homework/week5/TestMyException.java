package com.xjhu.study.homework.week5;

/**
 * @author huxinjie
 * @date 2020/11/2 15:54
 */
public class TestMyException {
    public static void main(String[] args) {
        Book book1 = new Book("1234567891357","暴力美学",30);
        Book book2 = new Book("123456789246a","健美力学",130);
        Book book3 = new Book("123456","健美",25);
        Book book4 = new Book("1234567892468","健美力学",30);
        BookService bookService = new BookServiceImpl();
        boolean result = false;
        try {
            result = bookService.BookUpload(book4);
        }catch (MyException e){
            System.err.println(e.toString());
        }finally {
            System.out.println("上传结束");
        }
        if (result){
            System.out.println("上传成功");
        }else {
            System.out.println("上传失败");
        }
    }
}
