package com.huang.leetcode.datastruct;

//所谓链表，无非就是保留一个头结点的引用，然后定义一些增删改查的方法而已。
//就像HashMap里面的Entry链表一样。。。
public class LinkedList
{

    //头结点
    private LinkedNode head;

    //只需要定义size就可以了，不需要定义容量,链表可以无限扩容
    private int size;

    public LinkedList(){

        head = null;
        size = 0;
    }

    //add
    public void add(int v){
        LinkedNode node = new LinkedNode(v);
        size++;

        //头插法
        node.next = head;
        head = node;

    }

    //delete
    //删除头结点算了。。搞得有点像栈了，无所谓。。老子喜欢。
    public void delete(){
        if(size == 0 ){
            return;
        }
        //直接把head指针改一下就完事了。内存自动回收，我不管。
        head = head.next;
        size--;


    }

    //find
    //链表只能根据元素的值查找，因为根本就没有索引。所以查找复杂度必然是O(n)
    public LinkedNode find(int v){

        LinkedNode linkedNode = head;
        while(linkedNode.val != v){
            linkedNode = linkedNode.next;
            if(linkedNode == null){
                return null;
            }
        }

        return linkedNode;
    }






}

class LinkedNode {
    int val;
    LinkedNode next;

    public LinkedNode(int val){
        this.val = val;
        next = null;
    }

    @Override
    public String toString() {
        return String.valueOf(this.val);
    }
}
