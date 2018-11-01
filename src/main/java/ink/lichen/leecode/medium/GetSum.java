package ink.lichen.leecode.medium;

/**
 * Created by lichen@daojia.com on 2018-10-31.
 *
 * 不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。
 */
public class GetSum {
    public int getSum(int a, int b) {
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }

    public static void main(String[] args) {
        GetSum getSum = new GetSum();
        System.out.println(getSum.getSum(1,2));
    }
}
