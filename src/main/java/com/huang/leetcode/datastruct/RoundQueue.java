package com.huang.leetcode.datastruct;

//队列可以是链表实现的，也可以是数组实现的，当然整一个链表队列,为什么？因为老子喜欢链表！！
public class RoundQueue
{
    private int[] array;

    private int front;

    private int rear;

    private int size;
    private int capacity;

    public RoundQueue(int capacity){
        this.size = 0;
        this.array = new int[capacity];

        front = 0;
        rear = -1;
    }


    //add
    public void add(int e) {
        size ++;
        rear = ++rear % size;
        array[rear] = e;

    }

    //delete
    public int delete(){
        size --;
        front = front % size;
        return array[front++];

    }

    //find


}
