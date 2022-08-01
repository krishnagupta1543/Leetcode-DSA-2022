 public static int findheight(Node node){
        if(node == null) {
           // to find the height in terms of nodes return 0 and to find height in terms of edges return 0
           return -1;
	   
        }
        return Math.max(findheight(node.left), findheight(node.right))+1;
    }
