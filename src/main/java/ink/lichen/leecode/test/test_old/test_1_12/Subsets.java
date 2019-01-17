package ink.lichen.leecode.test.test_old.test_1_12;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2019-1-12.
 * 输入: nums = [1,2,3]
 * 输出:
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 *
 *
 */
public class Subsets {


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,new ArrayList<Integer>(),nums,0);
        return res;
    }

    //1 12 123 1234
    private void backtrack(List<List<Integer>> res, ArrayList<Integer> list, int[] nums, int start) {
        res.add(new ArrayList<>(list));
        if (start >= nums.length){
            return;
        }
        for (int i = start; i < nums.length;i++ ){
            list.add(nums[i]);
            backtrack(res,list,nums,i+1);
            list.remove(list.size()-1);
        }
    }


    public static void main(String[] args) {
        new Subsets().subsets(new int[]{1,2,3,4});
    }
}
