package ink.lichen.leecode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lichen@daojia.com on 2018-11-2.
 */
public class TwoSum {

    //-1,0 -1
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int [2];
        int n = numbers.length;
        if (n < 2){
            return res;
        }
        int begin = 0;
        int end = n-1;
        while (begin < end){
            int sum = numbers[begin] + numbers[end];
            if (sum < target){
                begin += 1;
            }else if (sum > target){
                end -= 1;
            }else {
                res[0] = begin + 1;
                res[1] = end +1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        twoSum.twoSum(new int[]{-1,0},-1);
    }
}


