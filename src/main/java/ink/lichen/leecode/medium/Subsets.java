package ink.lichen.leecode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-10-16.
 * <p>
 * Input: nums = [1,2,3]
 * Output:
 * [
 * [3],
 * [1],
 * [2],
 * [1,2,3],
 * [1,3],
 * [2,3],
 * [1,2],
 * []
 * ]
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        result.add(new ArrayList<>());

        for (int i : nums){
            List<List<Integer>> tmp = new ArrayList<>();

            for(List temp : result){
                tmp.add(temp);
            }
            for (List temp : result){
                List tm = new ArrayList<>();
                tm.addAll(temp);
                tm.add(i);
               tmp.add(tm);
            }
            result = tmp;
        }

        return result;
    }

    //    public List<List<Integer>> subsets(int[] nums) {
//
//        List<List<Integer>> result = new ArrayList<>();
//        this.backtrack(result,new ArrayList<>(),nums);
//
//        return result;
//    }
//
//    public void backtrack(List<List<Integer>> result,List<Integer> temp,int[] nums){
//        if (!result.contains(temp)){
//
//        }
//    }

//    public List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> res = new ArrayList<List<Integer>>();
//        backTrack(res, new ArrayList<>(), nums, 0);
//        return res;
//    }
//
//    public void backTrack(List<List<Integer>> res, List<Integer> tempList, int[] nums, int n) {
//        if (tempList.size() <= n) {
//            res.add(new ArrayList<Integer>(tempList));
//        }
//        for (int i = n; i < nums.length; i++) {
//            tempList.add(nums[i]);
//            backTrack(res, tempList, nums, i + 1);
//            tempList.remove(tempList.size() - 1);
//        }
//    }
    public static void main(String[] args) {
        Subsets subsets = new Subsets();
        subsets.subsets(new int[]{1,2,3,4});
    }

}
