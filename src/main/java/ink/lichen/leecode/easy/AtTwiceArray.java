package ink.lichen.leecode.easy;

/**
 * Created by lichen@daojia.com on 2018-8-31.
 */
public class AtTwiceArray {

    public int dominantIndex(int[] nums) {

        int max = 0;

        int index = 0;

        for (int i = 0 ; i < nums.length ; i++){
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        for (int i = 0 ; i < nums.length ; i++){
            if (2*nums[i] > max){
                return -1;
            }
        }
        return index;

    }
}
