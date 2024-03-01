class Solution {
    public int removeDuplicates(int[] nums) {
        int j =0;
        int i;
        for(i =0; i<nums.length; i++){
            if(nums[j] != nums[i]){  // check j and i not equal
                j = ++j;  // increm.. j
                nums[j] = nums[i]; 
            }
        }
        return ++j;
    }
}