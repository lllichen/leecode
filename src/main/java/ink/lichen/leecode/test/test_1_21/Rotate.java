package ink.lichen.leecode.test.test_1_21;

/**
 * Created by lichen@daojia.com on 2019-1-21.
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
