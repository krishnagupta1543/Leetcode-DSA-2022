// https://leetcode.com/problems/reverse-linked-list-ii/
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
// class Solution {
//     public ListNode reverseBetween(ListNode head, int left, int right) {
//         if(head.next == null) return head;
//         int i = 1;
//         ListNode precurr = null;
//         ListNode newend = null;
//         ListNode prev = null;
//         ListNode curr = head;
//         ListNode nex = head.next;
//         while(i<=right){
//             if(i == left){
//                 precurr = prev;
//                 newend = curr;
//             }
//             if(i>=left){
//                 curr.next = prev;
//                 }
//             prev = curr;
//             curr = nex;
//             if(nex!=null){
//                 nex = nex.next;
//             }
//             i++;
//         }
//         if(precurr!=null){
//             precurr.next = prev;
//         }
//         if(newend != null){
//             newend.next = curr;
//         }
//         if(newend == head){
//             head = prev;
//         }
//         return head;
//     }
// }
class Solution {
   public ListNode reverseBetween(ListNode head, int left, int right) {
       if(left == right) return head;
       ListNode current = head;
       ListNode prev = null;
       for(int i = 0; current!= null && i < left-1; i++){
           prev = current;
           current = current.next;
       }
       ListNode lastnode = prev;
       ListNode newend = current;
       ListNode nex = current.next;
       for(int i = 0; current != null && i < right-left+1; i++){
           current.next = prev;
           prev = current;
           current  = nex;
           if(nex!=null){
            nex = nex.next;
           }
       }
       if(lastnode!=null){
          lastnode.next = prev;
       }else{
           head = prev;
       }
       newend.next = current;
       return head;
   }
}
