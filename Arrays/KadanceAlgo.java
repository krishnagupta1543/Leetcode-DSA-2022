package com.company;

import java.util.Arrays;

public class KadanceAlgo {
    static int[] findSubArray(int[] arr){
        int start = 0;
        int end = 0;
        int s = 0;
        int e = 0;
        int[] ans = new int[2];
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            curr_sum+=arr[i];
            if(curr_sum > max_sum){
                start = s;
                end = i;
                max_sum = curr_sum;
            }else if(curr_sum < 0){
                curr_sum = 0;
                s = i+1;
            }
        }
        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    public static int findMaxSum(int[] arr){
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;

        for(int i = 0; i < arr.length; i++){
            curr_sum += arr[i];
            if(curr_sum > max_sum){
                max_sum = curr_sum;
            }
            else if(curr_sum < 0){
                curr_sum = 0;
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int max_sum = findMaxSum(arr);

        int[] ans = findSubArray(arr);

        System.out.println("Maximum subarray sum is "+max_sum);
        System.out.println("Starting and Ending Index of subarray "+ Arrays.toString(ans));
    }
}

