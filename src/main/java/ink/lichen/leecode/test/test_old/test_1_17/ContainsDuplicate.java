package ink.lichen.leecode.test.test_old.test_1_17;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lichen@daojia.com on 2019-1-17.
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 */
public class ContainsDuplicate {

    //set
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        if (n <= 1){
            return false;
        }
        Set<Integer> set = new HashSet();
        for (int val : nums){
            if (set.contains(val)){
                return true;
            }
        }
        return false;
    }
}
