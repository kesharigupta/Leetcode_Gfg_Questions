class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        // loop
        for(int i = 0; i<n; i++){
            // multiply the same number 
            nums[i] = nums[i] * nums[i];
        }
        // After multiply sort the number 
         Arrays.sort(nums);
         // return 
        return nums;
    }
}