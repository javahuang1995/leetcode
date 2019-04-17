package com.huang.leetcode.datastruct;

//线性结构和链表结构只是一种结构，并不是一种完整的数据结构描述。真正的数据结构描述行为是队列和栈
//队列是先进先出，栈是先进后出，这体现在他定义的方法上，add/delete
public class Stack {

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
