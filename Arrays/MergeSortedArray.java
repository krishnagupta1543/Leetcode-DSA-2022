class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int i = 0;
        // int j = 0;
        // int[] ans = new int[m+n];
        // int index = 0;
        // while(i < m && j < n){
        //     if(nums1[i] <= nums2[j]){
        //         ans[index] = nums1[i];
        //         i++;
        //     }else{
        //         ans[index] = nums2[j];
        //         j++;
        //     }
        //     index++;
        // }
        // while(i < m){
        //     ans[index] = nums1[i];
        //     i++;
        //     index++;
        // }
        // while(j < n){
        //     ans[index] = nums2[j];
        //     j++;
        //     index++;
        // }
        // for(int k = 0; k < ans.length; k++){
        //     nums1[k] = ans[k];
        // }

        int k = nums1.length-1;
        int i = m-1;
        int j = n-1;

        while(i>=0 && j>=0){
            if(nums1[i] >= nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(k >= 0){
            if(j >= 0){
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
}
