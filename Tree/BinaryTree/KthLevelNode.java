  static void printk(Node node, int level){
        if(node == null || level < 0) return ;
        if(level == 0){
            System.out.println(node.data);
            return;
        }
        printk(node.left,level-1);
        printk(node.right,level-1);
    }
