static boolean nodetoroot(Node node, int data)
    {
        if(node == null) return false;
        if(node.data == data) {
            System.out.print(node.data+"- >");
            return true;
        }
        boolean fil =  nodetoroot(node.left, data);
        if(fil){
            System.out.print(node.data+"- >");
            return true;
        }
        boolean fir = nodetoroot(node.right, data);
        if(fir){
            System.out.print(node.data+"- >");
            return true;
        }
        return false;
    }
