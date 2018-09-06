package ink.lichen.leecode.medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by lichen@daojia.com on 2018-9-6.
 */
public class ThreeNumberZero {


    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int left = i + 1, right = nums.length - 1; left < right; ) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < --right && nums[right] == nums[right + 1]);
                    while (++left < right && nums[left] == nums[left - 1]);
                    while (i < nums.length - 2 && nums[i] == nums[i + 1]) {
                        i++;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
