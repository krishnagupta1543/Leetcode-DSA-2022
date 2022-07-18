// https://leetcode.com/problems/search-in-rotated-sorted-array/

// Approach 
// 1 - find the pivot element 
// 2 - apply binary search from index 0 to pivot 
// 3 - if target not found again apply binary search from index pivot+1 to last index

class Solution {
    public int search(int[] nums, int target) {
        int p = pivot(nums);
        int ans = binarysearch(nums, target, 0, p);
        if(ans == -1){
            ans = binarysearch(nums, target, p+1, nums.length-1);
        }
        return ans;
    }
    public static int binarysearch(int[] nums, int target, int s, int e){

        while(s <= e){
            int mid = s+(e-s)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return -1;
    }
    public static int pivot(int [] nums){
        int s = 0;
        int e = nums.length - 1;
        while(s <= e){
            int mid = s+(e-s)/2;
            if((mid+1) < nums.length && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if((mid-1)>=0 && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if (nums[s]>=nums[mid]){
                e = mid-1;
            }else {
                s = mid+1;
            }
        }
        return s;
    }

}
