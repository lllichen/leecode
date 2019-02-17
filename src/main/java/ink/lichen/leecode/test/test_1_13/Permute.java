package ink.lichen.leecode.test.test_1_13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permute {


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] flag = new boolean[nums.length];
        help(res,new LinkedList<Integer>(), nums,flag,0);
        return res;
    }

    public void help(List<List<Integer>> res, LinkedList<Integer> list, int[] nums, boolean[] flag, int start){
        if (list.size() == nums.length){
            res.add(new ArrayList<Integer>(list));
        }else{
            for(int i = 0; i < nums.length;i++){
                if (flag[i]){
                    continue;
                }else {
                    list.add(nums[i]);
                    flag[i] = true;
                    help(res,list,nums,flag,i+1);
                    list.remove(list.size()-1);
                    flag[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        new Permute().permute(new int[] {1,2,3,4});
    }
}
