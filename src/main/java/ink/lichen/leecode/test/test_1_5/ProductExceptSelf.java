package ink.lichen.leecode.test.test_1_5;

/**
 * Created by lichen@daojia.com on 2019-1-5.
 */
public class ProductExceptSelf {


    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        if ( n <= 1){
            return nums;
        }
        int [] res = new int[n];

        int left = 1;
        int right = 1;
        for (int i = 1; i < n ;i++){
            left = left*nums[i-1];
            res[i] = left;
        }

        for (int i = n-1; i >=0 ;i-- ){
            right = right * nums[i+1];
            res[i] = right;
        }

        return res;
    }
}
