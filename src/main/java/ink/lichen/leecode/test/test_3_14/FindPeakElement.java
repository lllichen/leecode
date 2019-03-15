package ink.lichen.leecode.test.test_3_14;

/**
 * Created by lichen@daojia.com on 2019-3-14.
 * 输入: nums = [1,2,1,3,5,6,4]
 * 输出: 1 或 5
 * 解释: 你的函数可以返回索引 1，其峰值元素为 2；
 *      或者返回索引 5， 其峰值元素为 6。
 *
 */
public class FindPeakElement {

    public int findPeakElement(int[] nums) {
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
