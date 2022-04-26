class Solution {
    public void rotate(int[] nums, int k) {
        if(k<0){
            k = k+nums.length;
        }
        if(k > nums.length){
            k = k%nums.length;
        }
        reverse(nums, 0, nums.length -1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    static void reverse(int [] a, int i, int j){
        int s = i;
        int e = j;
        while(s<e){
            int t = a[s];
            a[s] = a[e];
            a[e] = t;
            s++;
            e--;
        }
    }
}
