package com.xjhu.study.week9;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author huxinjie
 * @date 2020/11/30 16:11
 */
public class DownloadTest {
    public static void main(String[] args) {
        try {
            download("http://www.quanjing.com/imgbuy/QJ7100016002.html","my.html","C:\\Users\\Tom\\Desktop\\");
        } catch (Exception e) {
            System.err.println("文件下载出现异常");
        }
    }
    public static void download(String urlString,String fileName,String savePath) throws IOException{
        //构建url
        URL url = new URL(urlString);
//打开连接
        URLConnection conn = url.openConnection();
//设置连接请求超时
        conn.setConnectTimeout(5000);
//构建输入流
        InputStream inputStream = conn.getInputStream();
//定义数据缓冲
        byte[] bytes = new byte[1024];
//读取的数据长度
        int len;
//创建文件对象
        File file = new File(savePath);
        if (!file.exists()){
            file.mkdirs();
        }
//构建输出文件流
        OutputStream outputStream = new FileOutputStream(file.getPath() + File.separator + fileName);
//开始读取，每次读取缓冲区大小的字节数
        while ((len = inputStream.read(bytes)) != -1){
            outputStream.write(bytes,0,len);
        }
//关闭连接
        outputStream.close();
        inputStream.close();
    }
}
