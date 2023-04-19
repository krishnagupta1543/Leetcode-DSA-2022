
class Solution{
    public void insert(int[] arr, int index, int data){
        arr[index] = data;
        while(index > 0){
            int parent = index/2+1;
            if(arr[index] > arr[parent]){
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
                index = parent;
            }else{
                return;
            }
        }
    }
    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        // your code here
        int[] ans = new int[a.length+b.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while(i < a.length && j < b.length){
            if(a[i] > b[j]){
                insert(ans, index, a[i]);
                index++;
                i++;
            }else{
                insert(ans,index,b[j]);
                index++;
                j++;
            }
        }
        while(i < a.length){
            insert(ans, index, a[i]);
            index++;
            i++;
        }
        while(j < b.length){
            insert(ans, index,b[j]);
            index++;
            j++;
        }
        return ans;
    }
}
