package com.xjhu.study.week5;

import java.io.*;

/**
 * @author huxinjie
 * @date 2020/11/2 14:47
 */
public class ExceptionTest2 {
    public static void main(String[] args) {
//        File file = new File("C:\\Users\\Tom\\Pictures\\Saved Pictures\\2.jpg");
//        try {
//            InputStream inputStream = new FileInputStream(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            System.err.println(e.getMessage());
//        }
        try {
            byte[] bytes = readFile("C:\\Users\\Tom\\Pictures\\Saved Pictures\\3.jpg");
            System.out.println(bytes.length);
        } catch (IOException e) {
            System.err.println("出现IO异常！！");
        }finally {
            System.out.println("无论有无异常都会执行的代码段");
        }
        System.out.println("其他代码");
    }
    /**
     * 用throws关键字在方法签名处声明异常
     *
     * @param path: 文件路径
     * @return bytes:字节数组
     * @throws IOException
     */

    public static byte[] readFile(String path) throws IOException {
        File file = new File(path);
        byte[] bytes = new byte[(int) file.length()];
        InputStream inputStream = new FileInputStream(file);
        int result = inputStream.read(bytes);
        System.out.println(result);
        inputStream.close();
        return bytes;
    }
}
