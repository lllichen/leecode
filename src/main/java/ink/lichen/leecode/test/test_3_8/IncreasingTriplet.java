package ink.lichen.leecode.test.test_3_8;

/**
 * Created by lichen@daojia.com on 2019-3-8.
 *给定一个未排序的数组，判断这个数组中是否存在长度为 3 的递增子序列。
 * 输入: [1,2,3,4,5]
 * 输出: true
 */
public class IncreasingTriplet {


    public boolean increasingTriplet(int[] nums) {
        if (nums.length< 3){
            return false;
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums){
            if (first> num){
                first = num;
            }else if ( num > first && num < second ){
                second = num;
            }else if (num > second){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        IncreasingTriplet increasingTriplet = new IncreasingTriplet();
        increasingTriplet.increasingTriplet(new int[]{1,2,3,4,5});
    }
}
