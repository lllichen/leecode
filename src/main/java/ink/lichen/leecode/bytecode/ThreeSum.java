package ink.lichen.leecode.bytecode;

import java.util.*;

public class ThreeSum {


    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0 ; i < n-2; i++ ){
            int val_1 = nums[i];
            int begin = i+1; int end = n-1;
            while (begin < end){
                int val_2 = nums[begin];
                int val_3 = nums[end];
                int sum = val_1+val_2+val_3;
                if (sum < 0){
                    begin ++;
                }else if (sum > 0){
                    end--;
                }else {
                    ans.add(Arrays.asList(val_1,val_2,val_3));
                    while (begin < --end && nums[end] == nums[end + 1]);
                    while (++begin < end && nums[begin] == nums[begin - 1]);
                    while (i < nums.length - 2 && nums[i] == nums[i + 1]) {
                        i++;
                    }
                }
            }
        }


        return ans;
    }

    public static void main(String[] args) {
        Set set = new HashSet<Integer>();
        System.out.println(set.remove(1));
    }
}
