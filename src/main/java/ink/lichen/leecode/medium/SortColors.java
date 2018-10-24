package ink.lichen.leecode.medium;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lichen@daojia.com on 2018-10-24.
 * [2,0,2,1,1,0]
 * [0,0,1,1,2,2]
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
        int[] flag = new int[3];
        for (int i = 0; i < nums.length; i++) {
            flag[nums[i]]++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < flag[0]){
                nums[i] = 0;
            }else if (i < flag[0]+flag[1]){
                nums[i] = 1;
            }else{
                nums[i] = 2;
            }
        }
    }

    public static void main(String[] args) {

    }
}
