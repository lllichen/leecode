package ink.lichen.leecode.set;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by lichen@daojia.com on 2018-12-8.
 */
public class Intersection {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int val : nums1){
            set.add(val);
        }
        Set<Integer> resSet = new HashSet<>();
        for (int val : nums2) {
            if (set.contains(val)){
                resSet.add(val);
            }
        }

        int[] res = new int[resSet.size()];
        int i = 0;
        for (int val : resSet)
             res[i++] = val;
        return res;
    }
}
