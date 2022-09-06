// RECURSIVE WAY
static int size(Node root){
        if(root == null) return 0;
        int leftcount = size(root.left);
        int rightcount = size(root.right);
        return 1+leftcount+rightcount;
    }
// ITERATIVE WAY
    static int SizeRecursion(Node root){
        if(root == null) return 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int count = 0;
        while(!queue.isEmpty()){
            count+=1;
            Node temp = queue.poll();
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
        return count;
    }
