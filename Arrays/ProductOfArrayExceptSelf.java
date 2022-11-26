class Solution {
    // BRUTEFORCE APPROACH
    // TIME COMPLEXITY = O(N^2)
    // public int helper(int[] nums, int index){
    //     int prdct = 1;
    //     for(int i = 0; i < nums.length; i++){
    //         if(i!=index){
    //             prdct*=nums[i];
    //         }
    //     }
    //     return prdct;
    // }
    // public int[] productExceptSelf(int[] nums) {
    //     int[] ans = new int[nums.length];

    //     for(int i = 0; i < nums.length; i++){
    //         ans[i] = helper(nums, i);
    //     }
    //     return ans;
    // }

    // Optimised Approach
    // TIME COMPLEXITY = O(N)

    public int[] productExceptSelf(int[] nums) {
        int[] L = new int[nums.length];
        int[] R = new int[nums.length];
        Arrays.fill(L, 1);
        Arrays.fill(R, 1);

        for(int i = 1; i < nums.length; i++){
            L[i] = L[i-1]*nums[i-1];
        }

        for(int i = nums.length-2; i>=0; i--){
            R[i] = R[i+1]*nums[i+1];
        }

        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = L[i]*R[i];
        }
        return ans;
    }
}
