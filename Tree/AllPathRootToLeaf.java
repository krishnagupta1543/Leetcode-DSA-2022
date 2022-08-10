// https://www.pepcoding.com/resources/online-java-foundation/binary-tree/binary-tree-path-to-leaves-from-root-official/ojquestion
static void printroottoleaf(Node node, String path,int sum, int lo, int hi){
        if(node == null) return;
        if(node.left == null && node.right == null){
            sum+=node.data;
            if(lo<=sum && sum<=hi) {
                System.out.println(path+node.data);
            }
            return;
        }
        printroottoleaf(node.right, path+node.data+" ",sum+node.data, lo, hi);
        printroottoleaf(node.left, path+node.data+" ",sum+node.data, lo, hi);
    }
