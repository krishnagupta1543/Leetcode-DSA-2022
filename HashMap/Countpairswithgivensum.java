// https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1
class Solution {
    int getPairsCount(int[] arr, int n, int sum) {
        int count = 0;
		HashMap<Integer, Integer> hp = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			int need = sum-arr[i];
			count += hp.getOrDefault(need, 0);
			hp.put(arr[i], hp.getOrDefault(arr[i], 0)+1);
		}
		return count;
    }
}
