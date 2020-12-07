package com.xjhu.study.week9;

import java.io.*;
import java.util.Scanner;
import java.util.UUID;

/**
 * @author huxinjie
 * @date 2020/11/30 15:56
 */
public class TxtFileTest {
    public static void main(String[] args) throws IOException {
        //将键盘输入的一串文本保存到文件中
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入: ");
        String s = scanner.nextLine();
        char[] chars =s.toCharArray();
        String fileName = UUID.randomUUID().toString();
        File dts = new File("C:\\Users\\Tom\\Desktop\\" + fileName + ".txt");
        //File file = new File("C:\\Users\\Tom\\Desktop\\test.txt");
        Writer writer = new FileWriter(dts,true);
        writer.write(chars);
        writer.close();
    }
}
