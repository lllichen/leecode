package ink.lichen.leecode.test.test_3_12;

/**
 * Created by lichen@daojia.com on 2019-3-13.
 * 给定一个无序的数组 nums，将它重新排列成 nums[0] < nums[1] > nums[2] < nums[3]... 的顺序
 *
 * 输入: nums = [1, 3, 2, 2, 3, 1]
 * 输出: 一个可能的答案是 [2, 3, 1, 3, 1, 2]
 */
public class WiggleSort {

    public void wiggleSort(int[] nums) {
        /* quick select: find the middle element
         * 3 way partitions: [h, l, ...]
         * [2, 0, 3, 1], [2, 0, 3, 1, 4]
         */
        n = nums.length;
        int mid = quickSelect(nums, 0, nums.length - 1, nums.length / 2);
        partition(nums, 0, nums.length - 1, mid);
    }

    int n;
    private void partition(int[] nums, int l, int r, int mid) {
        int i = l;
        while(i <= r) {
            if(nums[mapping(i)] > mid) swap(nums, mapping(i++), mapping(l++));
            else if(nums[mapping(i)] < mid) swap(nums, mapping(i), mapping(r--));
            else i++;

        }
    }

    private int mapping(int i) {
        return (2 * i + 1) % (n | 1);
    }

    private int quickSelect(int[] nums, int l, int r, int k) {
        if(l >= r)  return nums[l];

        int pivot = nums[r];
        int index = l;
        for(int i = l; i < r; i++) {
            if(nums[i] < pivot) swap(nums, i, index++);
        }
        // swap the pivot to the correct position
        swap(nums, index, r);
        if(index == k) return nums[index];
        else if(index < k) return quickSelect(nums, index + 1, r, k);
        else return quickSelect(nums, l, index - 1, k);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        new WiggleSort().wiggleSort(new int[]{2, 3, 1, 3, 1, 2});
    }
}
