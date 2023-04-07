package com.company;

import java.util.Arrays;

public class HeapSort {
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void heapifyMAX(int[] arr, int size, int i){
        int greater = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left < size && arr[left] > arr[greater]){
            greater = left;
        }
        if(right < size && arr[right] > arr[greater]){
            greater = right;
        }
        if(greater != i){
            swap(arr, i, greater);
            heapifyMAX(arr, size, greater);
        }
    }
    public static void heapSortMAX(int[] arr, int size){
        for(int i = size-1; i > 0; i--){
            swap(arr, 0, i);
            size=size-1;
            heapifyMAX(arr, size, 0);
        }
    }
    public static void heapifyMIN(int[] arr,int size, int i){
        int min = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left < size && arr[left]<arr[min]){
            min = left;
        }
        if(right < size && arr[right]<arr[min]){
            min = right;
        }

        if(min != i){
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            heapifyMIN(arr, min, size);
        }
    }
    public static void buildMin(int [] arr, int size){
        int start = size/2-1;
        for(int i = start; i > -1; i--){
            heapifyMIN(arr, i, size);
        }
    }
    public static void heapSortMIN(int[] arr, int size){
        for(int i = size-1; i > 0; i--){
            swap(arr, 0, i);
            size=size-1;
            heapifyMIN(arr, size, 0);
        }
    }
    public static void main(String[] args) {
        // We are taking max heap by default
        System.out.println("From max heap to ascending order sorting");
        int[] arr1 = {76, 65, 55, 23, 32};
        int arr_size = arr1.length;
        heapSortMAX(arr1, arr_size);
        System.out.println(Arrays.toString(arr1));

        System.out.println("From min heap to descending order sorting");
        int[] arr2 = {0, 10, 9, 17, 5, 7};
        buildMin(arr2, arr2.length);
        heapSortMIN(arr2, arr2.length);
        System.out.println(Arrays.toString(arr2));
    }
}


