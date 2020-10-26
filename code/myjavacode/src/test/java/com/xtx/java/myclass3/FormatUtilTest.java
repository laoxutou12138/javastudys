package com.xtx.java.myclass3;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class FormatUtilTest {
    @Test
    public void format() {
        String actual=FormatUtil.format(new Date());
        String expected="2020-10-22 11:24:50";
    }

    @Test
    public void testFormat() {
        String actual=FormatUtil.format(new Date(),"yy-MM-dd");
        String expected="2020-10-22 11:24:50";
    }
}