public static boolean Search(Node node, int target){
        if(node.data == target){
            return true;
        }else if(node.right == null || node .left == null){
            return false;
        }
        return Search(node.left, target) || Search(node.right, target);
    }
