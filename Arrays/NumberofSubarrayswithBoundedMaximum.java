// https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/
class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int si = 0;
        int ei = 0;
        int count = 0;
        int prevc = 0;
        while(ei < nums.length){
            if(left <= nums[ei] && nums[ei]<=right){
                prevc = ei-si+1;
                count+=prevc;
            }
            else if(nums[ei]<left){
                count+=prevc;
            }else{
                si = ei+1;
                prevc = 0;
            }
            ei++;
        }
        return count;
    }
}
