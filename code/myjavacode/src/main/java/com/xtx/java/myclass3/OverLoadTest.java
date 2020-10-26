package com.xtx.java.myclass3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName OverLoadTest
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/22
 **/
@NoArgsConstructor
public class OverLoadTest {

    public static String sum(String s1, String s2, String s3) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(s1);
        stringBuffer.append(s2);
        stringBuffer.append(s3);
        return stringBuffer.toString();
    }

    public static String sum(int second1, int second2) {
        int a = second1 + second2;
        int hour =a/3600;
        int minute=(a-hour*3600)/60;
        return hour+"时"+minute+"分"+(a-3600*hour-60*minute)+"秒";
        /*if (a <= 60) {
            return a + "秒";
        }
        if (a > 60 && a < 3600) {
            int minute;
            minute = a / 60;
            return minute + "分" + (a - minute * 60) + "秒";
        }
        if (a > 3600) {
            int minute;
            int hour;
            hour = a / 3600;
            minute = (a - 3600 * (a / 3600)) / 60;
            return hour + "小时" + minute + "分" + (a - minute * 60 - hour * 3600) + "秒";
        }*/
       // return null;
    }
}
