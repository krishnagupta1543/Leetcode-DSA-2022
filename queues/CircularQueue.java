public class CircularQueue {
    int [] arr = new int[10];
    int size;
    int f = 0;
    int e = 0;

    CircularQueue(){
        this.size = 0;
    }

    public void push(int data) throws  Exception{
        if(size == 10){
            throw new Exception("Queue is Full");
        }
        e = e%10;
        arr[e] = data;
        e++;
        size++;
    }

    public int pop() throws Exception{
        if(size == 0){
            throw new Exception("Queue is Empty");
        }
        int remove = arr[f];
        f++;
        size--;
        return remove;
    }

    public void display(){
       int i = f;
       do{
           System.out.print(arr[i]+" <- ");
           i = (i+1)% arr.length;
       }while(i != e);

    }

    public boolean isEmpty(){
        if(size == 0)
        {
            return true;
        }else{
            return false;
        }
    }
}

