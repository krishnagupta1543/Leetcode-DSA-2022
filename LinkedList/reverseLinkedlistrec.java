// https://leetcode.com/problems/reverse-linked-list/
class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse(head);
       
    }
    public static ListNode reverse(ListNode node){
        if(node==null || node.next == null){
            return node;
        }    
        ListNode head = reverse(node.next);
        ListNode a = head;
        while(a.next!=null){
            a = a.next;
        }
        a.next = node;
        node.next = null;
        return head;
    }
}
