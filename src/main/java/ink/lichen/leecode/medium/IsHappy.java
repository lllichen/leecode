package ink.lichen.leecode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lichen@daojia.com on 2018-10-30.
 * 输入: 19
 * 输出: true
 * 解释:
 * 1*1 + 9*9 = 82
 * 8*8 + 2*2 = 68
 * 6*6 + 8*8 = 100
 * 1*1 + 0*0 + 0*0 = 1
 */
public class IsHappy {


    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while(n!=1){
            int sum = 0;
            while(n>0){
                sum += (n % 10) * (n % 10);
                n = n / 10;
            }
            if(set.contains(sum)){
                return false;
            } else {
                set.add(sum);
            }
            n = sum;
        }
        return true;
    }
}
