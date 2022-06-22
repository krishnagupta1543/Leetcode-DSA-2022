package com.company;

public class CLL {
    private Node head;
    private Node tail;
    public int size;
    public void insert(int val){
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }
            node.next = head;
            tail.next = node;
            tail = node;
            size++;
    }
    public void print(){
        Node temp = head;
        do{
            System.out.print(temp.val+ " -> ");
            temp = temp.next;
        }while(temp!=head);

    }
    private class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
}
