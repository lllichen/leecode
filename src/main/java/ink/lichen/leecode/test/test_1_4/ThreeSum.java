package ink.lichen.leecode.test.test_1_4;

import java.lang.reflect.Array;
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
            help(res,nums,i);
        }
        return res;
    }

    public void help(List<List<Integer>> res,int[] nums, int i){
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
                ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                while (left < --right && nums[right] == nums[right + 1]);
                while (right > ++left && nums[left] == nums[left - 1]);
                while (i < nums.length - 2 && nums[i] == nums[i + 1]) {
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    }
}
