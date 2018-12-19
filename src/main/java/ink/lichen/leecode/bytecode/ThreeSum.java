package ink.lichen.leecode.bytecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-12-19.
 */
public class ThreeSum {

    //-4 -1 -1 0 1 2
    //-1
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0 ; i < nums.length-2;i++){
            int left = i+1;int right = nums.length-1;
            while (left< right){
                int sum = nums[i] + nums[left]+nums[right];
                if (sum < 0){
                    left++;
                }else if (sum > 0){
                    right--;
                }else{
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    while(nums[left]==nums[++left]){};
                    while(nums[right]==nums[--right]){};
                    while(nums[i]==nums[++i]){};
                }

            }
        }

        return ans;
    }

}
