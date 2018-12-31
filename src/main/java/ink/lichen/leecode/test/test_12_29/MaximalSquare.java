package ink.lichen.leecode.test.test_12_29;

/**
 * Created by lichen@daojia.com on 2018-12-29.
 *
 * 在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。
 *
 * 1 0 1 0 0
 * 1 0 1 1 1
 * 1 1 1 1 1
 * 1 0 0 1 0
 *
 * 输出4
 *
 */
public class MaximalSquare {


//    public int maximalSquare(char[][] matrix) {
//        int i = matrix.length;
//        if (i == 0){
//            return 0;
//        }
//        int j = matrix[0].length;
//        int max = 0;
//        int [][] res = new int[i+1][j+1];
//        for (int p = 0; p < i; p++){
//            for (int q = 0; q < j; q++){
//                if(matrix[p][q] - '1' == 0){
//                    res[p+1][q+1] = Math.min(res[p][q] ,Math.min(res[p+1][q],res[p][q+1])) +1;
//                    if (max < res[p+1][q+1]){
//                        max = res[p+1][q+1];
//                    }
//                }
//            }
//        }
//        return max*max;
//    }

    public int maximalSquare(char[][] matrix) {
        int i = matrix.length;
        if (i == 0){
            return 0;
        }
        int j = matrix[0].length;
        int max = 0;
        int [] res = new int[i+1];

        for (int p = 0; p < i; p++){
            int pre = 0;
            for (int q = 0; q < j; q++){
                if(matrix[p][q] - '1' == 0){
                    res[q+1] = Math.min(res[q] ,Math.min(pre,res[q+1])) +1;
                    pre = res[q+1];
                    if (max < res[q+1]){
                        max = res[q+1];
                    }
                }
            }
        }
        return max*max;
    }
}
