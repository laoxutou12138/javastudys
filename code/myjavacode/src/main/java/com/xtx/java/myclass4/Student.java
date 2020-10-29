package com.xtx.java.myclass4;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Student
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/29
 **/
public class Student implements MyComparable{
    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object obj) {
        Student other= (Student) obj;
        return this.name.compareTo(other.name);
    }
}
