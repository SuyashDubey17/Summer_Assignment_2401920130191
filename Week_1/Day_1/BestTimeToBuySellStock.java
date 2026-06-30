class Solution {
    public int maxProfit(int[] prices) {

        int buyPrice = prices[0];
        int bestProfit = 0;

        for(int day = 1; day < prices.length; day++) {

            int currentPrice = prices[day];

            if(currentPrice < buyPrice) {
                buyPrice = currentPrice; 
            } 
            else {
                int profit = currentPrice - buyPrice;

                if(profit > bestProfit) {
                    bestProfit = profit;
                }
            }
        }
        return bestProfit;
    }
}
