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
        int [] nums = new int[triangle.size()];

        for (int i = 0 ; i < triangle.size(); i++){
            List<Integer> list = triangle.get(i);
            for (int j = 0; j < list.size(); j++){
                if (i == 0 ){
                    continue;
                }else {
                    if (j == 0){
                        int val = triangle.get(i-1).get(j)+list.get(j);
                        list.set(j, val);
                    }
                }
            }


        }

        return 0;
    }
}
