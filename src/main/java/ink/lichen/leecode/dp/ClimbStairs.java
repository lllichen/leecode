package ink.lichen.leecode.dp;

/**
 * Created by lichen@daojia.com on 2018-12-10.
 */
public class ClimbStairs {

    public int climbStairs(int n) {
        if (n == 0 || n == 1 || n ==2 ){
            return n;
        }
        int one = 1;
        int two = 2;
        for(int z = 3 ; z <=n; z++  ){
            int next = one + two;
            one = two;
            two = next;
        }
        return two;
    }
}
