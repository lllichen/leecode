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

        for (int j = 1 ; j < n; j++ )
        {
            if (nums[j] != nums[i]&& j == i+1){
                i++;
            }else if (nums[j] == nums[i] && j == i+1){

            }
            i++;
        }

        return 0;
    }
}
