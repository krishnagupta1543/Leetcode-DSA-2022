import java.util.* ;

import java.io.*; 
public class Solution {
    public static int findMinimumCost(String str) {
      if(str.length()%2 == 1){
        return -1;
      }
		// Write your code here
     Stack<Character> stack = new Stack<>();
     for(int i = 0; i < str.length(); i++){
       char ch = str.charAt(i);
       if(ch == '{'){
         stack.push(ch);
       }else {
         if(stack.isEmpty()!=true && stack.peek() == '{'){
           stack.pop();
         }else{
           stack.push(ch);
         }
       }
     }

     int a = 0; // opening brackets
     int b = 0; // closing brackets
     while(stack.isEmpty()!=true){
        char pch = stack.pop();
        if(pch == '{'){
          a++;
        }else{
          b++;
        }
     }
     return ((a+1)/2) +((b+1)/2); 
}
}
