// https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1
class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // Time Complexity = O(NLogN)
        // your code here
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return arr[0]+arr[1];
        }
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i = 0; i < arr.length; i++){
            pq.offer(arr[i]);
        }
        long totalCost = 0;
        
        while(!pq.isEmpty()){
            long sum = pq.poll()+pq.poll();
            totalCost += sum;
            if(!pq.isEmpty()){
                pq.offer(sum);
            }
        }
        return totalCost;
    }
:x
:c
