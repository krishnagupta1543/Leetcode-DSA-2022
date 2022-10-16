// https://leetcode.com/contest/weekly-contest-315/problems/largest-positive-integer-that-exists-with-its-negative/
class Solution {
    public int findMaxK(int[] nums) {
        int ans = -1;
        HashMap<Integer, Integer> hp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i]<0){
                hp.put(nums[i], 1);
            }
        }
        for(int i = 0;i < nums.length; i++){
            if(nums[i]>0){
                if(hp.containsKey(nums[i]*-1)){
                    ans = Math.max(ans, nums[i]);
                }
            }
        }
        return ans;
    }
}
