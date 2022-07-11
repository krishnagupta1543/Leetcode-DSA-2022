//https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int [] ans = new int[2];
        for(int i = 0; i < n; i++){
            int index = Math.abs(arr[i]) - 1;
            if(arr[index] < 0){
                ans[0] = index+1;
            }else{
                arr[index]*=-1;
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i]>0){
                ans[1]=i+1;
            }
        }
        return ans;
    }
}
