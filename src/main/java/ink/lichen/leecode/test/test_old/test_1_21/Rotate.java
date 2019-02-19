package ink.lichen.leecode.test.test_old.test_1_21;

/**
 * Created by lichen@daojia.com on 2019-1-21.
 *
 * 给定 matrix =
 * [
 *   [1,2,3],
 *   [4,5,6],
 *   [7,8,9]
 * ],
 *
 *
 * [
 *   [9,6,3],
 *   [8,5,2],
 *   [7,4,1]
 * ],
 *
 *
 * 原地旋转输入矩阵，使其变为:
 * [
 *   [7,4,1],
 *   [8,5,2],
 *   [9,6,3]
 * ]
 *
 */
public class Rotate {

    public void rotate(int[][] matrix) {
        int tmp;
        int[] tmp_arr;
        int n = matrix.length;
        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-1-i; j++) {
                tmp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][n-1-i];
                matrix[n-1-j][n-1-i] = tmp;
            }
        }

        for (int i=0; i<n/2; i++) {
            tmp_arr = matrix[i];
            matrix[i] = matrix[n-1-i];
            matrix[n-1-i] = tmp_arr;
        }
    }
}
