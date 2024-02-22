class Solution {
    public static int search(int[] nums, int target) {
       for(int i =0; i<nums.length; i++){
           if(nums[i] == target){
               return i;
           }
       } 
       return -1;     
    }
    public static void main(String [] args){
        int nums[] = {-1,0,3,5,9,12};
        int target = 2;

        int index = search(nums , target);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("number of index" +index);
        }
    }
}