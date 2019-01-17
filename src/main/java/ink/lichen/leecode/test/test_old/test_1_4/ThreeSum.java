package ink.lichen.leecode.test.test_old.test_1_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2019-1-4.
 */
public class ThreeSum {


    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        if (n <= 2){
            return res;
        }

        Arrays.sort(nums);
        for (int i = 0 ; i < n-2; i++){
            int right = nums.length-1;
            int left = i+1;
            int target = nums[i];
            while (left < right){
                int sum = target + nums[left]+nums[right];
                if ( sum < 0){
                    left++;
                }else if (sum >0){
                    right--;
                }else {
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left < --right && nums[right] == nums[right + 1]);
                    while (right > ++left && nums[left] == nums[left - 1]);
                    while (i < nums.length - 2 && nums[i] == nums[i + 1]) {
                        i++;
                    }
                }
            }
        }
        return res;
    }


//    public List<List<Integer>> threeSum(int[] nums) {

//         Arrays.sort(nums);

//         List<List<Integer>> ans = new ArrayList<>();
//         for (int i = 0 ; i < nums.length-2;i++){
//             int left = i+1;int right = nums.length-1;
//             while (left< right){
//                 int sum = nums[i] + nums[left]+nums[right];
//                 if (sum < 0){
//                     left++;
//                 }else if (sum > 0){
//                     right--;
//                 }else{
//                     ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
//                     while (left < --right && nums[right] == nums[right + 1]);
//                     while (right > ++left && nums[left] == nums[left - 1]);
//                     while (i < nums.length - 2 && nums[i] == nums[i + 1]) {
//                         i++;
//                     }
//                 }

//             }
//         }

//         return ans;
//     }

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    }
}
