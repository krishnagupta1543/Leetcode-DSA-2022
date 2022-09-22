// https://practice.geeksforgeeks.org/problems/populate-inorder-successor-for-all-nodes/1
class Solution{
    public void populateNext(Node root){
        //code here
        //Brute Force Approach
        // Time Complexity = O(N)+O(N)
        // Space Complexity = O(N)
        Queue<Node> queue = new LinkedList<>();
        inorder(root, queue);
        while(!queue.isEmpty()){
            Node p = queue.poll();
            if(queue!=null){
                p.next = queue.peek();
            }else{
                p.next = null;
            }
        }
    }
    public void inorder(Node root, Queue<Node> queue){
        if(root == null){
            return;
        }
        inorder(root.left, queue);
        queue.offer(root);
        inorder(root.right, queue);
    }
}
