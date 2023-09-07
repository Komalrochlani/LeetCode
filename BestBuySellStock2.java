package com.code.interviewprepration;

public class BestBuySellStock2 {

	public static void main(String[] args) {
		int[] arr = {7,1,5,3,6,4};
		int result = maxProfit(arr);
		System.out.println(result);
	}
	
	 public static int maxProfit(int[] prices) {
	        int buy = prices[0];
	        int max=0;
	        int count=0;
	        for(int i=1;i<prices.length;i++)
	        {
	            if(prices[i]<buy)
	            {
	                buy=prices[i]; //1 
	            }else {
	                max = prices[i]-buy;
	                if(prices[i]>buy){
	                buy=prices[i];
	            }
	                count +=max;
	            }
	        }
	        return count;
	    }
}
