//https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1
class Solution
{
    ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
        // code here 
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>(k);
        for(int i = 0; i < k; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        ans.add(map.size());
        for(int j = k; j < arr.length; j++){
            if(map.get(arr[j-k]) == 1){
                map.remove(arr[j-k]);
            }else{
                map.put(arr[j-k], map.get(arr[j-k])-1);
            }
            map.put(arr[j], map.getOrDefault(arr[j], 0)+1);
            ans.add(map.size());
        }
        return ans;
    }
}
