package com.company;

import java.util.ArrayList;
import java.util.Arrays;
public class Reverse {

    public static void main(String[] args) {
        // Using char Array

        String s = "krishna";
        char [] arr = s.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        s =String.valueOf(arr);
        System.out.println(s);

        // using extra New String

        String p = "Greek for Greek";
        String newstr = "";
        for (int k = p.length()-1; k >-1 ; k--) {
            newstr+=p.charAt(k);
        }
        System.out.println(newstr);
    }
}

