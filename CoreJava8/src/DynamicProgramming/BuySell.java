package DynamicProgramming;

public class BuySell {
    public static void main(String[] args) {
        int[] trades = {1, 6,4,3,7};
        System.out.println(maxProfit(trades));
    }

    public static int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxProfitSoFar = 0;
        for (int i = 0; i < prices.length; i++) {
            minBuy = Math.min(minBuy,prices[i]);
            maxProfitSoFar = Math.max(maxProfitSoFar,prices[i]-minBuy);
        }
        return maxProfitSoFar;
    }
}
