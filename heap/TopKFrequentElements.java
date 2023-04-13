//https://leetcode.com/problems/top-k-frequent-elements/description/
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == nums.length){
            return nums;
        }
        int[] ans = new int[k];
        HashMap<Integer, Integer> hp = new HashMap<>();
        for(int i : nums){
            hp.put(i, hp.getOrDefault(i, 0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> hp.get(b) - hp.get(a));
        for(int n: hp.keySet()){
            pq.offer(n);
        }
        int index = 0;
        while(index < k){
            ans[index] = pq.poll();
            index++;
        }
        return ans;
    }
}
