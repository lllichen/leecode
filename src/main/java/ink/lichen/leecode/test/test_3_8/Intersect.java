package ink.lichen.leecode.test.test_3_8;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lichen@daojia.com on 2019-3-8.
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 */
public class Intersect {


    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < n ; i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }

        return null;
    }
}
