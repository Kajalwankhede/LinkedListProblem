package com.linkedlist;

public class LinkedList {

    class Node {   // Create a node
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
public Node head=null;
    public Node tail=null;
    public void addNode(int d){
        Node newNode=new Node(d);


        if (head == null) {
            head = newNode;
        } else {

            tail.next = newNode;
            newNode.next=null;

        }
        tail = newNode;

    }
    public void display() {                 // Print the linked list
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of linked list ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }
    public static void main(String[] args) {
        LinkedList li = new LinkedList();

        System.out.println("Linked list: ");
        li.addNode(56);
        li.addNode(30);
        li.addNode(70);
        li.display();

    }
}
