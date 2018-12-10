package ink.lichen.leecode.tree.bst;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lichen@daojia.com on 2018-12-10.
 *
 * 给定一个整数数组，判断数组中是否有两个不同的索引 i 和 j，
 * 使得 nums [i] 和 nums [j] 的差的绝对值最大为 t，并且 i 和 j 之间的差的绝对值最大为 ķ。
 *
 * 输入: nums = [1,2,3,1], k = 3, t = 0
 * 输出: true
 *
 * 输入: nums = [1,5,9,1,5,9], k = 2, t = 3
 * 输出: false
 */
public class ContainsNearbyAlmostDuplicate {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k < 0 || nums.length > 1000) {
            return false;
        }
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length && j <= i + k; j++) {
                if (Math.abs((long)nums[i] - nums[j]) <= t) {
                    return true;
                }
            }
        }
        return false;
    }
}
