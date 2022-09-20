class Solution
{
    //Function to find the vertical order traversal of Binary Tree.
    static class Pair{
        int idx;
        Node node;
        Pair(int idx, Node n){
            this.idx = idx;
            this.node = n;
        }
    }
    static ArrayList <Integer> verticalOrder(Node root)
    {
        // add your code here
        Queue<Pair> queue = new ArrayDeque<>();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        queue.offer(new Pair(0, root));
        while(!queue.isEmpty()){
            Pair p = queue.poll();
            if(map.containsKey(p.idx)){
                map.get(p.idx).add(p.node.data);
            }else{
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(p.node.data);
                map.put(p.idx, temp);
            }
            if(p.node.left!=null){
                queue.add(new Pair(p.idx-1, p.node.left));
            }
            if(p.node.right!=null){
                queue.add(new Pair(p.idx+1, p.node.right));
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(Map.Entry<Integer, ArrayList<Integer>> e: map.entrySet()){
            arr.addAll(e.getValue());
        }
        return arr;
    }
}
