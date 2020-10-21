package com.xtx.java.homework1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName PC
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/21
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PC {
    CPU cpu;
    HardDisk hd;

    void show(){
        System.out.println(this.cpu.speed+" "+this.hd.amount);
    }
}
