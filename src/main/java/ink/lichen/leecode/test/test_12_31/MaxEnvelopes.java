package ink.lichen.leecode.test.test_12_31;

import java.util.Arrays;
import java.util.Comparator;

public class MaxEnvelopes {


    public int maxEnvelopes(int[][] envelopes) {

        int n = envelopes.length;
        if (n <= 1){
            return n;
        }

        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0],o1[1]);
            }
        });

        int[] dp = new int[n+1];
        int ret = 0;
        for (int i = 0 ; i < n; i++){
            dp[i] = 1;
            for (int j = 1 ; j < i; j++ ){
                if (envelopes[i][0] > envelopes[j][0] && envelopes[i][1] > envelopes[j][1] ) {
                    dp[i] = Math.max(dp[i], dp[i] + 1);
                }
                if (ret < dp[i]){
                    ret = dp[i];
                }
            }
        }

        return ret;
    }

    public static void main(String[] args) {

    }
}
