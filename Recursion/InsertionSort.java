 public static void insertionsort(int[] arr, int n){
        if(n == 0){
            return ;
        }
        insertionsort(arr,n-1);

        int j = n;
        int last = arr[j];
        while(j>0 && arr[j-1] > last){
            arr[j] = arr[j-1];
            j--;
        }
        arr[j] = last;
    }
    public static void main(String[] args) {
        int[] arr = {35, 3, 12, 0, 5};
        insertionsort(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
