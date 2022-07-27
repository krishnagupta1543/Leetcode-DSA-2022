package com.company;

import java.util.Arrays;

public class SelectionSort {
    // ITERATIVE WAY
    static void selectionsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    // RECURSIVE WAY
    static void recseclectionsort(int[] arr, int r, int c, int mx){
        if(r == 0) return;
        if(r>c){
            if(arr[c] > arr[mx]){
                recseclectionsort(arr, r, c+1, c);
            }else{
                recseclectionsort(arr, r, c+1, mx);
            }
        }else{
            int t = arr[r-1];
            arr[r-1] = arr[mx];
            arr[mx] = t;
            recseclectionsort(arr, r-1, 0, 0);
        }
    }
    public static void main(String[] args) {
        int[] arr = {-5, 4, 3, 2, 1, 0, 11};
//        selectionsort(arr);
            recseclectionsort(arr, arr.length, 0,0);
        System.out.println(Arrays.toString(arr));
    }
}
