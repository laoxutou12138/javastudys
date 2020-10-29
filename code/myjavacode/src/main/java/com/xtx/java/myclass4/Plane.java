package com.xtx.java.myclass4;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Plane
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/29
 **/
public class Plane implements Fly {
    @Override
    public void fly(String name, int speed) {
        System.out.println(name+"飞行，时速"+speed);
    }
}
