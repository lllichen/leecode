package ink.lichen.leecode.array;

/**
 * Created by lichen@daojia.com on 2018-11-1.
 */
public class RemoveDuplicates2 {



    public int removeDuplicates(int[] nums) {
        int n = 0;
        for (int val : nums){
            if (n < 2 || val > nums[n-2]){
                nums[n++] = val;
            }
        }
        return n;
    }
}
