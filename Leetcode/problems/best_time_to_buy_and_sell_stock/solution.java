class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1)return 0;
        int profit = 0;
        int min = prices[0];
        for(int a: prices){
            profit = Math.max(profit,(a-min));
            if(a < min) min = a;
        }
        return profit;
    }
}