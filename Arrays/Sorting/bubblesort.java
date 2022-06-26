// Iterative method

public static void main(String[] args){
        int[] arr = {4, 3, 2, 1, 0, 12, -5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
}

//Recursive method

 public static void main(String[] args){
        int[] arr = {4, 3, 2, 1};
        bubblesort(arr,3,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubblesort(int [] arr,int r, int c){
        if(r == 0) return;
        if(r>c){
            if (arr[c] > arr[c + 1]) {
                int t = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = t;
            }
            bubblesort(arr, r, c + 1);
        }else {
            bubblesort(arr, r - 1, 0);
        } 

    }
