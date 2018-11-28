package ink.lichen.leecode.bytecode;

/**
 * Created by lichen@daojia.com on 2018-11-28.
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 *
 *
 */
public class MaxSubArray {


    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n == 0){
            return 0;
        }
        int sum = nums[0], cur = 0;
        for (int i = 0 ;i < n; i++){
            cur += nums[i];
            if (sum < cur){
                sum = cur;
            }
            if (cur < 0){
                cur = 0;
            }
        }
        return sum;
    }
}
