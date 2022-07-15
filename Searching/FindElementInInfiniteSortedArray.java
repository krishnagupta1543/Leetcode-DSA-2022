package out.production.Searching.java.com.company;

public class FindElementInInfiniteSortedArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,31,33,34,35,36,37,38,39,40, 41,42,43,44,45,46,47,48,49,50};
        int s = 0;	// The Array is infinite which means that you are not allowed to use array.length means you dont know the size of the array
        int e = 1;
        int target = 18;
        while( arr[e]<target){
            int news = e+1;
            e = e+(e-s+1)*2;  // Doubling the range of the of search
            s = news;
        }
        int ans = -1;
        while(s <= e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target){
                ans = mid;
                break;
            }else if(arr[mid] > target){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        System.out.println(arr[ans]);

    }
}

