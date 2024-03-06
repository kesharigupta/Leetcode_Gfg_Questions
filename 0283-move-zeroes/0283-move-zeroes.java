class Solution {
    public void moveZeroes(int[] nums) {
        
        int count =0;
        for(int i =0; i< nums.length; i++){
            if(nums[i] != 0){
                int keshu = count++;
                nums[keshu] = nums[i];
            }
        }
        while(count < nums.length){
            nums[count++] = 0; 
        }
    }
}