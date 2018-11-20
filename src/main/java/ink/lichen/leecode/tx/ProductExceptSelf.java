package ink.lichen.leecode.tx;

/**
 * Created by lichen@daojia.com on 2018-11-20.
 *
 * 输入: [1,2,3,4]
 * 输出: [24,12,8,6]
 *
 */
public class ProductExceptSelf {


    public int[] productExceptSelfRev(int[] nums) {
        if(nums.length <= 1){
            return nums;
        }
        int[] res = new int[nums.length];
        res[0] = 1;
        int left = 1, right = 1;
        // 计算每个点左边的乘积
        for(int i = 1; i < nums.length; i++){
            left = left * nums[i - 1];
            res[i] = left;
        }
        // 计算每个点右边的乘积
        for(int i = nums.length - 2; i >= 0; i--){
            right = right * nums[i + 1];
            res[i] = right * res[i];
        }
        return res;
    }

}
