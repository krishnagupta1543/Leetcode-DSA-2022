// https://practice.geeksforgeeks.org/problems/find-length-of-loop/1/
class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        Node fast = head;
        Node slow =  head;
        int length = 0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast =fast.next.next;
            if(slow == fast){
                Node temp = slow;
                do{
                    length++;
                    temp = temp.next;
                }while(temp != slow);
                return length;
            }
        }
        return length;
    }
}
