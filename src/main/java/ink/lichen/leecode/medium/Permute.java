package ink.lichen.leecode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-9-21.
 *
 * 输入: [1,2,3]
     输出:
     [
     [1,2,3],
     [1,3,2],
     [2,1,3],
     [2,3,1],
     [3,1,2],
     [3,2,1]
     ]
 *
 */
public class Permute {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList();

        help(list,new ArrayList<>(),nums);

        return list;
    }

    public void help(List<List<Integer>> list , List<Integer> numList,int[] nums)
    {
        if (numList.size() == nums.length){
            list.add(numList);
        }

        for (int val : nums){
            numList.add(val);
        }
    }

}
