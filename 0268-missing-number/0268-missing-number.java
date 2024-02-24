class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = (n*(n+1))/2;
        int total = 0;
        
      /*
      for(int num : nums){
           total = total + num;
       }
       */
        
        for(int i =0; i<n; i++){
            total += nums[i];
        }
         return totalSum  - total;
    }
}