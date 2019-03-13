package ink.lichen.leecode.test.test_3_13;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by lichen@daojia.com on 2019-3-13.
 * 输入: []
 * 输出: 9534330
 */
public class LargestNumber {

    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] val = new String[n];
        for (int i = 0 ; i < n ; i ++){
            val[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(val, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if ((o1+o2).compareTo(o2+o1) >0){
                    return -1;
                }else if ((o1+o2).compareTo(o2+o1) < 0){
                    return 1;
                }else {
                    return 0;
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        if (val[0].equals("0")){
            return "0";
        }
        for (int i = 0 ; i< n; i++){
            sb.append(val[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LargestNumber largestNumber = new LargestNumber();
        System.out.println(largestNumber.largestNumber(new int[]{3,30,34,5,9}));
    }
}
