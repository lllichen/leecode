package ink.lichen.leecode.test.test_1_11;

/**
 * Created by lichen@daojia.com on 2019-1-11.
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 */
public class FindKthLargest {


    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k > n || k < 1){
            return -1;
        }
        quickSelect(nums,0,n-1,k);

        return nums[k-1];
    }

    private void quickSelect(int[] nums, int left, int right, int k) {
        if (left < right){

        }
    }
}
