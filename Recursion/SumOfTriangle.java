//https://www.geeksforgeeks.org/sum-triangle-from-array/#:~:text=Given%20an%20array%20of%20integers,elements%20in%20the%20previous%20level.


import java.util.Arrays;

public class Sumtrianglefromarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7};
        System.out.println(Arrays.toString(findsum(arr)));
    }
    public static int[] findsum(int[] arr){
        if(arr.length == 1) return arr;
        else{
            int[] temp = new int[arr.length-1];
            helper(arr, temp, 0);
            return findsum(temp);
        }
    }
    public static void helper(int[] arr, int[] temp, int idx){
        if(idx == arr.length-1) return;
        else {
            int sum = arr[idx]+arr[idx+1];
            temp[idx] = sum;
            helper(arr, temp, idx+1);
        }
    }

}

