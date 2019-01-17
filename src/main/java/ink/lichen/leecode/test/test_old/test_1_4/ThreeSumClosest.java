package ink.lichen.leecode.test.test_old.test_1_4;

import java.util.Arrays;

/**
 * Created by lichen@daojia.com on 2019-1-4.
 *
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 *
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 */
public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        //初始一个result
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        //给num排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1, end = nums.length - 1;
            //在while中num[i]是一定的，选出的是i时，i后面的数和i能组成的离target最近的sum
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                //sum>target要减小sum,因为排好序了，所以end--
                if (sum > target) {
                    end--;
                } else {       //sum<=target时同理
                    start++;
                }
                //若相差小，则更新result值
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }
        }
        return result;

    }
}
