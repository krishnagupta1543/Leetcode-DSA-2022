// Custom Implementation of Queue
public class Queue {
    int[] arr = new int[10];
    int size ;
    int top = 0;

    Queue(){
        this.size = 0;
    }

    public void push(int data) throws Exception{
        if(size == 10){
            throw new Exception("Queue is Full");
        }
        arr[top++] = data;
        size++;
    }

    public int pop() throws Exception{
        if(size == 0){
            throw new Exception("Queue is Empty");
        }
        int removedata = arr[0];
        for (int i = 1; i < top; i++) {
            arr[i-1] = arr[i];
        }
        top--;
        size--;
        return removedata;
    }

    public int Size(){
        return size;
    }

    public boolean isEmpty()
    {
        if(size == 0){
            return true;
        }else {
            return false;
        }
    }

    public void display(){
        for (int i = 0; i < top; i++) {
            System.out.print(arr[i]+" <- ");
        }
        System.out.println("END");
    }
}

