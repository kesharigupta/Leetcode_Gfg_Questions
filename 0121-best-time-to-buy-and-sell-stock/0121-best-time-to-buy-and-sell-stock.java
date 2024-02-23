class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        for(int i =0; i< prices.length; i++){
            if(buyPrice < prices[i]){
                // profit = sellingprice  - buyPrice 
                int profit =  prices[i] - buyPrice;  // calcuate profit
                maxPrice = Math.max(maxPrice , profit);
            }
            else {
              buyPrice =  prices[i];
            }
        }
        return maxPrice;
        
    }
    public static void main(String args[]){
   //     int prices[] = [7,1,5,3,6,4];
    }
}