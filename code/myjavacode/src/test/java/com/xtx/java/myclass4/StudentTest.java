package com.xtx.java.myclass4;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    MyComparable m;

    @Test
    public void compareTo() {
        News news=new News(001,"大事件","nihaolihai","校园新闻",5647);
        News news1=new News(002,"大122事件","nihaolih333ai","校园新441闻",564755);
        m=news;
       int a= m.compareTo(news1);
       assertEquals(-559108,a);
        System.out.println(a);
        System.out.println("********");
        Student s1=new Student("ada",122);
        Student s2=new Student("aba",321);
        m=s1;
        a=m.compareTo(s2);
        System.out.println(a);
        assertEquals(2,a);
    }
}