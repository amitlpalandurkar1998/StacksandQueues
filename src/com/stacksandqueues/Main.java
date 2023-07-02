package com.stacksandqueues;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Stacks and Queues Program.");
        StacksQueues sq = new StacksQueues();
        Scanner scanner = new Scanner(System.in);
        boolean isRuning = true;

        while (isRuning){
            System.out.println("\nEnter '1' to Add a New Number in Queue.");
            System.out.println("Enter '2' to Display a Queue.");
            System.out.println("Enter '3' to peak a Number in Queue.");
            System.out.println("Enter '4' to pop(dalate) a Number in Queue.");
            System.out.println("Enter '0' To Exit .");

            System.out.print("\nEnter the input : ");
            int input = scanner.nextInt();

            switch (input){
                case 0 :
                        isRuning=false;
                    break;
                case 1 :
                        System.out.print("\nEnter the Number That you Want to add : ");
                        int pushNum = scanner.nextInt();
                        sq.addinQueue(pushNum);
                    break;
                case 2 :
                        sq.display();
                    break;
                case 3 :
                        System.out.println("\n"+sq.peak());
                    break;
                case 4 :
                        sq.pop();
                    break;
                default:
                    break;
            }
        }
    }
}
