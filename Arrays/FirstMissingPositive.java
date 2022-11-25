class Solution {
    // BRUTEFORCE APPROACH 
    
    // TIME COMPLEXITY: O(3N) = O(N)
    // SPACE COMPLEXITY: O(N)
    // public int firstMissingPositive(int[] nums) {
    //     HashMap<Integer, Character> hp = new HashMap<>();
    //     for(int i = 0 ; i < nums.length; i++){
    //         hp.put(i+1, 'f');
    //     }

    //     for(int i = 0; i < nums.length; i++){
    //         if(hp.containsKey(nums[i])){
    //             hp.put(nums[i], 't');
    //         }
    //     }

    //     for(Map.Entry<Integer, Character> e: hp.entrySet()){
    //         if(e.getValue() == 'f'){
    //             return e.getKey();
    //         }
    //     }
    //     return nums.length+1;
    // }

    // OPTIMISED APPROACH
    // TIME COMPLEXITY = O(2N) = O(N)
    // SPACE COMPLEXITY = O(1)
     public int firstMissingPositive(int[] nums) {
       int j = 0;
       while(j < nums.length){
           int correctIndx = nums[j]-1;
           if(nums[j]>0 && nums[j]<=nums.length && nums[j]!=nums[correctIndx]){
               int temp = nums[j];
               nums[j] = nums[correctIndx];
               nums[correctIndx] = temp;
           }else{
               j++;
           }
       }
       for(int i = 0;i < nums.length; i++){
           if(nums[i] != i+1){
               return i+1;
           }
       }
       return nums.length+1;
    }
}
