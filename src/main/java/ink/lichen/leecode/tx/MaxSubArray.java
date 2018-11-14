package ink.lichen.leecode.tx;

/**
 * Created by lichen@daojia.com on 2018-11-14.
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class MaxSubArray {
//[1,2]
    public int maxSubArray(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }
        int max = nums[0];
        int cur = 0;
        for (int i = 0 ; i < nums.length; i++) {
            cur +=nums[i];
            if (max < cur){
                max = cur;
            }
            if (cur<0){
                cur = 0;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        MaxSubArray maxSubArray = new MaxSubArray();
        System.out.println(maxSubArray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
