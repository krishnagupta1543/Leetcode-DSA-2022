// RECURSIVE
public static boolean Search(Node node, int target){
        if(node.data == target){
            return true;
        }else if(node.right == null || node .left == null){
            return false;
        }
        return Search(node.left, target) || Search(node.right, target);
    }
// ITERATIVE
public static boolean Search2(Node node, int target){
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            if(temp.data == target){
                return true;
            }else if(temp.left!=null){
                queue.add(temp.left);
            }else if(temp.right!=null){
                queue.add(temp.right);
            }
        }
        return false;
    }
