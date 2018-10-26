package ink.lichen.leecode.medium;

/**
 * 输入: nums = [4,5,6,7 ,0,1,2], target = 0
 * 输出: 4
 */
public class Search {

    public int search(int[] nums, int target) {
//        if (nums.length == 0){
//            return -1;
//        }
//        int flag = nums[0];
//
//        if (target == flag){
//            return 0;
//        }
//        int n = nums.length;
//        int lo=0,high=n-1;
//        while (lo <= high){
//            int mid = (lo + high)/2;
//            if (target > flag){
//                if (nums[mid] > target || nums[mid] < flag){
//                    high = mid-1;
//                }else if (nums[mid] < target && nums[mid]>=flag){
//                    lo = mid+1;
//                }
//            }else {
//                //target < flag
//                if (nums[mid] > target && nums [mid] < flag){
//                    high = mid-1;
//                }else if (nums[mid] < target || nums[mid] >= flag){
//                    lo = mid+1;
//                }
//            }
//            if (nums[mid] == target){
//                return mid;
//            }
//        }
//        return -1;

        if (nums == null || nums.length == 0) return -1;
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] > nums[end]) {  // eg. 3,4,5,6,1,2
                if (target > nums[mid] || target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            } else {  // eg. 5,6,1,2,3,4
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
        }
        if (start == end && target != nums[start]) return -1;
        return start;
    }


    public static void main(String[] args) {
        Search search = new Search();
//        System.out.println(search.search(new int[]{4,5,6,7,0,1,2},2));
        System.out.println(search.search(new int[]{3,1},1));
    }
}
