class Solution {
    public int maxProfit(int[] prices) {
    int buyday = 0;
    int profit = 0;
    int maxProfit = 0;
   
    for(int sellday=buyday+1; sellday < prices.length; sellday++ ){
     if(prices[sellday] < prices[buyday]){
        buyday = sellday;
     }
     profit = prices[sellday] - prices[buyday];
     maxProfit = Math.max(profit, maxProfit);
    }
    return maxProfit;
    }
}
