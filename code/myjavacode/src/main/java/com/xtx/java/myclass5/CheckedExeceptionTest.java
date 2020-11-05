package com.xtx.java.myclass5;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

/**
 * @ClassName CheckedExeceptionTest
 * @Description TODO
 * @Author Administrator
 * @Date 2020/11/05
 **/
public class CheckedExeceptionTest {
    public static void main(String[] args) throws InterruptedException {
        //转换为yyyy-MM-dd HH:mm:ss 格式
        //使用Date和SimpleDateFormat实现：线程不安全

        System.out.println(System.currentTimeMillis());

        for (int i = 0; i < 100; i++) {
            Thread.sleep(1000);
            System.out.println(MyRandom());
        }
    }

    private static int MyRandom() {
        Random rd = new Random();
        return rd.nextInt(100);
    }

    private static void TimeFormat() {
        System.out.println(new Date().getTime());
        System.out.println(System.currentTimeMillis());
        long timeStamp = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            System.out.println(sdf.format(timeStamp));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //使用LocalDateTime和DateTimeFormat实现：线程安全
        Instant instant = Instant.ofEpochMilli(timeStamp);
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String result = localDateTime.format(formatter);
        System.out.println(result);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        {
            System.out.println("中断异常");
        }
    }
}
