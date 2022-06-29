class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = findmid(head);
        ListNode headsecond = reverse(mid);
        ListNode m = head;
        ListNode n = headsecond;
        while(m!=null && n!=null){
            if(m.val != n.val){
                return false;
            }
            m = m.next;
            n = n.next;
        }
        return true;
        
    }
    public static ListNode findmid(ListNode head){
        ListNode f = head;
        ListNode s = head;
        while(f!=null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode nex = head.next;
        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = nex;
            if(nex != null){
                nex = nex.next;
            }
        }
        return prev;
    }
}
