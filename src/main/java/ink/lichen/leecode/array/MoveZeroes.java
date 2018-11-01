package ink.lichen.leecode.array;

/**
 * Created by lichen@daojia.com on 2018-11-1.
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int j = -1;
        for (int val : nums)
        {
            if (val!= 0)
            {
                nums[++j] = val;
            }
        }
        for ( j = j+1 ;j< nums.length; j++)
        {
            nums[j] = 0;
        }
    }
}
