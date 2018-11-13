package ink.lichen.leecode.tx;

/**
 * Created by lichen@daojia.com on 2018-11-13.
 */
public class RemoveDuplicates {


    public static int removeDuplicates(int[] nums) {
        int j = 0, n = nums.length;
        for( int i = 0; i < n ; i++){
            if(nums[j] != nums[i]){
                j++;
                if ( j != i )
                {
                    nums[j] = nums[i];
                }
            }
        }
        return j;
    }
}
