public class DynamicStack extends Stack {
    DynamicStack(){
        super();
    }
    DynamicStack(int cap){
        super(cap);
    }
    @Override
    public void push (int data) throws Exception{
        if(size() == capacity){
            int[] temp = new int[stackrep.length*2];
            for (int i = 0; i < stackrep.length; i++) {
                temp[i] = stackrep[i];
            }
            stackrep = temp;
            capacity = stackrep.length;
        }
        super.push(data);
    }
}
