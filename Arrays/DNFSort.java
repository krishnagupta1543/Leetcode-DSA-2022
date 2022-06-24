package com.company;

import java.util.Arrays;

public class Try {
    public static void main(String[] args) {
        int [] a = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int low = 0;
        int mid = 0;
        int high = a.length - 1;
        while(mid<=high){
            if(a[mid] == 0){
                int t = a[mid];
                a[mid] = a[low];
                a[low] = t;
                mid++;
                low++;
            }
            else if(a[mid] == 2){
                int t = a[mid];
                a[mid] = a[high];
                a[high] = t;
                high--;
            }else{
                mid++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

