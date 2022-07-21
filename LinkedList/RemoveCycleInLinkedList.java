//https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1?page=1&company[]=Microsoft&sortBy=submissions

class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        boolean check = checkloop(head);
        if(check == false){
            return;
        }else {
            int len = length(head);
            Node startingnode = find(head, len);
            Node t = startingnode;
            while(t.next!=startingnode){
                t = t.next;
            }
            t.next = null;
        }
    }
    public static Node find(Node head, int len){
        Node start = head;
        while(len!=0){
            start = start.next;
            len-=1;
        }
        Node sec = head;
        while(start!=sec){
            start = start.next;
            sec = sec.next;
        }
        return start;
    }
    public static int length(Node head){
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        int len = 0;
        do{
            len++;
            fast = fast.next;
        }while(fast!=slow);
        return len;

    }
    public static boolean checkloop(Node head){
        // use floyds algorithm
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
