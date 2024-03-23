class Solution {
    public void nextPermutation(int[] nums) {
        // find the partition point
        int idx=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
               idx=i;
               break;
            }
        }
        if(idx==-1){
            // reverse array
            for(int i=0;i<nums.length/2;i++){
                int temp=nums[nums.length-1-i];
                nums[nums.length-1-i]=nums[i];
                nums[i]=temp;
            }
            return;
        }
        
        for(int m=nums.length-1;m>idx;m--){
            if(nums[m]>nums[idx]){
                int temp=nums[m];
                nums[m]=nums[idx];
                nums[idx]=temp;
                break;
            }
        }
        int k=nums.length-1;
            // reverse remaining
        for(int j=idx+1;j<=(nums.length+idx)/2;j++){
            int temp=nums[k];
            nums[k]=nums[j];
            nums[j]=temp;
            k--;
        }
    }
}