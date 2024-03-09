class Solution {
    public int maxArea(int[] height) {
        
        /* TC = O(n^2)
        
        int n = height.length;
        int maxA = 0; 
        for(int i = 1; i< n-1; i++){
            for(int j = i+1; j < n; j++){
                int Area = Math.max(height[i] , height[j] * (j - i));
                maxA = Math.max(maxA , Area);
            }
        }
        return maxA;
        
        */
        
        // TC = O(n)
        
        int n = height.length;
        int max = 0;
        int l = 0;
        int r = n-1;
        
       while(l < r){
           int minH = Math.min(height[l] , height[r]);
           int Area = minH * (r - l);
           max = Math.max(max , Area);
           
           if(height[l] < height[r]){
                    l++;
           }else {
               r--;
           }
       }
        return max;
    }
}