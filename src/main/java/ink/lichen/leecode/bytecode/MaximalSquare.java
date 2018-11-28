package ink.lichen.leecode.bytecode;

/**
 * Created by lichen@daojia.com on 2018-11-28.
 * 在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。
 *
 * 输入:
 *
 * 1 0 1 0 0
 * 1 0 1 1 1
 * 1 1 1 1 1
 * 1 0 0 1 0
 *
 * 输出: 4
 *
 */
public class MaximalSquare {


    public int maximalSquare(char[][] a) {
//        if(matrix.length == 0) return 0;
//        int m = matrix.length, n = matrix[0].length;
//        int max = 0;
//        int[][] dp = new int[m][n];
//        // 第一列赋值
//        for(int i = 0; i < m; i++){
//            dp[i][0] = matrix[i][0] - '0';
//            max = Math.max(max, dp[i][0]);
//        }
//        // 第一行赋值
//        for(int i = 0; i < n; i++){
//            dp[0][i] = matrix[0][i] - '0';
//            max = Math.max(max, dp[0][i]);
//        }
//        // 递推
//        for(int i = 1; i < m; i++){
//            for(int j = 1; j < n; j++){
//                dp[i][j] = matrix[i][j] == '1' ? Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) + 1 : 0;
//                max = Math.max(max, dp[i][j]);
//            }
//        }
//        return max * max;


        if(a.length == 0) return 0;
        int m = a.length, n = a[0].length, result = 0;
        int[][] b = new int[m+1][n+1];
        for (int i = 1 ; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(a[i-1][j-1] == '1') {
                    b[i][j] = Math.min(Math.min(b[i][j-1] , b[i-1][j-1]), b[i-1][j]) + 1;
                    result = Math.max(b[i][j], result); // update result
                }
            }
        }
        return result*result;
    }
}
