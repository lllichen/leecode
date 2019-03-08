package ink.lichen.leecode.test.test_3_8;

/**
 * Created by lichen@daojia.com on 2019-3-8.
 * 输入: [2,3,-2,4]
 * 输出: 6
 * 解释: 子数组 [2,3] 有最大乘积 6。
 */
public class MaxProduct {

    public int maxProduct(int[] nums) {
        int n = nums.length;
        if (n == 0){
            return 0;
        }
        int [] right = new int[n+1];
        int [] neg = new int[n+1];
        right[0] = 1;neg[0] = 1;
        for (int i = 0; i < n ; i++){
            int val = right[i]*nums[i];

        }


        return 0;
    }

}
