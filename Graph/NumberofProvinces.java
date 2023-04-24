// https://practice.geeksforgeeks.org/problems/number-of-provinces/1
// Time Complexity O(v^2)+O(V+E)
class Solution {
    public static void dfs(int vertice, int V, ArrayList<ArrayList<Integer>> adjLst,int[]visited){
        if(visited[vertice] == 1){
            return;
        }
        visited[vertice] = 1;
        for(int i = 0; i < adjLst.get(vertice).size(); i++){
            dfs(adjLst.get(vertice).get(i), V, adjLst, visited);
        }
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> arr, int V) {
        // code here
         ArrayList<ArrayList<Integer>> adjLst = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adjLst.add(new ArrayList<>());
        }
        for(int i = 0; i < V;i++){
            for(int j = 0; j < V; j++){
                if(arr.get(i).get(j) == 1 && i != j){
                    adjLst.get(i).add(j);
                }
            }
        }
        int province = 0;
        int[] visited = new int[V];
        for (int i = 0; i < V; i++) {
            if(visited[i] != 1){
                province+=1;
                dfs(i, V, adjLst, visited);
            }
        }
        return province;
    }
};
