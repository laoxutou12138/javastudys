package com.xtx.java.myclass5;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;
import java.awt.*;
import java.time.Year;
import java.util.Scanner;

/**
 * @ClassName RunTimeException
 * @Description TODO
 * @Author Administrator
 * @Date 2020/11/05
 **/
public class RunTimeException {
    public static void main(String[] args) {
        //1.ArithmeticException 算数异常
        try{
            System.out.println(3 / 0);
        }catch (ArithmeticException exception){
            System.err.println("除数不能为0");
            System.err.println(exception.getMessage());
            System.err.println(exception.getCause());
            System.err.println(exception);
            exception.printStackTrace();
            JOptionPane.showMessageDialog(null,"除数不能为0");
        }

        //2.从键盘输入一串字符，将其转为整型输出
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int result=0;
        boolean flag= true;
        try{
            result=Integer.parseInt(str);
        }catch(NumberFormatException numberFormatException){
            JOptionPane.showMessageDialog(null,"请输入数字");
        }
        finally {
            //应用场景：关闭数据库链接，线程资源的释放，流的关闭
            System.out.println("finally");
            sc.close();
        }
        System.out.println(result);
        System.out.println("其他代码段");
        System.out.println(flag);

        //3.仿照完成ArrayIndexOutOfBoundsException的异常处理
        Integer[] a=new Integer[5];
        try{
            System.out.println(a[6]);
        }catch(ArrayIndexOutOfBoundsException exception){
            JOptionPane.showMessageDialog(null,"超出数组范围");
        }

        //4.关于空指针异常NullPointerException（NPE）的问题
       String s=null;
        try{

        }catch(NullPointerException exception){

        }
        if("admin".equals(s)){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }

        //BlankString
        if(s==null||"".equals(s)){
            System.out.println("账号不能为空");
        }
        System.out.println("其他代码段");
    }
}
