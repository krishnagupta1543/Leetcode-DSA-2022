    static int floorrec(Node root, int key, int ans){
        if(root == null){
            return ans;
        }
        if(root.data == key){
            return root.data;
        }
        if(root.data > key){
            return floorrec(root.left, key, ans);
        }else if(root.data < key){
            return floorrec(root.right, key,root.data);
        }
        return ans;
    }
    static int ceilrec(Node root, int key, int ans){
        if(root == null){
            return ans;
        }
        if(root.data == key){
            return root.data;
        }
        if(root.data > key){
            ans = ceilrec(root.left, key, root.data);
        }else if(root.data < key){
            ans = ceilrec(root.right, key,ans);
        }
        return ans;
    }
    // Iterative Approach
    static int floor(Node root, int key){
        int ans = Integer.MAX_VALUE;
        while(root!=null){
            if(root.data == key){
                return root.data;
            }
            else if(root.data < key){
                ans = root.data;
                root = root.right;
            }else if(root.data>key){
                root = root.left;
            }
        }
        return ans;
    }
    // Iterative approach for ceil
    static int ceil(Node root, int key){
        int ans = Integer.MAX_VALUE;
        while(root!=null){
            if(root.data == key){
                return root.data;
            }
            else if(root.data < key){
                root = root.right;
            }else if(root.data>key){
                ans = root.data;
                root = root.left;
            }
        }
        return ans;
    }
