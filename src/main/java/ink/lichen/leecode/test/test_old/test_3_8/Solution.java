package ink.lichen.leecode.test.test_old.test_3_8;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by lichen@daojia.com on 2019-3-8.
 */
public class Solution {

    private int[] origin;
    private int[] result;

    public Solution(int[] nums) {
        this.origin = nums;
        this.result = Arrays.copyOf(nums, nums.length);
    }

    public int[] reset() {
        return origin;
    }

    private Random random = new Random();
    /**
     * 交换数组，数组长度随机
     */
    public int[] shuffle() {
        for (int i = 0; i < result.length; i++) {
            int idx = random.nextInt(result.length);
            swap(i,idx);
        }
        return result;
    }

    private void swap(int i, int j){
        int tem = result[i];
        result[i] = result[j];
        result[j] = tem;
    }

    public static void main(String[] args) {
        Solution  solution = new Solution(new int[]{1,2,3});
    }
}
