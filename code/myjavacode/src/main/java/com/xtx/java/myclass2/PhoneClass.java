package com.xtx.java.myclass2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName phoneClass
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/15
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneClass {
    private String brand;
    private Integer price;
}
