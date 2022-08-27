package com.company;

import java.util.Arrays;

public class Countingsort {
    static int[] countingsort(int[] arr, int min, int max){
        int [] frq = new int[max-min+1];
        for (int i = 0; i < arr.length; i++) {
            int idx = arr[i] - min;
            frq[idx]++;
        }
        for (int i = 1; i < frq.length; i++) {
            frq[i] = frq[i]+frq[i-1];
        }
        int [] ans = new int[arr.length];
        for (int i = arr.length-1; i > -1; i--) {
            int index = arr[i] - min;
            int val = frq[index]--;
            ans[val-1] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {9, 6, 3, 5, 3, 4, 3, 9, 6, 4, 6, 5, 8, 9, 9};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int[] ans = countingsort(arr, min, max);
        System.out.println(Arrays.toString(ans));
    }
}

