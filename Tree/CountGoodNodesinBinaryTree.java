//https://leetcode.com/problems/count-good-nodes-in-binary-tree
class Solution {
    int ans = 0;
    public int goodNodes(TreeNode root) {
        help(root, root.val);
        return ans;
    }
    private void help(TreeNode node, int mx){
        if(node!=null){
            if(node.val >= mx){
                ans+=1;
            }
            help(node.left,Math.max(node.val,mx));
            help(node.right, Math.max(node.val,mx));
        }
    }
}

