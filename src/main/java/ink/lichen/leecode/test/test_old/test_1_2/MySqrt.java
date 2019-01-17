package ink.lichen.leecode.test.test_old.test_1_2;

/**
 * Created by lichen@daojia.com on 2019-1-2.
 */
public class MySqrt {

    public int mySqrt(int x) {
        if (x <= 1) return x;
        int left = 0, right = x;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (x / mid >= mid) left = mid + 1;
            else right = mid;
        }
        return right - 1;
    }

    public static void main(String[] args) {
        MySqrt mySqrt = new MySqrt();
        System.out.println(mySqrt.mySqrt(10));
    }
}
