package ink.lichen.leecode.test.test_1_10;

/**
 * 1001  100 0 100 1
 *
 */
public class IsPalindrome {


    public boolean isPalindrome(int x) {

        if (x < 0){
            return false;
        }
        if (x < 10){
            return true;
        }
        int val = 0;
        int pre = 0;
        while (x /10 != 0){
            int t = x % 10;
            pre = val;
            val = val * 10 + t;
            if (val == x){
                return true;
            }
            x = x / 10;
            if (pre == x || val == x){
                return true;
            }
        }
        if (val == x){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new IsPalindrome().isPalindrome(101));
    }
}
