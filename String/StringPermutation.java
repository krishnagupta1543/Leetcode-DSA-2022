// function is not returning anything
// string  = "abc"
// Permutation = [cab, acb, abc, cba, bca, bac]
static void Permutation(String s, String p){
        if(s.isEmpty()){
            System.out.print(p+" ");;
            return;
        }
        char ch = s.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String l = p.substring(i);
            Permutation( s.substring(1),f+ch+l);
        }
    }
// function is returning arraylist
    static ArrayList<String> Permutation(String s, String p){
        if(s.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> a = new ArrayList<>();
        char ch = s.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String l = p.substring(i);
            a.addAll(Permutation( s.substring(1),f+ch+l));
        }
        return a;
    }
// fuction is counting number of permutation 
// let string = "abc" number of permutation = 3! = 6 
    static int Permutation(String s, String p){
        if(s.isEmpty()){
            return 1;
        }
        int sum = 0;
        char ch = s.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String l = p.substring(i);
            sum+=Permutation(s.substring(1),f+ch+l);
        }
        return sum;
    }
