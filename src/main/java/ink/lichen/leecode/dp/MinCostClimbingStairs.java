package ink.lichen.leecode.dp;

/**
 * Created by lichen@daojia.com on 2018-12-10.
 * 输入: cost = [10, 15, 20]
 * 输出: 15
 * 解释: 最低花费是从cost[1]开始，然后走两步即可到阶梯顶，一共花费15。
 * 输入: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
 *    cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
 *    i = 0 0
 *    i = 1 1
 *    i = 2 2
 *    i = 3 2
 *    i = 4 3
 *
 * 输出: 6
 * 解释: 最低花费方式是从cost[0]开始，逐个经过那些1，跳过cost[3]，一共花费6。
 *
 * 注意：
 *
 * cost 的长度将会在 [2, 1000]。
 * 每一个 cost[i] 将会是一个Integer类型，范围为 [0, 999]。
 *
 */
public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;

        int preRun = 0;
        int preNoRun = 0;

        for (int i = 1 ; i < n ; i++){

        }
        return 0;
    }
}
