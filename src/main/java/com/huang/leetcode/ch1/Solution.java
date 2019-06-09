package com.huang.leetcode.ch1;

import java.util.HashMap;

//abc
//3. 无重复字符的最长子串 "abcabcbb" 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
//"abcabcbb"
//"pwwkew" 3
//"au" 2
//"dvdf" 3
//if分之条件过多，就是圈复杂度太大。。
//success
public class Solution {

    //"abcabcbb"
    public int lengthOfLongestSubstring(String s) {

        HashMap hashMap = new HashMap();
        int max = 0;
        if( s == null){
            return 0;
        }
        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        //1.
        int i = 0;

        /**
         * 用一个hashMap保存已经读取的数据。key是ch,value是位置。
         * 如果hashMap里面没有已经读取过的字符，put
         * 如果出现重复字符，那么i向左移动到重复字符的下一个位置 i = (Integer) hashMap.get(ch) + 1;
         */
        while (i < s.length()) {
            char ch = s.charAt(i);
            if(!hashMap.containsKey(ch)){
                hashMap.put(ch, i);
                i++;
            }
            else {
                //i向左移动
                i = (Integer) hashMap.get(ch) + 1;

                //clear
                hashMap.clear();

            }

            //如果出现重复元素，那么当前最大的子串应该是前面那一截。
            if(hashMap.size() > max){
                max = hashMap.size();
            }


        }

        //不适用for循环，因为i指针需要灵活移动，有的时候需要往左边移动。
//
//        for(int i = 0;i<s.length();i++){
//            char ch = s.charAt(i);
//            if(!hashMap.containsKey(ch)){
//                hashMap.put(ch, i);
//                max = hashMap.size();
//            }
//            else {
//                //如果出现重复元素，那么当前最大的子串应该是前面那一截。
//                if(hashMap.size() > max){
//                    max = hashMap.size();
//                }
//
//                //更新ch位置
//                hashMap.clear();
//                hashMap.put(ch,i);
//
//            }
//
//        }
        return max;
    }
}