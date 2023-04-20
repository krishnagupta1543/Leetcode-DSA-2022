// https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1
class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public void solve(ArrayList<ArrayList<Integer>> adj, int vertex,boolean[] visited, ArrayList<Integer> arr){
        if(visited[vertex]){
            return;
        }
        arr.add(vertex);
        visited[vertex] = true;
        for(int i = 0; i < adj.get(vertex).size(); i++){
            solve(adj, adj.get(vertex).get(i), visited, arr);
        }
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> arr = new ArrayList<>();
        boolean[] visited = new boolean[V];
        solve(adj, 0, visited, arr);
        return arr;
    }
}
