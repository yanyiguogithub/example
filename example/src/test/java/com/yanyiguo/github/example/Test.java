package com.yanyiguo.github.example;

import org.junit.Assert;

/**
 * @Title Test
 * @Description example 单元测试类
 * @Author yanyiguo
 * @Date 2022/6/10
 */
public class Test {

    @org.junit.Test
    public void testTrue(){
        Assert.assertTrue("预期结果为真",true);
    }
    @org.junit.Test
    public void testFalse(){
        Assert.assertFalse("预期结果为假",false);
    }
}
