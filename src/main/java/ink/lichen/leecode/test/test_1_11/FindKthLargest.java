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
            int pivot = median3(nums,left,right);
            int i = left,j= right-1;
            for (;;){
                while (nums[++i]>pivot){};
                while (nums[--j]<pivot){};

            }
        }
    }

    private int median3(int[] nums, int left, int right) {
        int center = (left+right) >>1;
        if (nums[center]>nums[left]){
            swap(nums,left,center);
        }
        if (nums[right]>nums[left]){
            swap(nums,left,right);
        }
        if (nums[right]>nums[center]){
            swap(nums,right,center);
        }
        swap(nums,center,right-1);
        return nums[right-1];
    }

    private int swap(int[] nums,int a, int b){
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }
}
