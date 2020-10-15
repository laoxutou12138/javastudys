package com.xtx.java.myclass2;

import lombok.*;

import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName bookClass
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/15
 **/
//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookClass {
    private String bookName;
    private Integer price;
    private Date bookDate;

    @Override
    public String toString() {
        DateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now=sdf.format(this.bookDate);
        String s1="book{name:%s,price:%s;date:%s}";
        return String.format(s1,bookName,price,now);
    }
}
