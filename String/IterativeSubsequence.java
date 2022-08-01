// For Strings
    static ArrayList<String> Subsequence(String s){
        ArrayList<String> ans = new ArrayList<>();
        ans.add("");
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            ArrayList<String> p = new ArrayList<>();
            int siz = ans.size();
            for (int j = 0; j < siz; j++) {
                String n = ans.get(j);
                n+=a;
                p.add(n);
            }
            ans.addAll(p);
        }
        return ans;
    }
    
    // for array
    static ArrayList<ArrayList<Integer>> subSet(int[] a){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:a){
            int size = outer.size();
            for(int i = 0 ; i < size; i++){
                ArrayList<Integer> temp = new ArrayList<>(outer.get(i));
                temp.add(num);
                outer.add(temp);
            }
        }
        return outer;
    }
