package com.xjhu.study.week4;

import java.io.*;
import java.util.Arrays;

/**
 * @author huxinjie
 * @date 2020/10/26 15:31
 */
public class FileReadDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Tom\\Downloads\\123.png");
        InputStream inputStream = new FileInputStream(file) ;
        //Reader reader = new FileReader(file);
        byte[] bytes = new byte[(int) file.length()];
        inputStream.read(bytes);
        File file1 = new File("C:\\Users\\Tom\\Downloads\\13.png");
        OutputStream outputStream = new FileOutputStream(file1);
        outputStream.write(bytes);
        inputStream.close();
        outputStream.close();
    }
}
