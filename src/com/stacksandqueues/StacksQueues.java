package com.stacksandqueues;

public class StacksQueues {
    Node head;
    Node tail;

    public boolean isEmpty(){
        return head==null && tail==null;
    }
    void addinQueue(int num){
        Node newNode = new Node(num);
        if (tail==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+"<--");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
