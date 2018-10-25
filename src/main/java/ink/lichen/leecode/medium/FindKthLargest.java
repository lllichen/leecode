package ink.lichen.leecode.medium;

import java.util.Arrays;

/**
 * Created by lichen@daojia.com on 2018-10-24.
 * 输入: [3,2,1,5,6,4] 和 k = 2
   输出: 5
 */
public class FindKthLargest {


    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
