package ink.lichen.leecode.easy.array;

/**
 * Created by lichen@daojia.com on 2018-11-1.
 */
public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {

            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }

        }
        return i +1;
    }
}
