//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/

class Solution {
    public int[] searchRange(int[] arr, int target) {
        int [] ans = new int[2];
        ans[0] = binarysearchfirst(arr, target);
        ans[1] = binarysearchlast(arr, target);
        return ans;
    }
    public static int binarysearchfirst(int [] arr, int target){
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        while(s <= e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target){
                ans = mid;
                e = mid-1;
            }else if(arr[mid] > target){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return ans;
    }
    public static int binarysearchlast(int [] arr, int target){
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        while(s <= e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target){
                ans = mid;
                s = mid+1;
            }else if(arr[mid] > target){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return ans;
    }
}
