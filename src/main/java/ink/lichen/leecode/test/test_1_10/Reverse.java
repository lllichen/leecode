package ink.lichen.leecode.test.test_1_10;


/**
 * 输入: 123
 * 输出: 321
 */
public class Reverse {


    public int reverse(int x) {
        int val = 0;
        while (x / 10 != 0){
            int t = x %10;
            val = val * 10 + t;
            x = x/10;
        }
        if (val < Integer.MAX_VALUE/10 && val > Integer.MIN_VALUE /10 ){
            val= val*10 +x;
            return val;
        }else if (val == Integer.MAX_VALUE/10 || val == Integer.MIN_VALUE /10){
            if (x <= Integer.MAX_VALUE%10 && x >= Integer.MIN_VALUE % 10 ){
                val= val*10 +x;
                return val;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        System.out.println(reverse.reverse(9000000));
    }
}
