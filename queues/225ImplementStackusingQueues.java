// https://leetcode.com/problems/implement-stack-using-queues/description/
class MyStack {

    Queue<Integer> queue1;
    Queue<Integer> queue2;
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();    
    }
    
    public void push(int x) {
        queue1.add(x);
    }
    
    public int pop() {
        int ans = -1;
        while(!queue1.isEmpty()){
            int value = queue1.remove();
            if(!queue1.isEmpty()){
                queue2.add(value);
            }else{
                ans = value;
            }
        }
        while(!queue2.isEmpty()){
            int value = queue2.remove();
            queue1.add(value);
        }
        return ans;
    }
    
    public int top() {
        int top = -1;
        while(!queue1.isEmpty()){
            int value = queue1.remove();
            if(queue1.isEmpty()){
                top = value;
            }
            queue2.add(value);
        }
        while(!queue2.isEmpty()){
            int value = queue2.remove();
            queue1.add(value);
        }
        return top;
    }
    
    public boolean empty() {
        if(queue1.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
