package com.stacksandqueues;
import java.util.Scanner;
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
    public void deleteSeletedNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Number That You Want to Delete : ");
        int deleteNum = scanner.nextInt();
        boolean isNotFound = true;
        if (head==null){
            System.out.println("data is null.");
            return ;
        }
        Node temp = head;
        if (head.data==deleteNum){
            int deleteData = head.data;
            head = head.next;
            temp = null;
            isNotFound=false;
        }
        while (temp!=null){
            if (temp.next.data==deleteNum){
                int deleteData = temp.next.data;
                temp.next = temp.next.next;
                isNotFound=false;
                return ;
            }
            temp = temp.next;
        }
        if (isNotFound){
            System.out.println("Not Present.");
        }
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