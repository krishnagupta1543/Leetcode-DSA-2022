package com.company;

public class MaxMinElement {
    public static int getmin(int[] arr, int i, int n){
        return (n == 1) ? arr[i] : Math.min(arr[i], getmin(arr, i+1, n-1));
    }
    public static int getmx(int[] arr, int i , int n){
        return (n == 1) ? arr[i] : Math.max(arr[i], getmx(arr,i+1, n-1));
    }
    public static void main(String[] args) {
        int [] arr = {5, 2, 7, 1, 9};
        System.out.println(getmin(arr, 0, arr.length));
        System.out.println(getmx(arr, 0, arr.length));
    }

}


