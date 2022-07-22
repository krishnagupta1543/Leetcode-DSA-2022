public class DuplicateElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4,10};
        boolean ans = BinarySearch(arr, 0, arr.length-1);
        System.out.println(ans);
    }
    public static boolean BinarySearch(int[] arr, int low, int high) {
        if(low<=high){
                int mid = low + (high - low) / 2;
                if ((mid - 1) >= 0 && arr[mid] == arr[mid - 1]) {
                    return true;
                } else if ((mid + 1) <= high && arr[mid] == arr[mid + 1]) {
                    return true;
                } else {
                    BinarySearch(arr, low, mid - 1);
                    BinarySearch(arr, mid + 1, high);
                }
        }
        return false;
    }
}
