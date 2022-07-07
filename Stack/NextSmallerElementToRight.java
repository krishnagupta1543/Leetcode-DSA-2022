import java.util.Arrays;
import java.util.Stack;
public class NextSmallerElementToRight {
    public static void main(String[] args) {
        int[] arr = {11, 13,21,3};
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >=0; i--) {
                while(stack.isEmpty()!=true && arr[stack.peek()]>arr[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    ans[i] = -1;
                }else{
                    ans[i] = stack.peek();
                }
                stack.push(i);
            }
        System.out.println(Arrays.toString(ans));
        }
    }


