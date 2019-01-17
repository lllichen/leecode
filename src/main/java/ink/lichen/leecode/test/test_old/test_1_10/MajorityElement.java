package ink.lichen.leecode.test.test_old.test_1_10;

/**
 * 输入: [3,2,3]
 * 输出: 3
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        int n = nums.length;
        if ( n == 1){
            return nums[0];
        }
        int tmp = nums[0];
        int count = 1;
        for (int i=1; i < n ; i++){
            if (tmp == nums[i]){
                count++;
            }else {
                if (count == 1){
                    tmp = nums[i];
                }else {
                    count--;
                }
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        System.out.println(new MajorityElement().majorityElement(new int[]{3,2,3}));
    }
}
