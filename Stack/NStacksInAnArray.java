// https://www.codingninjas.com/codestudio/problems/n-stacks-in-an-array_1164271?leftPanelTab=0
import java.util.* ;
import java.io.*; 
public class NStack {
    int[] arr;
    int[] next;
    int[] top;
    int freeSpot = 0;
    // Initialize your data structure.
    public NStack(int N, int S) {
        // Write your code here.
        next = new int[S];
        top = new int[N];
        arr = new int[S];
        for(int i = 0; i < S-1; i++){
            next[i] = i+1;
        }
        next[S-1] = -1;
        Arrays.fill(top, -1);
    }

    // Pushes 'X' into the Mth stack. Returns true if it gets pushed into the stack, and false otherwise.
    public boolean push(int x, int m) {
        // Write your code here.
        if(freeSpot == -1){
            return false;
        }
        int index = freeSpot;
        arr[index] = x;
        freeSpot = next[index];
        next[index] = top[m-1];
        top[m-1] = index;
        return true;
    }

    // Pops top element from Mth Stack.
    // Returns -1 if the stack is empty, otherwise returns the popped element.
    public int pop(int m) {
        // Write your code here.
        if(top[m-1] == -1){
            return -1;
        }
        int index = top[m-1];
        top[m-1] = next[index];
        next[index] = freeSpot;
        freeSpot = index;
        return arr[index];
    }
}
