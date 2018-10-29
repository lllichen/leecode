package ink.lichen.leecode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lichen@daojia.com on 2018-10-29.
 * 给定不同面额的硬币 coins 和一个总金额 amount。
 * 编写一个函数来计算可以凑成总金额所需的最少的硬币个数。
 * 如果没有任何一种硬币组合能组成总金额，返回 -1。
 */
public class CoinChange {

    //dp[0] = 0;
    // coin[i] i中coin 币值
    // dp[amount] = min( dp(amount), dp(amount - coin[i])+1 )
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,max);
        dp[0] = 0;
        for (int coin : coins){
            for (int i = coin ; i <= amount; i++){
                dp[i] = Math.min(dp[i],dp[i-coin]+1);
            }
        }
        return dp[amount] == max ? -1: dp[amount];
    }

    public static void main(String[] args) {
        CoinChange coinChange = new CoinChange();
        coinChange.coinChange(new int[]{5, 3, 1}, 11);
    }
}
