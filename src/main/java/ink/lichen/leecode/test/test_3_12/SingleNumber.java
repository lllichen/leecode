package ink.lichen.leecode.test.test_3_12;

/**
 * Created by lichen@daojia.com on 2019-3-12.
 * 输入: [0,1,0,1,0,1,99]
 * 输出: 99
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int a=0,b=0;
        for (int c : nums) {
            b = b ^ c & ~ a;
            a = a ^ c & ~ b;
        }
        return b;
    }

    public static void main(String[] args) {

    }
}
