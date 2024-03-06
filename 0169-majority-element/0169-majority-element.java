class Solution {
    public int majorityElement(int[] nums) {
        int cand = 0;
        int point = 0;
        for(int i =0; i<nums.length; i++){
            if(point == 0){
                cand = nums[i];
            }
            if(cand == nums[i]){
                point++;
            }
            else {
                point --;
            }
        }
        return cand;
        
    }
}