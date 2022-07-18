// https://leetcode.com/problems/search-in-rotated-sorted-array/

// Approach 
// 1 - find the pivot element 
// 2 - apply binary search from index 0 to pivot 
// 3 - if target not found again apply binary search from index pivot+1 to last index

class Solution {
    public int search(int[] nums, int target) {
        int p = pivot(nums); // when p = -1
        int ans = binarysearch(nums, target, 0, p); // it return -1 for p = -1
        if(ans == -1){
            ans = binarysearch(nums, target, p+1, nums.length-1); // whem p = -1 p+1 = 0 and nums.length-1 --> work as a normal binary search
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
        // if pivot return -1 means pivot is not present apply normal binary search 
        return -1;
    }

}
