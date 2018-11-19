package ink.lichen.leecode.tx;

/**
 * Created by lichen@daojia.com on 2018-11-19.
 *
 * 输入: 123
 * 输出: 321
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。
 * 请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 */
public class Reverse {

    public int reverse(int x) {

        int val = 0;
        int min = Integer.MIN_VALUE/10;
        int max = Integer.MAX_VALUE/10;
        while (x != 0){
            if (val> max || val < min){
                return 0;
            }
            val = val * 10 + x%10;
            x = x/10;
        }
        return val;
    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        System.out.println(reverse.reverse(123));
    }
}
