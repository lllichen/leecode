package ink.lichen.leecode.test.test_old.test_12_30;

public class MaxSubArray {


    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n == 0){
            return 0;
        }
        int max = 0;
        int cur = 0;
        for (int val : nums){
            cur = cur + val;
            if (max < cur){
                max = cur;
            }
            if (cur < 0){
                cur = 0;
            }
        }
        return max;
    }
}
