public class Floor{
    public static void main(String[] args) {
       int [] arr = {1, 3, 4, 5, 6, 7, 10};
       int target = 2;
        System.out.println(Ceiling(arr, target));
        System.out.println(FloorOfNumber(arr, target));
    }
    public static int FloorOfNumber(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;
        while (s <= e){
            int m = s+(e-s)/2;
            if(arr[m] == target){
                return m;
            }else if(arr[m] > target){
                e = m -1;
            }else{
                s = m+1;
            }
        }
        return e;
    }
}
