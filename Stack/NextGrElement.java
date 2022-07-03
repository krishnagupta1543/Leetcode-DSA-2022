// https://leetcode.com/problems/next-greater-element-i/
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length ; j++){
                if(nums1[i]==nums2[j]){
                    for(int t = nums2.length-1; t > j; t--){
                        stack.push(nums2[t]);
                    }
                    while(stack.empty() != true && stack.peek() < nums1[i]){
                        stack.pop();
                    }
                    if(stack.empty()){
                        ans[i] = -1;
                    }
                    else{
                        ans[i] = stack.peek();
                    }
                    while(stack.empty()!=true){
                        stack.pop();
                    }
                }
            }
        }
        return ans;
    }
}
