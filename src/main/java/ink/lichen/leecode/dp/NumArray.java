package ink.lichen.leecode.dp;

/**
 * Created by lichen@daojia.com on 2018-12-10.
 */
public class NumArray {

    int [] nums;

    int [][] res;

    public NumArray(int[] nums) {
        this.nums = nums;
        res  = new int[nums.length+1][nums.length+1];
        for (int i = 1 ; i < nums.length+1; i++){
            for (int j = i ; j < nums.length+1; j++){
                res[i][j] = res[i][j-1]+nums[i-1];
            }
        }

    }

    public int sumRange(int i, int j) {
        return res[i+1][j+1];
    }
}
