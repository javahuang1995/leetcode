package com.huang.leetcode.ch1;

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


        Solution solution = new Solution();
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));

        Assert.assertEquals(2, solution.lengthOfLongestSubstring("au"));

        Assert.assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));


    }


}
