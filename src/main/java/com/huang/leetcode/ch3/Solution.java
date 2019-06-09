package com.huang.leetcode.ch3;

//把字符串按照每一位转换成数字
//给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
//然后把结果转换成数字。。。
class Solution {
    public String multiply(String num1, String num2) {

        long a = get(num1);
        long b = get(num2);

        long c = a*b;

        return String.valueOf(c);

    }

    public long get(String num){

        long sum = 0;
        int length = num.length();
        for (int i = length - 1; i >= 0 ; i--)
        {
            sum = num.charAt(i)*func(10,length-i-1) + sum;
        }

        return sum;

    }


    public long func(long num,int x){
        if(x<0){
            return 0;
        }
        long result = 1;
        for (int i = 0; i < x; i++) {

            result = result * num;
        }
        return result;
    }
}