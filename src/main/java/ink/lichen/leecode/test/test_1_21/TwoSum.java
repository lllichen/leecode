package ink.lichen.leecode.test.test_1_21;

import java.util.HashMap;

/**
 * Created by lichen@daojia.com on 2019-1-21.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length; i++){
            int val = target - nums[i];
            if (map.get(val) != null){
                res[0] = map.get(val);
                res[1] = i;
            }else {
                map.put(nums[i],i);
            }
        }
        return res;
    }

}
