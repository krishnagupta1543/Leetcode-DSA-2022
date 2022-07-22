public static ArrayList<Integer> levelorder(Node node){
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> levelorder = new ArrayList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            levelorder.add(temp.data);
            if(temp.left!=null) {
                queue.add(temp.left);
            }
            if(temp.right!=null) {
                queue.add(temp.right);
            }
        }
        return levelorder;
    }
