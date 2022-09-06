//https://leetcode.com/problems/binary-tree-right-side-view/
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, TreeNode> map=  helper(root, 0, new HashMap<>());
        for(Map.Entry<Integer, TreeNode>e : map.entrySet()){
            ans.add(e.getValue().val);
        }
        return ans;
    }
    static Map<Integer, TreeNode> helper(TreeNode root, int level, HashMap<Integer, TreeNode> map){
        if(root == null){
            return map;
        }
        map.putIfAbsent(level, root);
        helper(root.right, level+1, map);
        helper(root.left, level+1, map);
        return map;
    }
}
