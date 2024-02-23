import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) { 
      
              // Method 1
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;     
            }
        }
        return false;

        // Method 
      /*
        int n = nums.length;
        for(int i =0; i<n-1; i++){
            for(int j = i; j < n-1; j++){
                if(nums[i] == nums[j])
                    return true;       
            }
        }
        return false;
    */

    }
    public static void main(String args[]){
        
    }
}