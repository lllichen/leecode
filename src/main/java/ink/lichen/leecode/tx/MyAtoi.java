package ink.lichen.leecode.tx;

/**
 * Created by lichen@daojia.com on 2018-11-12.
 */
public class MyAtoi {

    public int myAtoi(String str) {
        int res = 0;
        int n = str.length();
        if (n < 1 || ( str.charAt(0) != '-' && !Character.isDigit(str.charAt(0)) ) ){
            return res;
        }

        for (int i = 0 ; i <n ; i++){

        }

        return 121;
    }
}
