package com.linkedlist;

import static java.lang.System.exit;

public class QueueOperation {
    private class Node {
        int data;
        Node next;
        public Node(int data)  // // constructor to create a new linked list node
        {
            this.data = data;
            this.next = null;
        }
    }
    private static  Node rear=null;
    private static  Node front=null;
    private static  int count =0;

    public void enqueue(int data)     // insertion at the end
    {
        Node node = new Node(data);  // allocate a new node in a heap
        System.out.printf("Insert Data into Queue:  %d\n", data);
        if (front == null)  // if queue is empty
        {
            front = node;  // initialize both front and rear
            rear = node;
        }
        else {

            rear.next = node;      // update rear
            rear = node;
        }

        count += 1;   // increase count by 1
    }


    public int peek()  // top element of queue
    {
        if (front == null) {  // check for an empty queue
            exit(-1);
        }

        return front.data;
    }
    public static void main(String[] args) {
        QueueOperation queueOperation=new QueueOperation();
        System.out.println("Stack Operation Using Linked List");
        queueOperation.enqueue(56);
        queueOperation.enqueue(30);
        queueOperation.enqueue(70);
        System.out.println("Peek Element is "+queueOperation.peek());
    }

}
