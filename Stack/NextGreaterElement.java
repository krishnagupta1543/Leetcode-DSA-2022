import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
        Stack<Integer> ans = new Stack<>();
        Stack<Integer> a = new Stack<>();
        int i = arr.length - 1;
        // for last element
        while(i >= 0){
            while( a.isEmpty()!=true && a.peek() <= arr[i]){
                a.pop();
            }
            if(a.isEmpty()){
                ans.push(-1);
            }else{
                ans.push(a.peek());
            }
            a.push(arr[i]);
            i-=1;
        }
        System.out.println(Arrays.toString(arr));
        int j = 0;
        while (!ans.isEmpty()){
            arr[j] = ans.pop();
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }

}


