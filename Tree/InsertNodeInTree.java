public static void InsertNode(Node node, int data)
    {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            if(temp.left == null){
                Node n = new Node(data);
                temp.left = n;
                break;
            }
            else if(temp.right == null){
                Node n = new Node(data);
                temp.right = n;
                break;
            }else{
                queue.add(temp.left);
                queue.add(temp.right);
            }
        }
    }
