package ink.lichen.leecode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-10-16.
 *
 * Input: nums = [1,2,3]
     Output:
     [
     [3],
     [1],
     [2],
     [1,2,3],
     [1,3],
     [2,3],
     [1,2],
     []
     ]
 *
 *
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        this.backtrack(result,new ArrayList<>(),nums);

        return result;
    }

    public void backtrack(List<List<Integer>> result,List<Integer> temp,int[] nums){

    }

}
