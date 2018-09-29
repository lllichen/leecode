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

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        System.out.println(list);

        for (int i =0 ; i < nums.length; i++){


        }

        return res;
    }

    public void help(List<List<Integer>> list , List<Integer> numList,int[] nums)
    {
        if (numList.size() == nums.length)
        {
            list.add(numList);
        }

        for (int val : nums)
        {
            List newList = new ArrayList();
            newList.addAll(numList);
            newList.add(val);

            help(list,newList,nums);
        }
    }
//
//    public List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> list = new ArrayList<>();
//        Arrays.sort(nums);
//        backtrack(list, new ArrayList<>(), nums, 0);
//        return list;
//    }

//    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
//        list.add(new ArrayList<>(tempList));
//        for(int i = start; i < nums.length; i++){
//            tempList.add(nums[i]);
//            backtrack(list, tempList, nums, i + 1);
//            tempList.remove(tempList.size() - 1);
//        }
//    }

    public static void main(String[] args) {
        int [] a = new int[]{1,2,3};
        Permute permute = new Permute();
//        permute.help();
    }

}
