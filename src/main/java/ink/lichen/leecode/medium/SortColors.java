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

//    public void sortColors(int[] nums) {
//        int[] flag = new int[3];
//        for (int i = 0; i < nums.length; i++) {
//            flag[nums[i]]++;
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            if (i < flag[0]){
//                nums[i] = 0;
//            }else if (i < flag[0]+flag[1]){
//                nums[i] = 1;
//            }else{
//                nums[i] = 2;
//            }
//        }
//    }


    public void sortColors(int[] nums) {

        int j;
        int mark = 1;
        int flag = 0;
        for (int i = 0 ; i < nums.length ; i++){
            if (nums[i] != flag){
                j = mark;
                while ( j< nums.length && nums[j] != flag  ){
                    j++;
                }
                if (j< nums.length && nums[j] == flag){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    mark = j+1;
                }

                if (j == nums.length-1){
                    flag  =+ 1;
                    mark = i+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        SortColors sortColors = new SortColors();
        sortColors.sortColors(new int[]{2,0,2,1,1,0});
    }
}
