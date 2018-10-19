package ink.lichen.leecode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
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

//    List<List<Integer>> res;
//    boolean[] used;
//
//    public List<List<Integer>> permute(int[] nums) {
//        res = new LinkedList<List<Integer>>();
//        used = new boolean[nums.length];
//        List<Integer> tmp = new LinkedList<Integer>();
//        helper(nums, tmp);
//        return res;
//    }
//
//    private void helper(int[] nums, List<Integer> tmp){
//        if(tmp.size() == nums.length){
//            List<Integer> list = new LinkedList<Integer>(tmp);
//            res.add(list);
//        } else {
//            for(int idx = 0; idx < nums.length; idx++){
//                // 遇到已经加过的元素就跳过
//                if(used[idx]){
//                    continue;
//                }
//                // 加入该元素后继续搜索
//                used[idx] = true;
//                tmp.add(nums[idx]);
//                helper(nums, tmp);
//                tmp.remove(tmp.size()-1);
//                used[idx] = false;
//            }
//        }
//    }


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        // Arrays.sort(nums); // not necessary
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.length; i++){
                if(tempList.contains(nums[i]))
                    continue; // element already exists, skip
                tempList.add(nums[i]);
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int [] val = new int[]{1,2,3};
        Permute permute = new Permute();
        System.out.println(permute.permute(val));
    }

}
