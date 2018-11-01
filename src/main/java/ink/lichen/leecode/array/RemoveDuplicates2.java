package ink.lichen.leecode.array;

/**
 * Created by lichen@daojia.com on 2018-11-1.
 */
public class RemoveDuplicates2 {



    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1 || n == 2)
        {
            return n;
        }
        int i = 0;

        for (int j = 2 ; j < n; j++ )
        {
            if (nums[j] != nums[i]&& nums[j-1] == nums[i]){

            }
            i++;
        }

        return 0;
    }
}
