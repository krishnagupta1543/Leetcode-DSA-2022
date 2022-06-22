package com.company;
public class LL {

    private Node head;
    private Node tail;
    public int size;
    public void addfirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = node;
        }
        size++;
    }

    public void add(int val){
        if(head == null){
            addfirst(val);
        }else {
            Node node = new Node(val);
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void print(){
        Node a = head;
        System.out.println(a.val);
        while(a != null){
            System.out.print(a.val+" -> ");
            a = a.next;
        }
        System.out.print("NULL");
    }

    public void addlast(int val){
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void reverse(){
        Node a = head;
        Node b = head.next;
        Node c = null;
        if(b!=null) {
            c = head.next.next;
        }
        a.next = null;
        while(b!=null){
            b.next = a;
            a = b;
            b = c;
            if(c!=null) {
                c = c.next;
            }
        }
        head = a;

    }
    public int deletefirst(){
        int ans = head.val;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return ans;
    }
    public int deletelast(){
        int ans = tail.val;
        Node a = head;
        while(a.next != tail){
            a = a.next;
        }
        tail = a;
        tail.next = null;
        size--;
        return ans;
    }
    public void insertindex(int index,int val){
        Node node = new Node(val);
        if(index == 0){
            node.next = head;
            head = node;
        }else {
            Node temp = nodefind(index);
            node.next = temp.next;
            temp.next = node;
        }
        size++;
    }
    public Node nodefind(int index){
        Node temp = head;
        int p = 1;
        while(p < index){
            temp = temp.next;
            p++;
        }
        return temp;
    }
    public int deleteatindex(int index){
        int val;
        if(index == 0){
            val = head.val;
            head = head.next;
            size--;
        }
        else if(index == size-1){
            return deletelast();
        }
        else {
            Node temp = nodefind(index);
            val = temp.next.val;
            temp.next = temp.next.next;
        }
        size--;
        return val;
    }
    private class Node{
        private int val;
        private Node next;
        Node(int val){
            this.val = val;
        }
    }
}
