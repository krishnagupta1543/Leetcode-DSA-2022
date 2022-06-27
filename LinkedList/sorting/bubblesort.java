public class LL 
{
    public Node head;
    public Node tail;
    public int size;
     LL(){
        this.size = 0;
    }
     public Node nodefind(int index){
        Node temp = head;
        int p = 0;
        while(p < index){
            temp = temp.next;
            p++;
        }
        return temp;
    }
    public void bubblesort(Node head,int r,int c){
        if(r == 0) return;
        if(r > c){
            Node first = nodefind(c);
            Node second = nodefind(c+1);
            if(first.val >second.val){
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }
                else if(second == tail){
                    tail = first;
                    Node prev = nodefind(c-1);
                    second.next = first;
                    first.next = second.next;
                    prev.next = second;
                    first.next = null;
                }
                else
                {
                    Node prev = nodefind(c-1);
                    second.next = first;
                    first.next = second.next;
                    prev.next = second;
                }
            }
            bubblesort(head, r,c+1);
        }else{
            bubblesort(head,r-1,0);
        }
    }
    public static class Node{
        private int val;
        private Node next;
        Node(int val){
            this.val = val;
        }
        Node(){};
    }
}
