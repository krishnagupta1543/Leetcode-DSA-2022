// https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1#
class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> ans= new ArrayList<>();
        int low = 0;
        int  high = n-1;
        int i = -1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid]==x){
                i = mid;
                break;
            }else if(arr[mid]>x){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        int m = i;
        if(m!=-1){
        while(m>=0 && arr[m] == x){
            m--;
        }
        ans.add((long)(m+1));
        m = i;
        while(m<arr.length && arr[m] == x){
            m++;
        }
        ans.add((long)(m-1));
        }else{
            ans.add((long)(m));
            ans.add((long)(m));
        }
        return ans;
    }
}
