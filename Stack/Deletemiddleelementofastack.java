//https://practice.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1
class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        Stack<Integer>temp = new Stack<>();
        int no_of_times = sizeOfStack/2;
        while(no_of_times!=0){
            temp.push(s.pop());
            no_of_times--;
        }
        s.pop();
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }
       
    } 
}
