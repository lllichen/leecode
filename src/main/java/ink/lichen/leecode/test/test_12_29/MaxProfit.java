package ink.lichen.leecode.test.test_12_29;

/**
 * Created by lichen@daojia.com on 2018-12-29.
 */
public class MaxProfit {


    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0){
            return 0;
        }
        int val = prices[0];
        int profit = 0;
        for (int t : prices){
            if (t < val) {
                val = t;
            }
            int p = t - val;
            if (profit < p){
                profit = p;
            }
        }
        return profit;
    }
}
