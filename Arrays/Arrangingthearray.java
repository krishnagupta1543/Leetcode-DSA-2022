// https://practice.geeksforgeeks.org/problems/arranging-the-array1131/1
class Compute {
    
    public void Rearrange(long arr[], long n)
    {
        // Your code goes here
        int i = 0;
        while(i < arr.length){
            if(arr[i]<0){
            long temp = arr[i];
            int j = i;
            while(j > 0 && arr[j-1]>=0){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
            }
            i++;
        }
    }
}
