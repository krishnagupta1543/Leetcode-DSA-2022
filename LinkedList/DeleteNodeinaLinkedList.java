//https://leetcode.com/problems/delete-node-in-a-linked-list/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp = node.next;
        int v = temp.val;
        node.val = v;
        node.next = temp.next;
        temp.next = null;
    }
}
