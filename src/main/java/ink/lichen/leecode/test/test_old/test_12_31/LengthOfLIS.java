package ink.lichen.leecode.test.test_old.test_12_31;

public class LengthOfLIS {



    public int lengthOfLIS(int[] nums) {

        int maxL = 0;
        int[] dp = new int[nums.length];
        for(int num : nums) {
            // 二分法查找, 也可以调用库函数如binary_search
            int lo = 0, hi = maxL;
            while(lo < hi) {
                int mid = lo+(hi-lo)/2;
                if(dp[mid] < num)
                    lo = mid+1;
                else
                    hi = mid;
            }
            dp[lo] = num;
            if(lo == maxL)
                maxL++;

            for (int val : dp){
                System.out.print(val+"\t");
            }
            System.out.println();
        }
        return maxL;
    }

    public static void main(String[] args) {
        LengthOfLIS lengthOfLIS = new LengthOfLIS();
        lengthOfLIS.lengthOfLIS(new int[]{20,19,18,17,16,15,7,13,12,11,10,8,7,6,5,4,3,2,1});
    }

}
