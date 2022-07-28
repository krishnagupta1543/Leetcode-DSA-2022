
package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Try {
    // TIME COMPLEXITY --- >
    // WORST CASE - > O(N^2)
    // BEST CASE --> O(NLogN)
    // BEST CASE WHEN THE PIVOT IS MIDDLE ELEMENT OF THE ARRAY
    // RECURRENCE RELATION -----> T(N) = T(N/2) + T(N/2) + O(N)

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


    public static void main(String[] args) {
        int[] arr = {11, 10,6,1, 2, 3, 5, 0, 5, 7, 1, 1,11};
        quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

