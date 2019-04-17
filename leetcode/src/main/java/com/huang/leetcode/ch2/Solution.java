package com.huang.leetcode.ch2;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int a = nums1[nums1.length - 1];
        int b = nums2[nums2.length - 1];

        int big[] = new int[nums1.length+nums2.length];
        if(a>=b)
        {
            for (int i = 0; i < nums1.length; i++) {
                big[i] = nums1[i];
            }
            for (int i = 0; i < nums2.length; i++) {
                big[i] = nums2[i];
            }
        }
        else
        {
            for (int i = 0; i < nums2.length; i++) {
                big[i] = nums2[i];
            }
            for (int i = 0; i < nums1.length; i++) {
                big[i] = nums1[i];
            }

        }

        //3.
        int mid = (nums1.length+nums2.length)/2;
        return (big[mid - 1] + big[mid +1])/2;

    }
}