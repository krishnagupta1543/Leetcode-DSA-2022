//https://leetcode.com/problems/search-in-rotated-sorted-array
package com.company;

public class RotatedBS {
    static int rotatedbs(int [] arr, int target, int s, int e){
        int m = s+(e-s)/2;
        if(arr[m] == target) return m;
        if(arr[s]<=arr[m]){
            if(arr[s]<= target && target <= arr[m]){
                return rotatedbs(arr, target, s, m);
            }else{
                return rotatedbs(arr, target, m+1, e);
            }
        }else{
            if(arr[m+1]<=target && target<=arr[e]){
                return rotatedbs(arr, target, m+1, e);
            }else{
                return rotatedbs(arr, target, s, m-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 1, 2, 3, 4, 5};
        int target = 6;
        int ans = rotatedbs(arr, target, 0, arr.length-1);
        System.out.println(ans);
    }
}

