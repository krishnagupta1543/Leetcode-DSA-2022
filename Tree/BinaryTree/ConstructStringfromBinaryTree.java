// https://leetcode.com/problems/construct-string-from-binary-tree/
class Solution {
    StringBuilder ans;
    public String tree2str(TreeNode root) {
        ans = new StringBuilder();
        solve(root);
        return ans.toString();
    }
     void solve(TreeNode root ){
        if(root == null) return;
        if(root.left == null && root.right == null){
            ans.append(root.val);
            return;
        }
        ans.append(root.val);
        ans.append("(");
        solve(root.left);
        ans.append(")");
        if(root.right!=null){
            ans.append("(");
            solve(root.right);
            ans.append(")");
        }
    }
}
