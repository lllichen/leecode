package ink.lichen.leecode.tx;

import java.util.Stack;

/**
 * Created by lichen@daojia.com on 2018-11-19.
 */
public class IsPalindrome {


    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        if (x < 10){
            return true;
        }

        int a = x,h=1;
        while (a/10 >= 10){
            h = h*10;
        }
        while (a > 0){
            if (a/h != a % 10) return false;
            a = a % h;
            a = a / 10;
            h = h / 100;
        }
        return true;
    }
}
