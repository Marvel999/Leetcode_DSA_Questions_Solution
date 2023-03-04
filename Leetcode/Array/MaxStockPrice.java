package Leetcode.Array;

public class MaxStockPrice {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minDay;
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = Integer.MIN_VALUE;
        int maxDay = prices.length - 1;
        for (int i = 0; i < prices.length; i++) {

            if (minPrice > prices[i])
                minPrice = prices[i];
            int profit = prices[i] - minPrice;
            if (profit > maxProfit)
                maxProfit = profit;
        }
        return maxProfit;
    }
}
