package ink.lichen.leecode.tx;

/**
 * Created by lichen@daojia.com on 2018-11-13.
 */
public class RemoveDuplicates {


    public static int removeDuplicates(int[] nums) {

//        int j = 0, n = nums.length;
//        for( int i = 1; i < n ; i++){
//            if(nums[j] != nums[i]){
//                j++;
//                if ( j != i )
//                {
//                    nums[j] = nums[i];
//                }
//            }
//        }
//        return j;
        int i = 0;
        for (int val : nums){
            if (i < 1 || val>nums[i-1]){
                nums[i++] = val;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{1,1,2});
    }
}
