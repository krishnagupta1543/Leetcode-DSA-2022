import java.util.Stack;

public class InfixtToPostfix {
    public static void main(String[] args) {
        String s = "a+(b*c)+d";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(ch);
            }else if(ch == ')'){
                while (stack.isEmpty()!=true && stack.peek()!='('){
                    System.out.print(stack.pop());
                }
                stack.pop();
            }
            else if(ch == '+' || ch == '-'|| ch == '*' || ch == '/' || ch == '^'){
                while(stack.isEmpty()!=true && stack.peek()!='(' && precedence(ch)<=precedence(stack.peek())){
                    System.out.print(stack.pop());
                }
                stack.push(ch);
            }else {
                System.out.print(ch);
            }
        }
        while (stack.isEmpty()!=true){
            System.out.print(stack.pop());
        }
    }
    public static int precedence(char ch){
        if(ch == '+' || ch == '-'){
            return 1;
        }
        else if(ch == '*' || ch == '/'){
            return 2;
        }else{
            return 3;
        }
    }

}
