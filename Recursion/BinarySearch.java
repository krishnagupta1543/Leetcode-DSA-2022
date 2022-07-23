package com.company;

public class Try {
    //RECCURENCE RELATION - T(N) = O(1) + T(N/2)
    // TIME COMPLEXITY IS O(LogN)
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 9;
        int ans = binarysearch(arr, 0, arr.length-1, target);
        System.out.println(ans);
    }
    public static int binarysearch(int[] arr, int s, int e, int target){
       if(s <= e){
           int m = s+(e-s)/2;
           if(arr[m] == target){
               return m;
           }
           else if(arr[m] > target){
               return binarysearch(arr, s, m-1, target);
           }else{
               return binarysearch(arr, m+1, e, target);
           }
       }
       return -1;
    }
}


