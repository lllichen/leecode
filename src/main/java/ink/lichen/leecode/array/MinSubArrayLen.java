package ink.lichen.leecode.array;

/**
 * Created by lichen@daojia.com on 2018-11-2.
 *
 * 输入: s = 7, nums = [2,3,1,2,4,3]
 * 输出: 2
 * 解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
 *
 */
public class MinSubArrayLen {

    public int minSubArrayLen(int s, int[] nums) {
        int i = 0,j=0,n = nums.length ;
        int sum = 0;
        int max = Integer.MAX_VALUE;
        while (i<n){
            sum +=nums[i++];
            while (sum>=s){
                max = Math.min(max,i - j);
                sum -=nums[j++];
            }
        }

        return max != Integer.MAX_VALUE?0:max;
    }
}
