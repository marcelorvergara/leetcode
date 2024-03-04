package net.mvergara.solutions;

public class BuyAndSellStock {

    public int buyAndSellStocks(int[] prices) {
        int minPrice = prices[0];
        int maxPofit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int currentProfit = price - minPrice;
                if (currentProfit > maxPofit) {
                    maxPofit = currentProfit;
                }
            }
        }
        return maxPofit;
    }
}
