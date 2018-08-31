package ink.lichen.leecode.easy;

/**
 * Created by lichen@daojia.com on 2018-8-30.
 */
public class ArrayPivot {

    public int pivotIndex(int[] nums) {

        if(nums.length == 0){
            return -1;
        }
        if (nums.length == 1){
            return 0;
        }

        int sum = 0;

        for (int val : nums){
            sum = sum + val;
        }

        int carry = 0;
        for (int i = 0 ; i < nums.length; i++){
            if (sum - nums[i] == carry ){
                return i;
            }else {
                carry = carry + nums[i];
                sum = sum - nums[i];
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int [] a = new int[] {-1,-1,-1,0,1,1};
        ArrayPivot arrayPivot = new ArrayPivot();
        arrayPivot.pivotIndex( a );
    }

}
