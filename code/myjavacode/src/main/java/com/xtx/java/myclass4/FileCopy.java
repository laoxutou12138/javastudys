package com.xtx.java.myclass4;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.print.DocFlavor;
import java.io.*;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.UUID;

import static java.nio.charset.StandardCharsets.*;

/**
 * @ClassName 使用IO流实现文件的复制
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/29
 **/
public class FileCopy {
    public static void main(String[] args) {

        try {
            File file=new File("C:/Users/Administrator/Desktop/mycode.txt");
            InputStream is=new FileInputStream(file);
            InputStreamReader isr=new InputStreamReader(is);
            char[] ch=new char[(int)file.length()];
            int a=isr.read(ch);
            System.out.println(Arrays.toString(ch));
            System.out.println(a);
            File file2=new File("C:/Users/Administrator/Desktop/"+ UUID.randomUUID().toString() +".txt");
            OutputStream os=new FileOutputStream(file2);
            OutputStreamWriter ost=new OutputStreamWriter(os, UTF_8);
            ost.write(ch);
            isr.close();
            ost.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
  /*      //将源文件读入内存数组
        File file=new File("C:/Users/Administrator/Desktop/geek.exe");
        try {
            InputStream is=new FileInputStream(file);
            byte[] b=new byte[(int)file.length()];
           int a=is.read(b);
            System.out.println(Arrays.toString(b));
            System.out.println(a);

        //将内存数组中的值写到目标文件

        File file2=new File("C:/Users/Administrator/Desktop/"+ UUID.randomUUID().toString() +".exe");
            OutputStream os=new FileOutputStream(file2);
            os.write(b);
            is.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
