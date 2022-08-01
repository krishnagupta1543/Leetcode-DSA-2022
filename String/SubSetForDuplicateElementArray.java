 static ArrayList<ArrayList<Integer>> Subsequencedup(int[] a){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int j = 0; j < a.length;j++){
            for(int i = start; i <= end; i++){
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(a[j]);
                outer.add(inner);
            }
            if(j < a.length-1 && a[j] == a[j+1]){
                start = end+1;
            }
            end = outer.size()-1;
        }
        return outer;
    }
     public static void main(String[] args) {
//         System.out.println(find("abc"));
         ArrayList<ArrayList<Integer>> ans = Subsequencedup(new int[]{1, 2, 2});
         System.out.println(ans);
    }
