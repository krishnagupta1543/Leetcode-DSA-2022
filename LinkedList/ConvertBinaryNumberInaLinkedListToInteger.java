// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/
class Solution {
    public int findSize(ListNode node, int size){
        if(node == null){
            return size;
        }
        return findSize(node.next, size+1);
    }
    public int helper(ListNode node, int p, int ans){
        if(node == null){
            return ans;
        }
        ans+=Math.pow(2, p)*node.val;
        return helper(node.next, p-1, ans);
    }
    public int getDecimalValue(ListNode head) {
        int size = findSize(head, 0);
        int pow = size-1;
        return helper(head, pow, 0);
    }
}
