package com.xtx.java.myclass4;

import org.junit.Test;

import static org.junit.Assert.*;

public class SuperStarTest {
    SuperStar ss=new SuperStar("刘德华");

    @Test
    public void actFilm() {
        ss.actFilm();
    }

    @Test
    public void showSing() {
        ss.showSing();
    }

    @Test
    public void showTV() {
        ss.showTV();
    }
    @Test
    public void introduce(){
        ss.introduce();
    }
}