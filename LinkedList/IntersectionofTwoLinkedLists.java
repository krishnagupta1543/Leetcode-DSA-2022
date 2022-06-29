//https://leetcode.com/problems/intersection-of-two-linked-lists/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1 = 0;
        int size2 = 0;
        ListNode a = headA;
        ListNode b = headB;
        while(a!=null){
            a = a.next;
            size1+=1;
        }
        while(b!=null){
            b = b.next;
            size2+=1;
        }
        if(size1 > size2){
            int r = size1 - size2;
            while(r!=0){
                headA = headA.next;
                r-=1;
            }
        }
        if(size2 > size1){
            int r = size2 - size1;
            while(r!=0){
                headB = headB.next;
                r -= 1;
            }
        }
        while(headA!=null && headB != null)
        {
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
