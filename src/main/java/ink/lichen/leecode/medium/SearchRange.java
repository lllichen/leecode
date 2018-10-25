package ink.lichen.leecode.medium;

/**
 * Created by lichen@daojia.com on 2018-10-25.
 *
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * 如果数组中不存在目标值，返回 [-1, -1]。
 *
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: [3,4]
 *
 *
 */
public class SearchRange {


    public int[] searchRange(int[] nums, int target) {

        if (nums.length == 1 ){
            if (target == nums[0]){
                return new int[]{0,0};
            }
            return new int[]{-1,-1};
        }

        int n = nums.length;
        int lo = 0;int hi = n-1;
        int[] res = new int[]{-1,-1};
        while (lo<=hi){
            int mid = (lo+hi)/2;
            if (target < nums[mid] )
            {
                hi = mid-1;
            }
            if (target > nums[mid])
            {
                lo = mid+1;
            }
            if (target == nums[mid])
            {
                //left
                for(int i = mid ; i >= 0; i-- ){
                    if(nums[i] != target){
                        res[0] = i+1;
                        break;
                    }
                }
                if (res[0]==-1){
                    res[0] = 0;
                }
                for (int i = mid; i < nums.length; i++){
                    if (nums[i] != target){
                        res[1] = i-1;
                        break;
                    }
                }
                if (res[1] == -1){
                    res[1] = nums.length-1;
                }
                return res;
            }
        }
        return new int[]{-1,-1};

    }

    public static void main(String[] args) {
        int[] t = new int[]{1,4};
        SearchRange searchRange = new SearchRange();
        searchRange.searchRange(t,4);
    }
}
