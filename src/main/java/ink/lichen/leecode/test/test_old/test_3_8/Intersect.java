package ink.lichen.leecode.test.test_old.test_3_8;

import java.util.Arrays;
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
        if (n == 0 || m == 0){
            return new int[]{};
        }
        if (n< m){
            return intersect(nums2,nums1);
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < n ; i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }

        int z = 0;
        for (int i = 0 ; i < m; i++){
            Integer val = map.get(nums2[i]);
            if (val != null && val > 0){
                nums2[z++] = nums2[i];
                map.put(nums2[i],val-1);
            }
        }
        return Arrays.copyOf(nums2,z);
    }

    public static void main(String[] args) {
        System.out.println(new Intersect().intersect(new int[]{4,9,5},new int[]{9,4,9,8,5}));
    }
}
