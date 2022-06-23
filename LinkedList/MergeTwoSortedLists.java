//  https://leetcode.com/problems/merge-two-sorted-lists/
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans  = new ListNode();
        ListNode x = ans;
        ListNode head =  ans;
        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                if(x == null){
                    x = list1;
                    list1 = list1.next;
                }else{
                    x.next = list1;
                    x = x.next;
                    list1 = list1.next;
                }
            }else{
                if(x == null){
                    x = list2;
                    list2 = list2.next;
                }else{
                    x.next = list2;
                    x = x.next;
                    list2 = list2.next;
                }
            }
        }
        while(list1!=null){
            x.next = list1;
            x = x.next;
            list1 = list1.next;
        }
        while(list2 != null){
            x.next = list2;
            x = x.next;
            list2 = list2.next;
        }
        return head.next;
    }
}
