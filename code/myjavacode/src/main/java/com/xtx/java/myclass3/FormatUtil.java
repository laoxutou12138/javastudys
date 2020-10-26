package com.xtx.java.myclass3;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * @ClassName FormatUtil
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/22
 **/
public class FormatUtil {
    public synchronized static String format(Date date){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
    public synchronized static String format(Date date,String pattern){
        SimpleDateFormat sdf=new SimpleDateFormat(pattern);
        return sdf.format(date);
    }
}
