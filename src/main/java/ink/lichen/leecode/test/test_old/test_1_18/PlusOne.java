package ink.lichen.leecode.test.test_old.test_1_18;

/**
 * Created by lichen@daojia.com on 2019-1-18.
 */
public class PlusOne {


    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if (n == 0){
            return new int[]{};
        }
        boolean isAllNine = true;
        for (int val : digits){
            if (val != 9){
                isAllNine = false;
                break;
            }
        }
        if (isAllNine){
            int[] res = new int[n+1];
            res[0] = 1;
            return res;
        }
        int cur = 1;
        for (int i = n - 1; i >= 0 ; i--){
            digits[i] = digits[i] + cur;
            if (digits[i] == 10){
                digits[i] = 0;
            }else {
                break;
            }
        }

        return digits;
    }

    public static void main(String[] args) {
        new PlusOne().plusOne(new int[]{9});
    }
}
