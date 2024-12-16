package com.dsapractice;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        /*
        You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
         */
        int prices[] = {7,1,5,3,6,4};
        int maxProfit = calculateProfit(prices);
        System.out.println(maxProfit);
    }

    private static int calculateProfit(int[] prices) {
        int minprice =Integer.MAX_VALUE;
        int maxprice =Integer.MIN_VALUE;
        int minday = 0;
        for(int i=0; i<prices.length; i++){
            minprice = java.lang.Math.min(minprice,prices[i]);
        }
        for(int k=0; k<prices.length; k++){
            if(prices[k] == minprice){
                minday = k;
            }
        }
        for(int j=minday; j<prices.length; j++){
            maxprice = java.lang.Math.max(maxprice,prices[j]);
        }
        return maxprice - minprice;
    }
}
