class Solution {
    public int maxProfit(int[] prices) {
        int profit=0,buy=prices[0];
        for(int i=0;i<prices.length;i++){
            profit=Math.max(profit,prices[i]-buy);
            buy=Math.min(buy,prices[i]);
        }
        return profit;
    }
}