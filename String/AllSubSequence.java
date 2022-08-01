static void subsequenc(String s, String p){
         if(s.isEmpty()) {
             System.out.println(p);
             return;
         }
         char t = s.charAt(0);
         subsequenc(s.substring(1),p+t);
         subsequenc(s.substring(1), p);
     }

// Returning arraylist

    static ArrayList<String> subsequencrtn(String s, String p){
        if(s.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char t = s.charAt(0);
        ArrayList<String> left = subsequencrtn(s.substring(1),p+t);
        ArrayList<String> right = subsequencrtn(s.substring(1), p);
        left.addAll(right);
        return left;
    }
