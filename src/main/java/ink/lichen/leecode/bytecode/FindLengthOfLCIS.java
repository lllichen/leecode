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

        if(nums.length == 0)
            return 0;
        int max = 0;
        int count = 1;
        for(int i=0;i<nums.length - 1;i++){
            if(nums[i] < nums[i+1]){
                count++;
            }else{
                max = Math.max(count,max);
                count = 1;
            }
        }
        max = Math.max(count,max);
        return max;

    }

    public static void main(String[] args) {
        FindLengthOfLCIS findLengthOfLCIS = new FindLengthOfLCIS();
        System.out.println(findLengthOfLCIS.findLengthOfLCIS(new int[]{2,2,2,2}));
    }
}
