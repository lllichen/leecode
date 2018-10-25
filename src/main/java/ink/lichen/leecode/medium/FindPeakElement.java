package ink.lichen.leecode.medium;

/**
 * Created by lichen@daojia.com on 2018-10-25.
 *
 *
 * 峰值元素是指其值大于左右相邻值的元素。
 *
 * 给定一个输入数组 nums，其中 nums[i] ≠ nums[i+1]，找到峰值元素并返回其索引。
 *
 * 数组可能包含多个峰值，在这种情况下，返回任何一个峰值所在位置即可。
 *
 * 你可以假设 nums[-1] = nums[n] = -∞。
 *
 * 输入: nums = [1,2,3,1]
 * 输出: 2
 * 解释: 3 是峰值元素，你的函数应该返回其索引 2。
 *
 * 输入: nums = [1,2,1,3,5,6,4]
 * 输出: 1 或 5
 * 解释: 你的函数可以返回索引 1，其峰值元素为 2
 * 或者返回索引 5， 其峰值元素为 6
 *
 *
 */
public class FindPeakElement {

//    public int findPeakElement(int[] nums) {
//
//        if (nums.length == 1){
//            return 0;
//        }
//        for (int i = 0 ; i < nums.length ; i++){
//            if (i == 0){
//                if (nums[i] > nums[i+1])
//                    return i;
//            }else if (i == nums.length-1){
//                if (nums[i]> nums[i-1]){
//                    return i;
//                }
//            }else {
//                if (nums[i] > nums[i-1] && nums[i] > nums[i+1]){
//                    return i;
//                }
//            }
//        }
//        return 0;
//    }

    public int findPeakElement(int[] nums) {

        // 注意, nums[i] != nums[i+1], 则:
        // 1) mid > mid-1 && mid > mid+1, mid即为所求
        // 2) mid-1 < mid < mid+1, 在mid+1到n之间一定有peak, 一直递增那么就是最后一个元素, 否则出现一次变小的值, 该值的前一个必然是peak
        // 3) mid-1 > mid > mid+1, 在0到mid-1之间一定有peak, 道理同上
        // 4) mid-1 > mid < mid+1, 两侧均有peak, 任选一侧
        int n = nums.length;
        int lo = 0, hi = n - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > nums[mid + 1]) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }

}
