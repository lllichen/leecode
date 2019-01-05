package ink.lichen.leecode.test.test_1_5;

/**
 * Created by lichen@daojia.com on 2019-1-5.
 */
public class RemoveDuplicates {


    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 1){
            return n;
        }
        int j = 0;
        for (int i = 1 ; i < n ; i++){
            if (nums[i] != nums[j]){
                if (i != j+1){
                    nums[j] = nums[i];
                }
                j++;
            }
        }
        return j+1;
    }

    public static void main(String[] args) {
        RemoveDuplicates.removeDuplicates(new int[]{1,2,2,4,5,6,7,7,7,8,9});
    }
}
