package ink.lichen.leecode.tx;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-11-16.
 *
 * 输入: [1,2,3]
 * 输出:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 */
public class Permute {

    /**
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        backtrack(res,new ArrayList<>(),nums,0);
        return res;
    }

    public void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums ,int start){
        if (temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        //start
        for (int i = start; i < nums.length; i++)
        {
            temp.add(nums[i]);
            backtrack(res,temp, nums, i+1);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        Permute p = new Permute();
        System.out.println(p.permute(new int[]{1,2,3}));
    }
}
