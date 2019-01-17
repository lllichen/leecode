package ink.lichen.leecode.test.test_old.test_1_10;

/**
 * 1001  1001 1 100 1
 *
 */
public class IsPalindrome {


    public boolean isPalindrome(int x) {
        int a = x, r = 0;

        if (x < 0) return false;

        while (a > 0) {
            r = r*10 + a%10;
            a = a / 10;
        }

        return r == x;
    }

    public static void main(String[] args) {
        System.out.println(new IsPalindrome().isPalindrome(1001));
    }
}
