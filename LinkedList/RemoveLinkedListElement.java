//https://leetcode.com/problems/remove-linked-list-elements/

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
    public ListNode removeElements(ListNode head, int val) {
        ListNode s = null;
        ListNode f = head;
        while(f!=null){
            if(f.val == val){
                if(f == head){
                    head = f.next;
                    f = head;
                }else{
                    s.next = f.next;
                 
                    f.next = null;
                    f = s.next;
                }
            }else{
            s = (s == null)? head : s.next;
            f = f.next;
            }
        }
        return head;
    }
}
