package com.xtx.java.myclass2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName studentClass
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/15
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentClass {
    private String id;
    private String studentName;
    private String gender;
    private PhoneClass phone;
    private List<BookClass> books;
}
