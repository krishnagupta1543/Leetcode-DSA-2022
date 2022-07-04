public class LinkedList {
    Node head;
    Node tail;
    public void push(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            node.next = null;
        }else{
            node.next = head;
            head = node;
        }
    }
    public int pop(){
        int val = -1;
        if(head!=null){
            val = head.val;
        }
        return val;
    }
    public int size(){
        Node temp = head;
        int s = 0;
        while(temp!=null){
            s++;
            temp = temp.next;
        }
        return s;
    }
    public void display(){
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.val+ "- > ");
            temp = temp.next;
        }
    }
    private class Node{
        int val;
        Node next;
        Node(int data){
            this.val = data;
        }
    }
}

