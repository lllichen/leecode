package ink.lichen.leecode.test.test_3_8;

/**
 * Created by lichen@daojia.com on 2019-3-8.
 * 输入: [2,3,-2,-4]
 * 输出: 6
 * 解释: 子数组 [2,3] 有最大乘积 6。
 *
 */
public class MaxProduct {

    public int maxProduct(int[] nums) {
        int n = nums.length;
        if (n == 0){
            return 0;
        }
        int max =nums[0];
        int [] right = new int[n];
        int [] neg = new int[n];
        right[0] = nums[0];
        neg[0] = nums[0];
        for (int i = 1; i < n ; i++){
            right[i] = Math.max(Math.max(right[i-1]*nums[i],neg[i-1]*nums[i]),nums[i]);
            neg[i] = Math.min(Math.min(right[i-1]*nums[i],neg[i-1]*nums[i]),nums[i]);
            max = Math.max(max,right[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        MaxProduct maxProduct = new MaxProduct();
        System.out.println(maxProduct.maxProduct(new int[]{2,3,-2,-4}));
    }

}
