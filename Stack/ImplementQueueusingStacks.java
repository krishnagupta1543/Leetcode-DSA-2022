// https://leetcode.com/problems/implement-queue-using-stacks/description/
class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        int ans = -1;
        while(!stack1.isEmpty()){
            int value = stack1.pop();
            stack2.push(value);
        }
        ans = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return ans;
    }
    
    public int peek() {
        int ans = -1;
         while(!stack1.isEmpty()){
            int value = stack1.pop();
            stack2.push(value);
        }
        ans = stack2.peek();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return ans;
    }
    
    public boolean empty() {
        if(stack1.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
