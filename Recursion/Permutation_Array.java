package com.company.Recursion.Backtracking;
import com.company.Permutation;
// WITH OUT DUPLICATE
import java.util.ArrayList;
import java.util.List;
public class Permutation_I {
    public static void main(String[] args) {
        int[] num = {1, 2};
        List<List<Integer>> ans = Permute(num, 0);
        System.out.println(ans);
    }
    public static List<Integer> getList(int[] arr){
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            ans.add(arr[i]);
        }
        return ans;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static List<List<Integer>> Permute(int[] arr, int idx){
        if(idx == arr.length){
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(getList(arr));
            return ans;
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = idx; i < arr.length; i++) {
            swap(arr, idx, i);
            ans.addAll(Permute(arr, idx+1));
            swap(arr, idx, i);
        }
        return ans;
    }
}

