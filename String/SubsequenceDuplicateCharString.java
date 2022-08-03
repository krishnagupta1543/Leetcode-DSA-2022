    //  This algo works only for duplicate character in adjacent like abb if bab is string then this algo doesn't work 
    static ArrayList<String> sub(String s){
        ArrayList<String> ans = new ArrayList<>();
        ans.add("");
        int start = 0,end = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            for (int j = start; j <= end; j++) {
                String tempstring = ans.get(j);
                tempstring+=ch;
                ans.add(tempstring);
            }
            if(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                start = end+1;
            }
            end = ans.size()-1;
        }
        return ans;
    }
