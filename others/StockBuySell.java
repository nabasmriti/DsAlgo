package others;

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
