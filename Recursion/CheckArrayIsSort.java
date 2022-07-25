// Q : check whether the array is sort or not
package com.company;

public class SortArray {
    static boolean check(int[] arr, int i){
        if(i == arr.length-1) return true;
        else{
            // if (arr[i] < arr[i+1]) is false it doesn't call check(arr, i+1)
            return (arr[i]<arr[i+1]) && check(arr, i+1);
        }
    }
    static boolean checksort(int[] arr){
        return check(arr, 0);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 14};
        boolean ans = checksort(arr);
        System.out.println(ans);
    }
}

