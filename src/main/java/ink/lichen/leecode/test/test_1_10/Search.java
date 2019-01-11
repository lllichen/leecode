package ink.lichen.leecode.test.test_1_10;

/**
 * Created by lichen@daojia.com on 2019-1-10.
 */
public class Search {


    public int search(int[] nums, int target) {
        int n = nums.length;
        if ( n == 0){
            return -1;
        }
        int pivot = nums[0];
        int left = 0, right = n-1;
        while (left <= right){
            int center = (left + right)>>1;
            if (target > pivot){
                if (nums[center] < pivot || nums[center] > target){
                    right = center - 1;
                }else if (nums[center] >=pivot && nums[center] <target){
                    left = center + 1;
                }else {
                    return center;
                }
            }else if (target < pivot){
                    if (nums[center] >= pivot || nums[center] < target){
                        left = center+1;
                    }else if (nums[center]> target && nums[center] < pivot){
                        right = center - 1;
                    }else {
                        return center;
                    }
            }else {
                return 0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Search().search(new int[]{4,5,6,7,0,1,2},0));
    }
}
