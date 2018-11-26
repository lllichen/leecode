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
        int max = 0;
        if (n == 0){
            return 0;
        }
        int m = grid[0].length;
        for (int i = 0 ; i < n; i++){
            for (int j = 0 ; j <m; j++ ) {
                if (grid[i][j] == 1){
                    int temp = 0;
                    temp = dfs(grid,temp,i,j);
                    if (max < temp){
                        max = temp;
                    }
                }

            }
        }
        return max;
    }

    public int dfs(int[][] grid, int temp,int i, int j){
        if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length ){
            if (grid[i][j] == 1){
                temp++;
                grid[i][j] = 0;

              temp = dfs(grid,temp,i-1,j);
                temp = dfs(grid,temp,i+1,j);
                temp =dfs(grid,temp,i,j-1);
                temp =dfs(grid,temp,i,j+1);
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        MaxAreaOfIsland maxAreaOfIsland = new MaxAreaOfIsland();
        int[][] grinds = new int[][]{
                {1,1,0,1,1},
                {1,0,0,0,0},
                {0,0,0,0,1},
                {1,1,0,1,1}};
        System.out.println(maxAreaOfIsland.maxAreaOfIsland(grinds));
    }

}
