package com.company;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        ArrayList<String> ans = Permutation("ecdpl", "");
        System.out.println(ans);
    }
    public static ArrayList<String> Permutation(String up, String p){
        if(up.isEmpty()){
            ArrayList<String> x = new ArrayList<>();
            x.add(p);
            return x;
        }
        ArrayList<String> x = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            x.addAll(Permutation(up.substring(1), f+ch+s));
        }
        return x;
    }
}

