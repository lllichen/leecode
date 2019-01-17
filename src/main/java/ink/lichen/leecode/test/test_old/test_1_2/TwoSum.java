package ink.lichen.leecode.test.test_old.test_1_2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lichen@daojia.com on 2019-1-2.
 */
public class TwoSum {


    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            Integer idx = map.get(nums[i]);
            if (idx != null){
                res[0] = idx;
                res[1] = i;
                return res;
            }else {
                map.put(target-nums[i],i);
            }
        }
        return res;
    }

}
