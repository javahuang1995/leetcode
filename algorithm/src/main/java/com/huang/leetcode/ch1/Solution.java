package com.huang.leetcode.ch1;

import java.util.HashMap;


//会发财的大佬都会喜欢做算法题，我也是。
public class Solution {

    //"abcabcbb"
    public int lengthOfLongestSubstring(String s) {

        HashMap hashMap = new HashMap();
        int max = 0;
        if( s == null){
            return 0;
        }

        //1.
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!hashMap.containsKey(ch)){
                hashMap.put(ch, i);
                max++;
            }else{
                int start = (Integer)hashMap.get(ch);
                int end = i;
                int gap = end - start;
                if(gap > max){
                    max = gap;
                }
                hashMap.remove(ch);
                hashMap.put(ch,i);

            }

        }
        return max;
    }
}
