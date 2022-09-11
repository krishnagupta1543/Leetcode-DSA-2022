// https://leetcode.com/problems/maximum-performance-of-a-team/

class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        // team_m[0] ->efficiency speed team_m[1] -> speed
        int[][] team_m = new int[n][2];
        // combine the speed and efficiency 
        for(int i = 0; i < n; i++){
            team_m[i][0] = efficiency[i];
            team_m[i][1] = speed[i];
        }
        // we are sorting array on the basis of efficiency in decreasing order because we want the minimum efficiency as mentioned in the formula for finding performance in question 
        Arrays.sort(team_m, (a, b) -> b[0] - a[0]);
        // when the size of the speedqueue become greater than k we poll the element with minimum speed so that we can find the maximum performance
        PriorityQueue<Integer> speedqueue = new PriorityQueue<>(k); 
        
        long speedv = 0;
        long performance = 0;
        for(int i = 0; i < n; i++){
            // when size of the queue become equal to k
            if(speedqueue.size() == k){
                // subtract the value of removed speed with speedv
                speedv -= speedqueue.poll(); 
            }
            // for each iteration increase the speed of speedv by speedv+=team_m[i][1]
            speedv+=team_m[i][1];
            // add speed to speedqueue
            speedqueue.offer(team_m[i][1]);
            performance = Math.max(performance, speedv*team_m[i][0]);
        }
        // return as mentioned in question and cast the result as we have to return int
        return (int)(performance%1000000007);
    }

}
