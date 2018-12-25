package ink.lichen.leecode.test.test_12_25;

/**
 * Created by lichen@daojia.com on 2018-12-25.
 */
public class FindCircleNum {

    public int findCircleNum(int[][] M) {
        int num = 0;
        int n = M.length;
        boolean[] hasVisited = new boolean[n];
        for (int i = 0 ; i < n ; i++){
            if (!hasVisited[i]){
                dfs(M,i,hasVisited);
                num++;
            }
        }
        return num;
    }

    public void dfs(int[][] m, int i, boolean[] hasVisited){
        hasVisited[i] = true;
        for (int k = 0 ; k < m.length; k++){
            if (m[i][k] == 1 && !hasVisited[k]){
                dfs(m,k,hasVisited);
            }
        }
    }
}
