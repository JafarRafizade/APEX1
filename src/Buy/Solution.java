package Buy;

public class Solution {
    public static int maxProfit(int[] prices) {
        int max = 0;
        // 1 5 4 3 2 9 1
        // O(N2)
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length ; j++) {
                int difference = prices[i] - prices[j];
                if (difference < max && difference < 0){
                    max = difference;
                }
            }
        }

        return Math.abs(max);
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
