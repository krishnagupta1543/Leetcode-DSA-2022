// https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
        // Time complexity O(v+e)
        // v = number of vertices
        // e = number of edges
        
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        ans.add(queue.peek());
        visited[0] = true;
         while(!queue.isEmpty()){{
            int p = queue.poll();
                for(int j : adj.get(p)){
                    if(!visited[j])
                    {
                        visited[j] = true;
                        ans.add(j);
                        queue.offer(j);
                    }
                }
            }
        }
        return ans;
    }
}
