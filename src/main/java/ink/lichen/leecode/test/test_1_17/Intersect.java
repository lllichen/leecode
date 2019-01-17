package ink.lichen.leecode.test.test_1_17;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by lichen@daojia.com on 2019-1-17.
 */
public class Intersect {


    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int val : nums1){
            int value = map.getOrDefault(val,0);
            map.put(val,value+1);
        }
        int j=0;
        for (int i = 0 ; i < nums2.length; i++){
            int value = map.getOrDefault(nums2[i],0);
            if (value > 0){
                if (j != i){
                    nums2[j++] = nums2[i];
                }else {
                    j++;
                }
                map.put(nums2[i],value-1);
            }
        }
        return Arrays.copyOf(nums2,j);
    }
}
