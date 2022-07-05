import java.util.Stack;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(find("abcdXdcba"));
    }
    public static boolean find(String s){
        Stack<Character> stack = new Stack<>();
        boolean check = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(check == true){
                if(ch != stack.pop()){
                    return false;
                }
            }else{
                if(ch!='X'){
                    stack.push(ch);
                }else{
                    check = true;
                }
            }
        }
        if(stack.isEmpty() == false){
            return false;
        }else{
            return true;
        }
    }
}

