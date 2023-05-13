class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
        Arrays.sort(A);
        for(int index = 0; index < n-2; index++){
            int sum = A[index];
            int i = index+1;
            int j = n-1;
            while(i < j){
                int d = A[i]+A[j];
                int temp = sum+d;
                
                if(temp == X){
                    return true;
                }else if(temp > X){
                    j--;
                }else{
                    i++;
                }
            }
        }
        return false;
    
    }
}

