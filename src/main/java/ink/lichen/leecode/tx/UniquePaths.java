package ink.lichen.leecode.tx;

/**
 * Created by lichen@daojia.com on 2018-11-15.
 * 输入: m = 3, n = 2
 * 输出: 3
 * 解释:
 * 从左上角开始，总共有 3 条路径可以到达右下角。
 * 1. 向右 -> 向右 -> 向下
 * 2. 向右 -> 向下 -> 向右
 * 3. 向下 -> 向右 -> 向右
 */
public class UniquePaths {

    private int[][] dp;

    private int m;

    private int n;

    public int uniquePaths(int m, int n) {
        this.dp= new int[m][n];
        this.m = m;
        this.n = n;
        return dsf(0,0);
    }

    public int dsf(int x, int y){
        if (x >m -1 || y > n -1)
        {
            return 0;
        }
        if (x == m - 1 && y == n - 1)
        {
            return 1;
        }
        if (dp[x][y] == 0){
            dp[x][y] = dsf(x+1,y)+dsf(x,y+1);
        }
        return dp[x][y];
    }


//    public int uniquePaths(int m, int n) {
//        int[][] f = new int[m][n];
//        int i, j;
//        for (i = 0; i < m; ++i) {
//            for (j = 0; j < n; ++j) {
//                if (i == 0 || j == 0) {
//                    f[i][j] = 1;
//                }
//                else {
//                    f[i][j] = f[i-1][j] + f[i][j-1];
//                }
//            }
//        }
//
//        return f[m-1][n-1];
//    }


    public static void main(String[] args) {
        UniquePaths uniquePaths = new UniquePaths();

        System.out.println(uniquePaths.uniquePaths(3,2));
    }
}
