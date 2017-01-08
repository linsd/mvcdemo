package com.lsd.mvc.demo1.hello;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Created by lsd on 2017/1/8.
 */
public class HelloTest {

    @Test
    public void testSay() {
        String msg = new Hello().say();
        System.out.println(msg + " " + new Date());
        Assert.assertEquals("Hello World!", msg);
    }
}
