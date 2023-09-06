package com.code.interviewprepration;

public class BestTimeBuySellStockLeetCode {

	public static void main(String[] args) {
		int[] arr = {7,1,5,3,6,4};
		int result = maxProfit(arr);
		System.out.println(result);
	}
	public static int maxProfit(int[] prices) {
        int max=0;
        int buy=prices[0];
        int len=prices.length;
        for(int i=1;i<len;i++){
           if(prices[i]<buy){
               buy = prices[i];
           }else{
               if((prices[i]-buy)>max){
                   max = prices[i]-buy;
               }
           }
        }
        return max;
    }

}
