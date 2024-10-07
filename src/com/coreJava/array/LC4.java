package com.coreJava.array;

public class LC4 {
	public static void main(String[] args) {
		int[] prices = {7,6,4,3,1};
		int profit = 0;
		int buy = prices[0];
		int sell = 0;
		// 7> 1 = buy , 1 < 5 = sell, 5 >3 = buy, 3<6 sell, 6>4 buy
		for(int i=1; i < prices.length ; i++) {
			//1 price less hoy to second sell prices
			if(buy > prices[i]) {
				//privious karta moti hoy amount to current buy price che 
				buy = prices[i];
			}else if(buy < prices[i]) {
				//privious larta nani hoy to current sell price 
				/*
				 * sell = prices[i]; if(sell > 0) {
				 * System.out.println("sell: "+sell+" buy: "+buy); profit += sell - buy; }
				 * buy=prices[i];
				 */
				profit += prices[i] - buy;
				buy=prices[i];
			}
			
			
			
		}
		
		System.out.println("P:"+profit);
	}
}
