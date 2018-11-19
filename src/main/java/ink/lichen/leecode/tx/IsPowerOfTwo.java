package ink.lichen.leecode.tx;

/**
 * Created by lichen@daojia.com on 2018-11-19.
 */
public class IsPowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        return n>0 && (n&n-1)==0;
    }
}
