package ink.lichen.leecode.test.test_1_21;

/**
 * Created by lichen@daojia.com on 2019-1-21.
 */
public class Reverse {

    public int reverse(int x) {

        int max = Integer.MAX_VALUE/10;
        int min = Integer.MIN_VALUE/10;
        int res = 0;
        while (x  != 0 ){
            if (res < min || res > max){
                return 0;
            }
            res = res * 10 + x%10;
            x = x / 10;
        }
        return res;

    }
}
