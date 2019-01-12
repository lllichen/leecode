package ink.lichen.leecode.test.test_1_12;

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
        backtrack(res);
        return res;
    }

    private void backtrack(List<List<Integer>> res) {
    }
}
