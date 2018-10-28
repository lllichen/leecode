package ink.lichen.leecode.medium;

/**
 * Created by lichen@daojia.com on 2018-10-26.
 * 输入: [2,3,1,1,4]
 * 输出: true
 */
public class CanJump {

    public boolean canJump(int[] nums) {

        int n = nums.length;
        if (n == 1){
            return true;
        }

        int max = 0;
        for (int i = 0 ; i < n ; i++)
        {
            int val = nums[i];
            if (val > max){
                max = val;
            }
            if (max <= 0 && i != n -1 ){
                return false;
            }
            max--;
        }
        return true;
    }

    public static void main(String[] args) {
        CanJump canJump = new CanJump();
        System.out.println( canJump.canJump(new int[]{2,0,0}));
    }
}
