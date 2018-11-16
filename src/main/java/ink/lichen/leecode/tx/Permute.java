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

        backtrack(res,new ArrayList<>(),nums);
        return res;
    }

    private boolean[] flags = new boolean[3];

    public void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums){
        if (temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        //start
        for (int i = 0; i < nums.length; i++)
        {
            if (flags[i]){
                continue;
            }
            temp.add(nums[i]);
            flags[i] = true;
            backtrack(res,temp, nums);
            flags[i] = false;
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        Permute p = new Permute();
        System.out.println(p.permute(new int[]{1,2,3}));
    }
}
