public class Stack {
    protected int[] stackrep;
    private int top = -1;
    protected int capacity;

    Stack(){
        this.capacity = 10;
        stackrep = new int[10];
    }

    Stack(int capacity){
        this.capacity = capacity;
        stackrep = new int[capacity];
    }

    public void push(int data) throws Exception{
        if(size() == capacity){
            throw new Exception("OVER FLOW");
        }
        stackrep[++top] = data;
    }

    public int pop() throws Exception{
        if(top < 0){
            throw new Exception("UNDERFLOW");
        }
        int v = stackrep[top--];
        return v;
    }

    private boolean isEmpty() {
        if(size() == capacity){
            return true;
        }
        return false;
    }

    public void display(){
        for (int i = top; i > -1; i--) {
            System.out.println(stackrep[i]);
        }
    }

    public int peek(){
        return stackrep[top];
    }
    public int size(){
        return top+1;
    }

}
