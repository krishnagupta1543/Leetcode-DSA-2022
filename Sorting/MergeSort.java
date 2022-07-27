package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort{
    static int[] mergesort(int[] arr){
        if(arr.length == 1) return arr;
        int s = 0;
        int e = arr.length-1;
        int m = s+(e-s)/2;
        int[] left = mergesort(Arrays.copyOfRange(arr, s, m+1));
        int[] right = mergesort(Arrays.copyOfRange(arr, m+1, e+1));
        return merge(left, right);
    }
    static int[] merge(int[] left, int [] right){
        int[] ans = new int[left.length+right.length];
        int i  = 0;
        int j = 0;
        int k = 0;
        while(i!=left.length && j!= right.length){
            if(left[i]<right[j]){
                ans[k] = left[i];
                i++;
            }else{
                ans[k] = right[j];
                j++;
            }
            k++;
        }
        while(i!=left.length){
            ans[k] = left[i];
            k++;
            i++;
        }
        while (j!=right.length){
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }
    static void inplacemergesort(int [] arr, int s, int e){
        if(s>=e) return;
        int m = s+(e-s)/2;
        inplacemergesort(arr, s, m);
        inplacemergesort(arr, m+1, e);
        inplacemerge(arr, s, m, e);
    }
    static void inplacemerge(int[] arr, int s, int m, int e){
        int[] ans = new int[e-s+1];
        int i = s;
        int j = m+1;
        int k = 0;
        while(i<=m && j<=e){
            if(arr[i]<arr[j]){
                ans[k] = arr[i];
                i++;
                k++;
            }else{
                ans[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i<=m){
            ans[k] = arr[i];
            i++;
            k++;
        }
        while (j<=e){
            ans[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < ans.length; l++) {
            arr[s+l] = ans[l];
        }
    }
    public static void main(String[] args) {
	int[] arr = {5, 15, 2, 1, 10};
        int[] ans = {9, 8, 4, 2, 1};
        inplacemergesort(arr, 0, arr.length-1);
        mergesort(ans, 0, ans.length-1);
        System.out.println(Arrays.toString(ans));
    }
}
