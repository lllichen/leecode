package ink.lichen.leecode.tx;

/**
 * Created by lichen@daojia.com on 2018-11-14.
 *
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 *
 */
public class ClimbStairs {

    public int climbStairs(int n) {
        if (n == 0 || n == 1 || n ==2 ){
            return n;
        }
        int [] r = new int[n+1];
        r[0] = 0;
        r[1] = 1;
        r[2] = 2;
        int i = 3;
        while ( i<=n) {
            r[i] = r[i-1]+r[i-2];
            i++;
        }
        return r[n];
    }

    public static void main(String[] args) {
        ClimbStairs climbStairs = new ClimbStairs();
        System.out.println(climbStairs.climbStairs(4));
    }
}
