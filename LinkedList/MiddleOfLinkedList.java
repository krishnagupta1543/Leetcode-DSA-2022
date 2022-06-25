// https://leetcode.com/problems/middle-of-the-linked-list/
// You can solve this problem using two ways

// first way
class Solution {
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while(temp!= null){
            temp = temp.next;
            length++;
        }
        int c = 0;
        ListNode a = head;
        int m = length/2;
        while(c!=m){
            a = a.next;
            c++;
        }
        return a;
    }
}

// Second way

// Approach -- > use fast and slow pointer when the value of fast pointer become null the slow pointer is pointing to the middle node of linkedlist
// patter to identify ---------> use fast and slow pointer when you have to find the node in cycle or etc

class Solution {
    public ListNode middleNode(ListNode head) {
       ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
