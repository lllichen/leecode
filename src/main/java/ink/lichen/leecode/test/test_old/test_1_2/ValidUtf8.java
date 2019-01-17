package ink.lichen.leecode.test.test_old.test_1_2;

/**
 * Created by lichen@daojia.com on 2019-1-2.
 */
public class ValidUtf8 {


    public boolean validUtf8(int[] data) {
        if (data == null || data.length == 0) {
            return true;
        }

        int cnt = 0;
        for (int d : data) {
            if (cnt == 0) {
                if (d >> 3 == 0b11110) {
                    cnt = 3;
                } else if (d >> 4 == 0b1110) {
                    cnt = 2;
                } else if (d >> 5 == 0b110) {
                    cnt = 1;
                } else if (d >> 7 != 0) {
                    return false;
                }
            } else {
                if (d >> 6 != 0b10) {
                    return false;
                }
                cnt --;
            }
        }

        return cnt == 0;
    }
}
