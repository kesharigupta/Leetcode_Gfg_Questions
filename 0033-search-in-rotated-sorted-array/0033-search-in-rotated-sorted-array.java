class Solution {
    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length -1;

        while(start <= end){
            int mid = (start + end) / 2;
            if(target == nums[mid]){
                return mid;
            }
            if(nums[start] <= nums[mid]){  // left side check
                if(nums[start] <= target && target <= nums[mid]){ //left side move
                    end = mid -1;
                }else {
                    start = mid + 1;
                } 
            }
                 else {   // right side check 
                    if(nums[mid] <= target && target <= nums[end]){ //right side move
                        start = mid + 1;
                    }else {
                        end = mid - 1;
                    }
                }
            }
            return -1;
        }      
    }
