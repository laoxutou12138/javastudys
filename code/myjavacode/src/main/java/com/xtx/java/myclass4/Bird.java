package com.xtx.java.myclass4;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Bird
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/29
 **/
public class Bird implements Fly{
    @Override
    public void fly(String name, int speed) {
        System.out.println(Fly.Name+","+Fly.Speed);
        System.out.println(name+"飞行，时速"+speed);
    }
}
