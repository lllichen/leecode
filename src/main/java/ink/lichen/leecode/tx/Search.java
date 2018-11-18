package ink.lichen.leecode.tx;

public class Search {


    public int search(int[] nums, int target) {
        int n = nums.length;
        if ( n == 0){
            return -1;
        }
        int hi = n-1, lo = 0;
        int val_0 = nums[0];
        if (target == val_0){
            return 0;
        }
        boolean right = false;
        if (target < val_0){
            right = true;
        }
        while (lo <= hi){
            int mid = (hi + lo)>>1;
            if (right && nums[mid] >= val_0){
                lo = mid + 1;
            }else if (!right && nums[mid] < val_0){
                hi = hi - 1;
            }else {
                if (nums[mid] > target ){
                    hi = mid-1;
                }else if (nums[mid] < target){
                    lo = mid + 1;
                }else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
