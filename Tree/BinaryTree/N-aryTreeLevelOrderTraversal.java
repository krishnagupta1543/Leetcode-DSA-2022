//https://leetcode.com/problems/n-ary-tree-level-order-traversal/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int s = queue.size();
            List<Integer> temp = new ArrayList<>();
            while(s>0){
                Node node = queue.poll();
                List<Node> child = node.children;
                for(Node e : child){
                    queue.offer(e);
                }
                temp.add(node.val);
                s--;
            }
            ans.add(temp);
        }
        return ans;
    }
}
