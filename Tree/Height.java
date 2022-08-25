 public static int findheight(Node node){
        if(node == null) {
           // to find the height in terms of nodes return 0 and to find height in terms of edges return 0
           return -1;
	   
        }
        return Math.max(findheight(node.left), findheight(node.right))+1;
    }
// iterative
    static void height(Node node){
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        Node prev = null;
        int depth = 1;
        while(!stack.isEmpty()){
            Node curr = stack.peek();
            if(prev == null || prev.right == curr || prev.left == curr){
                if(curr.left!=null){
                    stack.push(curr.left);
                }else if(curr.right!=null){
                    stack.push(curr.right);
                }
            }else if(curr.left == prev){
                if(curr.right!=null){
                    stack.push(curr.right);
                }
            }else{
                stack.pop();
            }
            prev = curr;
            if(stack.size()>depth){
                depth = stack.size();
            }
        }
        System.out.println(depth-1);
    }
