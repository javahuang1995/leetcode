package com.huang.leetcode.ch2;


import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    /**
     * TDD 先写好测试用例
     * "abcabcbb"
     *  3
     */
    @Test
    public void test(){


        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        Solution solution = new Solution();
        double result = solution.findMedianSortedArrays(nums1, nums2);

        //Assert.assertEquals(2.5,result);

        System.out.println(result);


    }


}
