
package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Try {
    // TIME COMPLEXITY --- >
    // WORST CASE - > O(N^2)
    // BEST CASE --> O(NLogN)
    // BEST CASE WHEN THE PIVOT IS MIDDLE ELEMENT OF THE ARRAY
    // RECURRENCE RELATION -----> T(N) = T(N/2) + T(N/2) + O(N)
// selecting the middle element as a pivot
    static void quicksort(int[] arr, int low, int high){
        if(low>=high) return;
        int s = low;
        int e = high;
        int m = s+(e-s)/2;
        int p = arr[m];
        while(s<=e){
            while(arr[s]<p){
                s++;
            }
            while(arr[e]>p){
                e--;
            }
            if(s<=e){
                int t = arr[s];
                arr[s] = arr[e];
                arr[e] = t;
                s++;
                e--;
            }
        }
        quicksort(arr, low, e);
        quicksort(arr, s, high);
    }
// selecting the corner elements as a pivot
   static void quicksort1(int[] arr, int low, int high){
        int left = low;
        int right = high;
        if(high>low) {
            int pivot = arr[low];
            while(left<right){
                while(left < arr.length && arr[left]<=pivot){
                    left++;
                }
                while(right > -1 && arr[right]>pivot){
                    right--;
                }
                if(left<right) {
                    int t = arr[left];
                    arr[left] = arr[right];
                    arr[right] = t;
                }
            }
            arr[low] = arr[right];
            arr[right] = pivot;
            int pivot_indx = right;
            quicksort1(arr, low, pivot_indx - 1);
            quicksort1(arr, pivot_indx + 1, high);
        }
    }
    static int partition(int[]arr,int low, int high){
        int left = low;
        int pivot_indx = low;
        int pivot = arr[low];
            while(low<high){
                while(low < arr.length && arr[low]<=pivot){
                    low++;
                }
                while(high > -1 && arr[high]>pivot){
                    high--;
                }
                if(low<high) {
                    int t = arr[low];
                    arr[low] = arr[high];
                    arr[high] = t;
                }
            }
            arr[left] = arr[high];
            arr[high] = pivot;
            return high;
        }

    public static void main(String[] args) {
        int[] arr = {11, 10,6,1, 2, 3, 5, 0, 5, 7, 1, 1,11};
        quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

