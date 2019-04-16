package com.huang.leetcode.algorithm;

//数组需要连续的内存空间，所以这个连续的内存空间就必须要有个容量
//因为内存都是有限的，不可能给你分配无限的内存空间。。如果满了，就需要扩容，分配一块更大的连续内存然后复制过去。
public class ArrayList {

    private int capacity;

    private int size;

    private Integer[] array;

    public ArrayList(int capacity){
        array = new Integer[capacity];
        size = 0;
    }


    //add
    public void add(int v){
        array[size++] = v;
    }


    //find 可以根据索引查找数据。这是最快的一种find方式
    //当然你也可以写一个根据元素的值来查找的find方法，那个查找复杂度就是O(n)了，
    // 但是我们仍然说数组的查找效率高，因为我们不care按照元素的值查找。。
    public Integer find(int index){
        if(size == 0){
            return null;
        }

        return array[index];
    }


    //delete
    public void delete(){
        array[--size] = null;
    }

}
