package ink.lichen.leecode.test.test_old.test_1_18;

/**
 * Created by lichen@daojia.com on 2019-1-18.
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 *
 */
public class MoveZeroes {


    public void moveZeroes(int[] nums) {

        int i = -1;
        for (int j = 0 ; j < nums.length ; j++){
            if (nums[j] != 0){
                nums[++i] = nums[j];
            }
        }

        for (i = i+1; i < nums.length; i++){
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        new MoveZeroes().moveZeroes(new int[]{0,1,0,3,12});
    }
}
