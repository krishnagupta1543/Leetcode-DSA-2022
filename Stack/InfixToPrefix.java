import java.util.*;
public class Check{
    public static int Prec(String ch){
        switch(ch){
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            case "^":
                return 3;
        }
        return -1;
    }
    public static String solve(String x){
        Stack<String> operand = new Stack<>();
        Stack<String> operator = new Stack<>();
        for(int i = 0; i < x.length();i++){
            char ch = x.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                operand.push(String.valueOf(ch));
            }else if(ch == '(')
            {
                operator.push(String.valueOf(ch));
            }else if(ch == ')'){
                while(operator.isEmpty()!=true && operator.peek().equals("(")!=true){
                    String v2 = operand.pop();
                    String v1 = operand.pop();
                    operand.push(operator.pop()+v1+v2);
                }
                operator.pop();
            }else if(operator.isEmpty()!=true && Prec(String.valueOf(ch))<=Prec(String.valueOf(operator.peek()))){
                while(operator.isEmpty()!=true && Prec(String.valueOf(ch))<=Prec(String.valueOf(operator.peek()))){
                    String v2 = operand.pop();
                    String v1 = operand.pop();
                    operand.push(operator.pop()+v1+v2);
                }
                operator.push(String.valueOf(ch));
            }else{
                operator.push(String.valueOf(ch));
            }
        }
        while(operator.isEmpty()!=true){
            String v2 = operand.pop();
            String v1 = operand.pop();
            operand.push(operator.pop()+v1+v2);
        }
        String ans = operand.pop();
        return ans;
    }

    public static void main(String[] args) {
        String x = "a*(b-c)/d+e";
        String ans = solve(x);
        System.out.println(ans);
    }
}
