package ink.lichen.leecode.hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet();
        Set<Integer> res = new HashSet();
        for (int val : nums1){
            set.add(val);
        }
        for (int val : nums2){
            if (set.contains(val)){
                res.add(val);
            }
        }
        return set.stream().mapToInt(Number::intValue).toArray();
    }
}
