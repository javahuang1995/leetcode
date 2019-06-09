package com.huang.leetcode.ch6;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test(){
        Solution solution = new Solution();
        String[] array = {"c","acc","ccc"};
        String result = solution.longestCommonPrefix(array);
        Assert.assertEquals("fl",result);
    }

    @Test
    public void test2(){
        StringBuffer sb = new StringBuffer();

        //因为长度为0，当index大于或者等于长度的时候，就会跑出异常。所以index为0，当里面没有元素的时候，会报错。
        System.out.println(sb.toString().charAt(0));
    }
}