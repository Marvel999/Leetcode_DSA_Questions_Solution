package Leetcode.Array;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// use to pointer minPrices<i
public class FindBestStock {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minPrices=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrices)
                minPrices=prices[i];
            if(prices[i]-minPrices>maxProfit)
                maxProfit=prices[i]-minPrices;
        }

        return maxProfit;
    }
}
