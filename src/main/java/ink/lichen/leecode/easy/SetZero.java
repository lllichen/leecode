package ink.lichen.leecode.easy;

/**
 * Created by lichen@daojia.com on 2018-9-6.
 */
public class SetZero {

    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0 ; i < matrix.length; i++){
            for (int j = 0 ; j < matrix[i].length; j ++){
                if (matrix[i][j] == 0){
                    for (int temp = 0 ; temp < n ; temp ++){
                        matrix[i][temp] = Integer.MIN_VALUE;
                    }
                    for (int temp = 0 ; temp < m ; temp++){
                        matrix[temp][j] = Integer.MIN_VALUE;
                    }
                }
            }
        }

        for (int i = 0 ; i < matrix.length; i++){
            for (int j = 0 ; j < matrix[i].length; j ++){
                if (matrix[i][j] == Integer.MIN_VALUE){
                    matrix[i][j]  = 0;
                }
            }
        }


    }

    public static void main(String[] args) {

    }
}
