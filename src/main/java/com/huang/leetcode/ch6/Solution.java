package com.huang.leetcode.ch6;

//编写一个函数来查找字符串数组中的最长公共前缀。
//["","b"]
//如果输入有空字符串的情形，需要考虑下。
//只要有一个字符串为空字符串，那么我就可以返回空字符串！！！
//charAt,insert,deletCharAt 都可能跑出异常，需要谨慎的考虑边界情况然后处理。
//["aa","a"]
//["flower","flow","flight"]
//如果只有一个字符串，就输出他自己。
//代码真是像面条一样。。。也是醉了。
//success
class Solution {
    public String longestCommonPrefix(String[] strs)
    {
        StringBuffer sb = new StringBuffer();


        int minsize = Integer.MAX_VALUE;

        //如果只有一个字符串，直接输出他自己。
        if(strs.length == 1){
            return strs[0];
        }


        //暴力for循环，找到字符串长度最短的那个，最为循环边界。
        for (int i = 0; i < strs.length; i++) {

            String content = strs[i];

            if(content.length() < minsize){
                minsize = content.length();
            }
        }


        int flag = 1;

        for (int i = 0; i < minsize; i++) {
            if(flag == 0){
                break;
            }
            char compare = '\0';

            for (int j = 0; j < strs.length; j++) {

                //如果有空字符串，直接返回""
                if(strs[j].length() == 0){
                    return "";
                }

                if(j == 0){
                    //TODO
                    compare = strs[0].charAt(i);
                    continue;
                }

                //TODO
                if(strs[j].charAt(i) == compare){
                    if(sb.length() == i)
                    {
                        sb.insert(i, compare);
                    }

                    continue;
                }else{

                    if(sb.length() >= i+1){
                        sb.deleteCharAt(i);
                    }
                    //sb.deleteCharAt(sb.length() - 1);
                    //这里应该直接跳出外层循环。。。
                    flag = 0;
                    break;
                }

            }
        }

        return sb.toString();
    }
}