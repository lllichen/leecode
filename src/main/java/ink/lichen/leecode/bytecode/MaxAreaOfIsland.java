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
        int max = 0,n = grid.length;
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

    public void dfs(int[][] grid, int temp,int i, int j){
        if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length ){
            if (grid[i][j] == 1){
                temp++;
                grid[i][j] = 0;

              dfs(grid,temp,i-1,j);
              dfs(grid,temp,i+1,j);
              dfs(grid,temp,i,j-1);
              dfs(grid,temp,i,j+1);
            }
        }else {
            return;
        }



        return temp;
    }

    public void incr(int i){
        i++;
    }


    public static void main(String[] args) {
        MaxAreaOfIsland maxAreaOfIsland = new MaxAreaOfIsland();
        int i = 1;
        maxAreaOfIsland.incr(1);
        System.out.println(i);
    }

}
