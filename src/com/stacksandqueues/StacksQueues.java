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
    int peak(){
        if (head==null){
            System.out.println("is null.");
        }
        return head.data;
    }
    public void pop() {
        if (head==null){
            System.out.println("is nulll.");
        }
        int deleteNum = head.data;
        System.out.println("\n"+head.data+" is delete.\n");
        head=head.next;
        display();
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
