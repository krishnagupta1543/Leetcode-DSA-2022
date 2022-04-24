//https://practice.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1/#
class Solution {
    void segregate0and1(int[] arr, int n) {
        // code here
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            while(arr[i] != 1){
                i++;
            }
            while(arr[j]!=0){
                j--;
            }
            if(i < j){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }
        }
    }

}

