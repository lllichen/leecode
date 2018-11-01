package ink.lichen.leecode.array;

/**
 * Created by lichen@daojia.com on 2018-11-1.
 */
public class RemoveDuplicates {


    public static int removeDuplicates(int[] nums) {

        int n = nums.length;
        if (n == 0 || n == 1){
            return n;
        }
        int i = 0;

        for (int j = 1 ;j < nums.length; j++ )
        {
            if (nums[j] != nums[i])
            {
                if (j != i+1){
                    nums[i+1] = nums[j];
                }
                i++;
            }
        }

        return i +1;
    }
}
