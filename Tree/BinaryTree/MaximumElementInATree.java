// RECURSIVE WAY
static int maximum(Node root){
        if(root == null) return -1;
        int left = maximum(root.left);
        int right = maximum(root.right);
        return Math.max(Math.max(left, right), root.data);
    }
// ITERATIVE WAY USING STACK
static int ma_x = Integer.MIN_VALUE;
    public static int maxi2(Node root) {
        Stack<Node> stack = new Stack<>();
        while (true) {
            if (root != null) {
                if(root.data > ma_x){
                    ma_x = root.data;
                }
                stack.push(root);
                root = root.left;
            } else if (stack.isEmpty()) {
                break;
            } else {
                Node temp = stack.pop();
                root = temp.right;
            }
        }
        return ma_x;
    }
// ITERATIVE WAY USING QUEUE
static int mx  =  Integer.MIN_VALUE;
    public static int findmx(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp = queue.poll();
            if(temp!=null){
                if(temp.data>mx){
                    mx = temp.data;
                }
                if(temp.left!=null) {
                    queue.add(temp.left);
                }if(temp.right!=null) {
                    queue.add(temp.right);
                }
            }
        }
        return mx;
    }
