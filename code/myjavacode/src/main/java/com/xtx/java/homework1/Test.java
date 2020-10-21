package com.xtx.java.homework1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName E
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/21
 **/
public class Test {
    public static void main(String[] args){
        AAA a=null;
        System.out.printf("%d:%d",AAA.m,a.m);

        CPU cpu=CPU.builder()
                .speed(2200).build();
        HardDisk disk=HardDisk.builder()
                .amount(200).build();
        System.out.println();
        PC pc=PC.builder().cpu(cpu).hd(disk).build();
        pc.show();
    }
}
