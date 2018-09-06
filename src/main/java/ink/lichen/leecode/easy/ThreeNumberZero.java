package ink.lichen.leecode.easy;

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

        Set<List<Integer>> set = new HashSet();

        List<List<Integer>> res = new LinkedList();
        if (nums.length <3){
            return res;
        }

        for (int i = 0 ;i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++) {

                for (int z = j + 1 ; z < nums.length; z++){
                    if(nums[i]+nums[j]+nums[z] == 0){
                        List<Integer> list = new ArrayList();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[z]);
                        if (!set.contains(list)){
                            res.add(list);
                            set.add(list);
                        }
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(1);
        list2.add(2);
        System.out.println(list.hashCode());
        System.out.println(list2.hashCode());
    }
}
