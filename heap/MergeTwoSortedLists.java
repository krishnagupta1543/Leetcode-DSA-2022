// https://leetcode.com/problems/merge-two-sorted-lists/description/
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	     PriorityQueue<Integer> pq = new PriorityQueue<>();
        ListNode head = null;
        ListNode temp = null;
        while(list1!=null){
            pq.offer(list1.val);
            list1 = list1.next;
        }
        while(list2!=null){
            pq.offer(list2.val);
            list2 = list2.next;
        }
        while(!pq.isEmpty()){
            ListNode node = new ListNode(pq.poll());
            if(temp == null){
                head = node;
                temp = node;
            }else{
                temp.next = node;
                temp = temp.next;
            }
        }
        return head;
    }
}
