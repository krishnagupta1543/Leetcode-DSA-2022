// https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
       ArrayList<Integer> ans = new ArrayList<>();
      if(root == null){
          return ans;
      }
      Map<Integer, Node> map = helper(root, 0, new HashMap<>());
      for(Map.Entry<Integer, Node> e: map.entrySet()){
          ans.add(e.getValue().data);
      }
    return ans;
      
    }
    static Map<Integer, Node> helper(Node root, int level, HashMap<Integer, Node>map){
        map.putIfAbsent(level, root);
        if(root.left!=null){
            helper(root.left, level+1, map);
        }
        if(root.right!=null){
            helper(root.right, level+1, map);
        }
        return map;
    }
}
