package com.xtx.java.myclass3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

/**
 * @ClassName MyCode
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/22
 **/
public class MyCode {
    public static void main(String[] args) {
        //System.out.println(OverLoadTest.sum(3600,365));
        //System.out.println(FormatUtil.format(LocalDate.now()));
        //Circle circle=new Circle();
        Point p1=new Point(1,5);
        Point p2=new Point(4,3);
        System.out.println(p1.compareDistance(p2));

        Circle cl1=new Circle(p1,3);
        System.out.println(cl1.compareCircle(p2));
    }
}
