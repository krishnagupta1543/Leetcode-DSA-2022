// https://practice.geeksforgeeks.org/problems/deee0e8cf9910e7219f663c18d6d640ea0b87f87/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
         //   using heap but extend expected time complexity
	 //   PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> b-a);
    //   ArrayList<Integer> ans = new ArrayList<>();
    //   for(int i = 0; i < k; i++){
    //       pq.offer(arr[i]);
    //   }
    //   ans.add(pq.peek());
    //   int start = 0;
    //   int end = k;
       
    //   while(end < n){
    //       pq.remove(arr[start]);
    //       pq.offer(arr[end]);
    //       start++;
    //       end++;
    //       ans.add(pq.peek());
    //   }
    //     return ans;
       ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 0; i < k; i++){
            if(dq.isEmpty()){
                dq.addFirst(i);
            }
            while(dq.isEmpty()!=true && i-dq.peekFirst()>=k){
                    dq.pollFirst();
                }
            while(dq.isEmpty()!=true && arr[dq.peekLast()] < arr[i]){
                    dq.pollLast();
                }
                dq.offerLast(i);
        }
            ans.add(arr[dq.peekFirst()]);
            for(int i = k; i < arr.length; i++){
                 while(dq.isEmpty()!=true && i-dq.peekFirst()>=k){
                    dq.pollFirst();
                }
                while(dq.isEmpty()!=true && arr[dq.peekLast()] < arr[i]){
                    dq.pollLast();
                }
                dq.offerLast(i);
                ans.add(arr[dq.peekFirst()]);
            }
        return ans;
    }
}
