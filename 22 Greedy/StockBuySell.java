public class StockBuySell {
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };

        int buy = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > buy) {
                int profit = prices[i] - buy;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buy = prices[i];
            }
        }
        System.out.println("max profit = " + maxProfit);
    }
}
