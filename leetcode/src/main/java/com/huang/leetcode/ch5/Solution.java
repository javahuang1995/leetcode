package com.huang.leetcode.ch5;

//判断括号是否有效
//输入: "()[]{}"
//输出: true
//"{[]}" 大的可以包括小的，这个逻辑有问题fuck
//解决一个问题，是否可以找到这个问题的规律，找到主线，这是分析能力。
//对称，是一种抽象的描述，如何具象成程序描述语言？？
//用堆栈
class Solution {

    public boolean isValid(String s)
    {
        if(s == null){
            return false;
        }
        if(s.length()%2!=0){
            return false;
        }

        Stack stack1 = new Stack(100000);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack1.push(ch);
            }else{
                char cc = stack1.pop();
                if(cc == '0'){
                    return false;
                }
                else if(judge(ch,cc)){
                    continue;
                }else{
                    return false;
                }
            }

        }

        if(stack1.size == 0){
            return true;
        }else{
            return false;
        }

    }

    private boolean judge(char ch, char cc)
    {
        if (cc == '(' && ch == ')' || cc == '{' && ch =='}' || cc =='[' && ch == ']') {
            return true;
        }
        return false;
    }

    class Stack {

        private char[] array;
        private int size;
        private int capacity;

        public Stack(int capacity) {
            size = 0;
            this.capacity = capacity;
            array = new char[capacity];
        }

        public void push(char c) {
            array[size++] = c;

        }

        public char pop() {
            if (size == 0) {
                return '0';
            }
            char ch = array[--size];
            return ch;

        }

    }



}

//    public boolean isValid(String s)
//    {
//        //如果是奇数个字符，肯定是false
//        if(s.length()%2!=0){
//            return false;
//        }
//        char a;
//        char b;
//        for (int i = 0; i < s.length(); i++)
//        {
//            a = s.charAt(i);
//            b = s.charAt(i + 1);
//
//            if (a == '(' && b==')') {
//                return true;
//
//            } else if (a == '[' && b==']') {
//                return true;
//
//            } else if (a == '{' && b=='}') {
//                return true;
//
//            }else{
//                return false;
//            }
//
//        }
//
//        return false;
//
//    }
