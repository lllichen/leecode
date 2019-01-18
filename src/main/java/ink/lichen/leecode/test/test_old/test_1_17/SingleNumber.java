package ink.lichen.leecode.test.test_old.test_1_17;

/**
 * Created by lichen@daojia.com on 2019-1-17.
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++){
            cur = cur ^ nums[i];
        }
        return cur;
    }
}
