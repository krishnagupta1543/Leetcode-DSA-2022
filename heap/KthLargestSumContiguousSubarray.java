class Solution {
    public static int kthLargest(int N, int k, int[] arr) {
        // code here
        // Time Complexity = O(N2 * log K)
        // Space Complexity = O(K)
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        
         for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum += arr[j];
                if(pq.isEmpty() || pq.size() < k){
                    pq.offer(sum);
                }else if(pq.peek() < sum){
                    pq.poll();
                    pq.offer(sum);
                }
            }
        }
        return pq.peek();
    }
}
