package ink.lichen.leecode.tx;

/**
 * Created by lichen@daojia.com on 2018-11-13.
 */
public class RemoveDuplicates {


    public static int removeDuplicates(int[] nums) {
        int j = 0, n = nums.length;
        for( int i = 1;i < n;i++){
            if(nums[j] != nums[i]){
                if (j+1 != i)
                {
                    nums[++j] = nums[i];
                }else
                {
                    j++;
                }
            }
        }
        return j;
    }
}
