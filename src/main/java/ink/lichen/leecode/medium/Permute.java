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

    List<List<Integer>> res;
    boolean[] used;

    public List<List<Integer>> permute(int[] nums) {
        res = new LinkedList<List<Integer>>();
        used = new boolean[nums.length];
        List<Integer> tmp = new LinkedList<Integer>();
        helper(nums, tmp);
        return res;
    }

    private void helper(int[] nums, List<Integer> tmp){
        if(tmp.size() == nums.length){
            List<Integer> list = new LinkedList<Integer>(tmp);
            res.add(list);
        } else {
            for(int idx = 0; idx < nums.length; idx++){
                // 遇到已经加过的元素就跳过
                if(used[idx]){
                    continue;
                }
                // 加入该元素后继续搜索
                used[idx] = true;
                tmp.add(nums[idx]);
                helper(nums, tmp);
                tmp.remove(tmp.size()-1);
                used[idx] = false;
            }
        }
    }

    public static void main(String[] args) {
        int [] val = new int[]{1,2,3};
        Permute permute = new Permute();
        permute.permute(val);
    }

}
