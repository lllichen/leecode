package ink.lichen.leecode.medium;

/**
 * Created by lichen@daojia.com on 2018-10-30.
 *给定一个整数 n，返回 n! 结果尾数中零的数量。
 *
 * 输入: 3
 * 输出: 0
 * 解释: 3! = 6, 尾数中没有零。
 */
public class TrailingZeroes {

    public int trailingZeroes(int n) {
        int sum = 0;
        while(n > 0)
        {
            sum += n / 5;
            n /= 5;
        }
        return sum;
    }
}
