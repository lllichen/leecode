package ink.lichen.leecode.test.test_12_29;

/**
 * Created by lichen@daojia.com on 2018-12-29.
 */
public class MaxProft2 {

    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n <= 1){
            return 0;
        }
        int val = 0;
        for (int i = 1; i< n ; i++){
            int p = prices[i] - prices[i-1];
            if (p > 0){
                val += p;
            }
        }
        return val;
    }
}
