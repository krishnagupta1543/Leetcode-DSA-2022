// https://practice.geeksforgeeks.org/problems/find-a-pair-with-given-target-in-bst/1
class Solution
{
    // root : the root Node of the given BST
    // target : the target sum
    // Solution using arraylist and two sum method 
    // Time Complexity = O(N)
    // Space Complexity = O(N)
    public int isPairPresent(Node root, int target)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        int i = 0; 
        int j = arr.size()-1;
        while(i < j){
            if(arr.get(i)+arr.get(j) == target){
                return 1;
            }
            else if(arr.get(i)+arr.get(j) > target){
                j--;
            }else{
                i++;
            }
        }
        return 0;
    }
    public void inorder(Node root,ArrayList<Integer> arr){
        if(root == null){
            return ;
        }
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }
}
//Using hashmap
// Time Complexity = O(N)
// Space Complexity = O(N)

// class Solution
// {
//     // root : the root Node of the given BST
//     // target : the target sum
//     public int isPairPresent(Node root, int target)
//     {
//         Write your code here
//         Set<Integer> set = new HashSet<>();
//         if(check(root, set, target)){
//             return 1;
//         }else{
//             return 0;
//         }
//     }
//     public boolean check(Node root, Set<Integer> set, int target){
//         if(root == null) return false;
//         if(set.contains(target - root.data)){
//             return true;
//         }
//         set.add(root.data);
//         return check(root.left, set, target) || check(root.right, set, target);
//     }
// }

