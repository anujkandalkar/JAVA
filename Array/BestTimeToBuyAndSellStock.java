class Solution {
    public int maxProfit(int[] prices) {
        int Profit = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice >Profit) {
                Profit = prices[i] - minPrice;
            }
        }
        
        return Profit;
    }
}
class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.print(s.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}