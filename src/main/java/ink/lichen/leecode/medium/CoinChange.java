package ink.lichen.leecode.medium;

/**
 * Created by lichen@daojia.com on 2018-10-29.
 * 给定不同面额的硬币 coins 和一个总金额 amount。
 * 编写一个函数来计算可以凑成总金额所需的最少的硬币个数。
 * 如果没有任何一种硬币组合能组成总金额，返回 -1。
 */
public class CoinChange {

//    F(amount) = MinCoins
//    amount-coins[i] = MinCoins-1
//    dp[i] = min(dp[i], dp[i - coins[j]] + 1);
//

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++)
            dp[i] = 0x7fff_fffe;
        for (int coin : coins)
            for (int i = coin; i <= amount; i++) {
                int val = dp[i];
                int val_coin = dp[i - coin] + 1;
                dp[i] = Math.min(val, val_coin);
            }

        return dp[amount] == 0x7fff_fffe ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        CoinChange coinChange = new CoinChange();
        coinChange.coinChange(new int[]{5, 3, 1}, 11);
    }
}
