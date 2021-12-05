package com.bjpowernode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Description:
 * @author: killua
 * @date:2021/12/2-21:23
 */
public class TestHelloMaven {
    @Test
    public void testAddNumber(){
        HelloMaven maven = new HelloMaven();
        int res = maven.addNumber(10, 20);
        Assert.assertEquals(30,res);

    }
}
