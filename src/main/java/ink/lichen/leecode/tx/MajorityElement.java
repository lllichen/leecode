package ink.lichen.leecode.tx;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lichen@daojia.com on 2018-11-19.
 *
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 *
 * 输入: [3,2,3]
 * 输出: 3
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer,Integer> res = new HashMap<>();
        int n = nums.length;
        int val = n /2;
        for (int t : nums){
            res.put(t, res.getOrDefault(t,0)+1);
            if (res.get(t) > val){
                return t;
            }
        }
        return 0;
    }
}
