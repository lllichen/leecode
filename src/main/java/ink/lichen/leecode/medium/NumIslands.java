package ink.lichen.leecode.medium;

/**
 * Created by lichen@daojia.com on 2018-9-18.
 *
 给定一个由 '1'（陆地）和 '0'（水）组成的的二维网格，计算岛屿的数量。一个岛被水包围，
 并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。你可以假设网格的四个边均被水包围。
 *
 输入:
 11110
 11010
 11000
 00000
 输出: 1

 输入:
 11000
 11000
 00100
 00011

 输出: 3
 *
 *
 */
public class NumIslands {
    public int numIslands(char[][] grid) {
        int res = 0;
        if(grid.length==0) return res;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j]=='1'){
                    searchIsland(grid, i, j);
                    res++;
                }
            }
        }
        return res;
    }

    private void searchIsland(char[][] grid, int i, int j){
        grid[i][j]='0';
        // 搜索该点连通的上下左右
        if(i>0 && grid[i-1][j]=='1') searchIsland(grid, i-1, j);
        if(j>0 && grid[i][j-1]=='1') searchIsland(grid, i, j-1);
        if(i<grid.length-1 && grid[i+1][j]=='1') searchIsland(grid, i+1, j);
        if(j<grid[0].length-1 && grid[i][j+1]=='1') searchIsland(grid, i, j+1);
    }
}
