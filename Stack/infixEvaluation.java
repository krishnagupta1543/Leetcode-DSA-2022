import java.util.*;
import java.util.Stack;

public  class InfixEvalution {
    public static void main(String[] args) {
        String s = "2*(3+4)+3";
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '('){
                operator.push(ch);
            }else if(Character.isDigit(ch)){
                operand.push(ch-'0');
            }
            else if(ch == ')'){
                while(operator.peek()!='('){
                    int v1 = operand.pop();
                    int v2 = operand.pop();
                    char opr = operator.pop();
                    int value = ans(v2, v1,opr);
                    operand.push(value);
                }
                operator.pop();
            }
            else if(ch == '+' || ch == '-'|| ch == '*'||ch == '/'){
                while (operator.size()!=0 && operator.peek()!='(' && operatorprec(ch)<=operatorprec(operator.peek())){
                    int v1 = operand.pop();
                    int v2 = operand.pop();
                    int value = ans(v2, v1, operator.pop());
                    operand.push(value);
                }
                operator.push(ch);
            }
        }
        while(operator.size()!=0){
            int v1 = operand.pop();
            int v2 = operand.pop();
            char oper = operator.pop();
            int value = ans(v2,v1,oper);
            operand.push(value);
        }
        System.out.println(operand.peek());
    }
    public static int operatorprec(char ch){
        if(ch == '+' || ch == '-'){
            return 1;
        }
        else {
            return 2;
        }
    }
    public static int ans(int v1, int v2, char operator){
        if(operator == '+'){
            return v1+v2;
        }
        else if(operator == '-'){
            return v1-v2;
        }else if(operator == '*'){
            return v1*v2;
        }else {
            return v1/v2;
        }
    }
}
