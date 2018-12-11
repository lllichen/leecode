package ink.lichen.leecode.dp;

/**
 * Created by lichen@daojia.com on 2018-12-10.
 */
public class NumArray {

    int [] nums;


    public NumArray(int[] nums) {
        this.nums = nums;
        for (int i = 1 ; i < nums.length; i++){
            nums[i] = nums[i]+nums[i-1];
        }

    }

    public int sumRange(int i, int j) {
        return i==0? nums[j]:nums[j]-nums[i-1];
    }

    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{-2,0,3,-5,2,-1});
        System.out.println(numArray.sumRange(0,2));
        System.out.println(numArray.sumRange(2,5));
        System.out.println(numArray.sumRange(0,5));
    }
}
