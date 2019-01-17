package ink.lichen.leecode.test.test_old.test_1_10;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int res = nums[0];
        for (int i = 1 ;i < nums.length; i++){
            res = res ^ nums[i];
        }
        return res;
    }
}
