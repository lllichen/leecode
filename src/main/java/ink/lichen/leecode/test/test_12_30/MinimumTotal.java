package ink.lichen.leecode.test.test_12_30;

import java.util.List;

public class MinimumTotal {


    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int [] dp = new int[n+1];
        for (int i = n-1 ; i >= 0; i--){
            List<Integer> temp = triangle.get(i);
            for (int j = 0 ; j < temp.size(); j++){
                dp[j] = Math.min(temp.get(j)+dp[j],temp.get(j)+dp[j+1]);
            }

        }
        return dp[0];
    }
}
