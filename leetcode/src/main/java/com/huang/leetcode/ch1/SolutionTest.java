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
        Assert.assertEquals(2, solution.lengthOfLongestSubstring("ab"));
        Assert.assertEquals(1, solution.lengthOfLongestSubstring("aa"));
        Assert.assertEquals(7, solution.lengthOfLongestSubstring("abcdefg"));
        Assert.assertEquals(1, solution.lengthOfLongestSubstring(" "));
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));


    }


}
