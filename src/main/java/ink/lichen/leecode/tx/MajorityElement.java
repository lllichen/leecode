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
        int count = 1, maj = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (maj == nums[i])
                count++;
            else {
                count--;
                if (count == 0) {
                    maj = nums[i+1];
                    count = 0;
                }
            }
        }

        return maj;
    }
}
