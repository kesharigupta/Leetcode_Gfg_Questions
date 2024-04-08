class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum =0;
        int left = 0 , right = 0;
        for(int i : nums){
            sum = sum + i;
        }
        for(int i =0; i<n; i++){
            left += nums[i];
            right = sum - left + nums[i];
            if(left == right){
                return i;
            }
        }
        return -1;
    }
}