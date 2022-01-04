package others;
/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * */
public class StockBuySell {
	 public int maxProfit(int[] prices) {
	        int minValue = Integer.MAX_VALUE;
	        int maxDiff = 0;
	        for(int i =0; i< prices.length; i++){
	            minValue = Math.min(minValue,prices[i]);
	            maxDiff = Math.max(maxDiff,prices[i] - minValue);
	        }
	        return maxDiff;
	    }
}
