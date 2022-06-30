package com.company;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        String s ="(a+b)+(c+d)";
        Stack<Character> a = new Stack<>();
        boolean c = false;
        for (int i = 0;i < s.length() ;i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                if(a.peek() == '('){
                    c = true;
                }else{
                    while(a.peek()!='('){
                        a.pop();
                    }
                    a.pop();
                }
            }else{
                a.push(ch);
            }
        }
        System.out.println(c);
    }
}

