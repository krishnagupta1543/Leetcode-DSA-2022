// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean orderLR = true;
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode tempnode = queue.poll();
                if(tempnode.left!=null){
                    queue.offer(tempnode.left);
                }
                if(tempnode.right!=null){
                    queue.offer(tempnode.right);
                }
                temp.add(tempnode.val);
            }
            if(orderLR){
                ans.add(temp);
                orderLR = false;
            }else{
                Collections.reverse(temp);
                ans.add(temp);
                orderLR = true;
            }
        }
        return ans;
    }
    
}
