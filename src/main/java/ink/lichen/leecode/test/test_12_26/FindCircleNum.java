package ink.lichen.leecode.test.test_12_26;

/**
 * Created by lichen@daojia.com on 2018-12-25.
 */
public class FindCircleNum {

    public int findCircleNum(int[][] M) {
        int n = M.length;
        int num = 0;
        boolean[] hasVisited = new boolean[n];
        for (int i = 0 ; i < n; i ++){
            if (!hasVisited[i]){
                help(M,i,hasVisited);
                num ++;
            }
        }
        return num;
    }

    private void help(int[][] M, int i, boolean[] hasVisited){
        hasVisited[i] = true;
        for (int k = 0 ; k < M.length; k++){
            if (M[i][k] == 1 && !hasVisited[k]){
                help(M,k,hasVisited);
            }
        }
    }
}
