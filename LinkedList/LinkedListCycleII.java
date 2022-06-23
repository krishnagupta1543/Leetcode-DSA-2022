// https://leetcode.com/problems/linked-list-cycle-ii/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        boolean a = false;
        ListNode f = head;
        ListNode s = head;
        while(f!=null && f.next!=null){
            f = f.next.next;
            s =s.next;
            if(f == s){
                a = true;
                break;
            }
        }
        int length = 0;
        if(a == false) return null;
        else{
            ListNode t = f;
            do{
                t = t.next;
                length++;
            }while(t!=f);
        }
        ListNode temp = head;
        while(length!=0){
            temp = temp.next;
            length--;
        }
        while(head!=temp){
            head = head.next;
            temp = temp.next;
        }
        return head;
    }
}
