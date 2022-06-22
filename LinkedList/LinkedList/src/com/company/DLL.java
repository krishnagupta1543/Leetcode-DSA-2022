package com.company;

public class DLL {
    private Node head;
    private Node tail;
    public int size;
    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
        tail = node;
        size++;

    }
    public void insertlast(int val){
        Node node = new Node(val);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }
    public void insert(int index , int val){
        if(index == 0){
            insertfirst(val);
        }
        else {
            Node temp = findindexnode(index);
            Node node = new Node(val);
            node.next = temp.next;
            temp.next = node;
            node.prev = temp;
            if(node.next!=null) {
                node.next.prev = node;
            }
        }
        size++;
    }
    public void add(int val){
        if(head == null){
            insertfirst(val);
        }else{
            Node node = new Node(val);
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
        size++;
    }
    public Node findindexnode(int index){
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public Node display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
        return temp;
    }
    // Deletion
    public int deletefirst(){
        int val = head.val;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    public int deletelast(){
        int val = tail.val;
        tail = tail.prev;
        tail.next = null;
        return val;
    }
    public int deleteindex(int index){
        int val;
        if(index == 0){
            val =  deletefirst();
        }
        else if(index == size-1){
            val =  deletelast();
        }
        else {
            Node temp = findindexnode(index);
            val = temp.next.val;
            temp.next = temp.next.next;
            temp.next.next.prev = temp;
        }
        return val;
    }
    public void displayrev(){
        Node node = tail;
        while(node != null){
            System.out.print(node.val+" -> ");
            node = node.prev;
        }
        System.out.print("END");
    }
    private class Node {
        private int val;
        private Node prev;
        private Node next;
        Node(int val){
            this.val = val;
        }
        Node(Node prev, Node next){
            this.prev = prev;
            this.next = next;
        }
    }
}
