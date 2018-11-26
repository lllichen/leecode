package ink.lichen.leecode.bytecode;

/**
 * Created by lichen@daojia.com on 2018-11-26.
 *
 * [[0,0,1,0,0,0,0,1,0,0,0,0,0],
 *  [0,0,0,0,0,0,0,1,1,1,0,0,0],
 *  [0,1,1,0,1,0,0,0,0,0,0,0,0],
 *  [0,1,0,0,1,1,0,0,1,0,1,0,0],
 *  [0,1,0,0,1,1,0,0,1,1,1,0,0],
 *  [0,0,0,0,0,0,0,0,0,0,1,0,0],
 *  [0,0,0,0,0,0,0,1,1,1,0,0,0],
 *  [0,0,0,0,0,0,0,1,1,0,0,0,0]]
 *
 */
public class MaxAreaOfIsland {


    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        if (n == 0){
            return 0;
        }
        int m = grid[0].length;
        for (int i = 0 ; i < n; i++){
            for (int j = 0 ; j <m; j++ ) {

                if (grid[i][j] == 1){
                    int temp = 0;
                    dfs(grid,temp,i,j);
                }

            }
        }
        return max;
    }

    private static int max = 0;

    public void dfs(int[][] grid, int temp,int i, int j){
        if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length ){
            if (grid[i][j] == 1){
                temp++;
                if(max <temp){
                    max = temp;
                }
                grid[i][j] = 0;

              dfs(grid,temp,i-1,j);
              dfs(grid,temp,i+1,j);
              dfs(grid,temp,i,j-1);
              dfs(grid,temp,i,j+1);
            }
        }
        return;
    }

    public static void main(String[] args) {
        MaxAreaOfIsland maxAreaOfIsland = new MaxAreaOfIsland();
        int[][] grinds = new int[][]{};
        System.out.println(maxAreaOfIsland.maxAreaOfIsland(grinds));
    }

}
