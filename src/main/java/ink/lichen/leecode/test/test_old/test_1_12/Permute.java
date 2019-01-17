package ink.lichen.leecode.test.test_old.test_1_12;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2019-1-12.
 *
 * 输入: [1,2,3]
 * 输出:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 *
 */
public class Permute {

    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        permute(nums,0);
        return lists;

    }
    private void permute(int [] nums,int start){
        if(start>=nums.length){
            List<Integer> list = array2list(nums);
            lists.add(list);
        }

        for(int i = start;i<nums.length;i++){
            swap(nums,start,i);
            permute(nums,start+1);
            swap(nums,start,i);
        }
    }
    private void swap(int [] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private List<Integer> array2list(int[] array){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < array.length;i++){
            list.add(array[i]);
        }
        return list;
    }
}
