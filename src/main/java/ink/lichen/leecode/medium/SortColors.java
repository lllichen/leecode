package ink.lichen.leecode.medium;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lichen@daojia.com on 2018-10-24.
 * [2,0,2,1,1,0]
 * [0,0,1,1,2,2]
 *
 * 一个直观的解决方案是使用计数排序的两趟扫描算法。
   首先，迭代计算出0、1 和 2 元素的个数，然后按照0、1、2的排序，重写当前数组。
   你能想出一个仅使用常数空间的一趟扫描算法吗？
 */
public class SortColors {


    public void sortColors(int[] nums) {
        int red = 0;
        int blue  = nums.length-1;
        for (int i = 0; i <= blue ; i++){
            if (nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[red];
                nums[red++] = temp;
            }else if (nums[i] == 2){
                int temp = nums[i];
                nums[i--] = nums[blue];
                nums[blue--] = temp;
            }
        }

    }

    public static void main(String[] args) {
        SortColors sortColors = new SortColors();
        sortColors.sortColors(new int[]{2,0,1});
    }
}
