//https://leetcode.com/problems/find-in-mountain-array/
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int indexpeak = findpeak(target, mountainArr);
        int ans =  binarysearch1(target, mountainArr, 0, indexpeak);
        if(ans == -1){
            ans = binarysearch1(target, mountainArr, indexpeak+1, mountainArr.length()-1);
        }
        return ans;
    }
    public static int findpeak(int target, MountainArray arr){
        int s = 0;
        int e = arr.length()-1;
        while(s < e){
            int m = s+(e-s)/2;
            if((m+1)<arr.length() && arr.get(m) > arr.get(m+1)){
                e = m;
            }else{
                s = m+1;
            }
        }
        return s;
    }
    public static int binarysearch1(int target, MountainArray arr, int s, int e){
        if(arr.get(s) < arr.get(e)){
        while(s <= e){
            int mid = (s+e)/2;
            if(arr.get(mid) == target){
                return mid;
            }else if(arr.get(mid) > target) {
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
    }else{
            while(s <= e){
            int mid = (s+e)/2;
            if(arr.get(mid) == target){
                return mid;
            }else if(arr.get(mid) > target) {
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
    }
        return -1;
}
}
