// https://leetcode.com/problems/sort-list/

// you can sort this problem any sorting algorithm
//
// Merge sort code

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
                if(head == null || head.next == null){

         return head;
        }
        ListNode mid = findmid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);
    }
    public static ListNode findmid(ListNode head){
        ListNode midprev = null;
        while(head!=null && head.next!=null)
        {
            midprev = (midprev==null)?head : midprev.next;
            head = head.next.next;
        }
        ListNode mid = midprev.next;
        midprev.next = null;
        return mid;
    }
    public static ListNode merge(ListNode List1, ListNode List2){
        ListNode newlist = new ListNode();
        ListNode tail = newlist;
        ListNode head  = newlist;
        while(List1!=null && List2!=null){
            if(List1.val<List2.val){
                if(tail == null) {
                    tail = List1;
                }
                else{
                    tail.next = List1;
                    tail = List1;
                }
                List1 = List1.next;
            }
            else{
                if(tail == null)
                {
                    tail = List2;
                }
                else{
                    tail.next = List2;
                    tail = List2;
                }
                List2 = List2.next;
            }
        }
            while(List1!=null){
                tail.next = List1;
                List1 = List1.next;
                tail = tail.next;
            }
            while(List2!=null){
                tail.next = List2;
                List2 = List2.next;
                tail = tail.next;

            }
        return head.next;
    }

}
