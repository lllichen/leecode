package ink.lichen.leecode.bytecode;

import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-11-28.
 *
 *
 * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 *
 * 例如，给定三角形：
 *
 * [
 *    [2],
 *    [3,4],
 *    [6,5,7],
 *    [4,1,8,3]
 * ]
 *
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 *
 */
public class MinimumTotal {


    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        int [] res= new int[size+1];

        for (int i = size-1;i >= 0; i--){
            int size_i = triangle.get(i).size();
            for (int j = 0; j < size_i; j++){
                res[j] = Math.min(res[j],res[j+1])+triangle.get(i).get(j);
            }
        }
        return res[0];
    }
}
