package ink.lichen.leecode.bytecode;

/**
 * Created by lichen@daojia.com on 2018-11-26.
 *
 * 输入: [1,3,5,4,7]
 * 输出: 3
 * 解释: 最长连续递增序列是 [1,3,5], 长度为3。
 * 尽管 [1,3,5,7] 也是升序的子序列, 但它不是连续的，因为5和7在原数组里被4隔开。
 *
 */
public class FindLengthOfLCIS {


    public int findLengthOfLCIS(int[] nums) {
        int i = 0,j = 1, n = nums.length;
        if (n <= 1){
            return n;
        }
        int max = 0;
        int cur = 1;
        while (j < n) {
            if (nums[j++] > nums[i++]){
                cur++;
                if (max < cur){
                    max = cur;
                }else {
                    cur = 0;
                }
            }
        }

        return max == 0 ? 1:max;
    }

    public static void main(String[] args) {
        FindLengthOfLCIS findLengthOfLCIS = new FindLengthOfLCIS();
        System.out.println(findLengthOfLCIS.findLengthOfLCIS(new int[]{1,3,5,4,7}));
    }
}
