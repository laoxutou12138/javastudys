package com.xtx.java.myclass4;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlyTest {
    Fly fly=new Bird();
    @Test
    public void fly() {
        fly.fly("NM",20);
        fly=new Plane();
        fly.fly("NB",25);
    }
}