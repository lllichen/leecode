package ink.lichen.leecode.medium;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by lichen@daojia.com on 2018-10-29.
 */
public class LengthOfLIS {

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int[] dp  = new int[nums.length];
        Arrays.fill(dp,1);
        int res = 0;
        for ( int i = 0; i < nums.length; i++){
            for (int j = 0 ; j < i; j++){
                if (nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            res = Math.max(res,dp[i]);
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
