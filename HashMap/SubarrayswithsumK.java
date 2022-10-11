// https://practice.geeksforgeeks.org/problems/subarrays-with-sum-k/1
class Solution
{
    static int findSubArraySum(int arr[], int N, int target)
    {
        // Time complexity = O(N)
        // Space Complexity = O(N)
        HashMap<Integer, Integer> hp = new HashMap<>();
        int count = 0;
        int currsum = 0;
        for(int i = 0; i < arr.length; i++){
            currsum+=arr[i];
            if(currsum == target){
                count++;
            }
            int check = currsum-target;
            count+=hp.getOrDefault(check, 0);
            hp.put(currsum, hp.getOrDefault(currsum, 0)+1);
        }
        return count;
    }
}
