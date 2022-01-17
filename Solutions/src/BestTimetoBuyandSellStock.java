
public class BestTimetoBuyandSellStock {

	// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
	public int maxProfit(int[] prices) {
		int i = 0, max = 0;
		int firstMin = prices[0];
		while (i < prices.length) {
			if (prices[i] - firstMin > max) {
				max = prices[i] - firstMin;
			}
			if (prices[i] < firstMin) {
				firstMin = prices[i];
			}
			i++;
		}

		return max;
	}

}
