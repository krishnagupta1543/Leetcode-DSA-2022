//https://practice.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1
class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        // Bruteforce approch O(N)
        // for(int i = 0;i<n-2; i++){
        //     int sum = arr[i];
        //     for(int j = i+1; j < n-1;j++){
        //         sum+=arr[j];
        //         for(int k = j+1; k < n; k++){
        //             sum+=arr[k];
        //             if(sum == 0)
        //             {
        //                 return true;
        //             }
        //             else{
        //                 sum-=arr[k];
        //             }
        //         }
        //         sum-=arr[j];
        //     }
        // }
        // return false;
            Arrays.sort(arr);
            for(int index = 0; index < n-2; index++){
                int sum = arr[index];
                int i = index+1;
                int j = n-1;
                while(i < j){
                    int d = arr[i]+arr[j];
                    int temp = sum+d;
                    if(temp == 0){
                        return true;
                    }else if(temp > 0){
                        j--;
                    }else{
                        i++;
                    }
                }
            }
            return false;
        }
}
