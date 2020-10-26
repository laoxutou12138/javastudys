package com.xtx.java.myclass3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Point
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/22
 **/
public class Point {
    private int x;
    private int y;
    public Point(){
        System.out.println("point被初始化");
    }
    public Point(int a,int b){

    }

}
