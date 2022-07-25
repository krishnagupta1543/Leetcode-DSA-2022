// geeksforgeeks.org/program-for-length-of-a-string-using-recursion/
package com.company;

public class Try {
    public static int size(String s){
        if(s.isEmpty()) return 0;
        return 1+size(s.substring(1));
    }
    public static void main(String[] args) {
        String s = "GeeksforGeeks";
        System.out.println(size(s));
        s = s.replaceAll("G", "");
        System.out.println(s);
    }
}


