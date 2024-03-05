class Solution {
    public int singleNumber(int[] nums) {
        
        // method 1 using XOR GATE
        int Xor = 0;
        for(int i =0; i<nums.length; i++){
            Xor = Xor^nums[i];
        }
        return Xor;
    } 
}      


  /*
          Method 2
        
        for(int i=0; i<nums.length; i++){
            int count =0;
            for(int j =0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                return nums[i];
            }
        }
        return -1;
        
      }
    }
       
*/       
    