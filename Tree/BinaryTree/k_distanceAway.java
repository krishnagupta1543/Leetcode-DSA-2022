//https://www.pepcoding.com/resources/online-java-foundation/binary-tree/print-nodes-k-away-binary-tree-official/ojquestion
static ArrayList<Node> ans = new ArrayList<>();
    static boolean NodeToRoot(Node node, int data){
        if(node == null){
            return false;
        }
        if(node.data == data){
            ans.add(node);
            return true;
        }
        boolean cil = NodeToRoot(node.left, data);
        if(cil){
            ans.add(node);
            return true;
        }
        boolean cir = NodeToRoot(node.right, data);
        if(cir){
            ans.add(node);
            return true;
        }
        return false;
    }
    static void printk(Node node, int level, Node block){
        if(node == null || level < 0 || node == block) return ;
        if(level == 0){
            System.out.println(node.data);
            return;
        }
        printk(node.left,level-1, block);
        printk(node.right,level-1, block);
    }
  public static void printKNodesFar(Node root, int data, int k) {
    // write your code here
    if(root == null) return ;
        NodeToRoot(root, data);
        for (int i = 0; i < ans.size(); i++) {
            printk(ans.get(i), k-i, (i == 0)? null : ans.get(i-1));
        }
  }
