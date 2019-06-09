package com.huang.leetcode.ch2;

import java.util.Arrays;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * 则中位数是 (2 + 3)/2 = 2.5
 */
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] array = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            array[i] = nums1[i];
        }
        for (int j = 0; j < nums2.length; j++) {
            array[nums1.length + j] =nums2[j];
        }

        //然后还需要排序？？？时间复杂度就算用最快的快速排序，也有O(n*log(m+n))
        //这个思路不符合题目要求。
        Arrays.sort(array);


        //因为这里做除法运算需要返回double数据类型，所以要除以2d,表示2是double,类型转换一下。
        if (array.length % 2 == 0) {
            return (array[array.length / 2 ] + array[array.length / 2 -1])/2d;
        }else{

            return array[(array.length - 1) / 2];
        }


//        ablockCode = (s) -> System.out.println("hi");
    }
}