
public class FibonacciNumber{
    // Recurrence relation is F(N) = F(N-1) + F(N-2)
    // Time Complexity is O(1.61)^n
    public static int fib(int n){
       if(n<=1){
           return n;
       }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));
    }
}
