class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Sorting the array 
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Remove duplicates
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int target = -nums[i];
                int left = i + 1;
                int right = nums.length - 1;
                
                while (left < right) {
                    int sum = nums[left] + nums[right];
                    
                    if (sum == target) {
                        // Found a triplet
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        
                        // Avoid duplicates
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        
                        // Move pointers
                        left++;
                        right--;
                    } else if (sum < target) {
                        // Move left pointer
                        left++;
                    } else {
                        // Move right pointer
                        right--;
                    }
                }
            }
        }
        
        return result;
        
        
    }
}