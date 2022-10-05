// https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
class Solution{
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int arr[], int N, int k) {
        //Complete the function
        int s = 0;
        int e = -1;
        int sans = -1;
        int eans = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum+=arr[i];
            if(sum == k){
                s = 0;
                e = i;
                if((e-s+1)>=(eans-sans+1)){
                    sans = s;
                    eans = e;
                }
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
            if(map.containsKey(sum-k)){
                s = map.get(sum-k)+1;
                e = i;
                if((e-s+1)>=(eans-sans+1)){
                    sans = s;
                    eans = e;
                }
            }
        }
        if(sans == -1 || eans == -1){
            return 0;
        }
        return eans-sans+1;
    }
}



