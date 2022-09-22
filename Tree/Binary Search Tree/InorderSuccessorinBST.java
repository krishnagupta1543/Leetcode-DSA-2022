// https://practice.geeksforgeeks.org/problems/inorder-successor-in-bst/1
class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    public Node find(Node root, Node x, Node ans){
          if(root == null){
              return ans;
          }
          else{
              if(root.data <= x.data){
                  root = root.right;  
                  return find(root, x, ans);
              }else{
                  ans = root;
                  root = root.left;
                  return find(root, x, ans);
              }
          }
        }
	public Node inorderSuccessor(Node root,Node x)
         {
          //add code here.
          return find(root, x,null);
         }
}
