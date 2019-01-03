package ink.lichen.leecode.test.test_1_3;

import java.lang.annotation.Inherited;
import java.util.Date;

/**
 * Created by lichen@daojia.com on 2019-1-3.
 */
public class MyAtoi {


    public int myAtoi(String str) {
        if (str == null || str.length() == 0)
            return 0;
        int n = str.length();
        //begin
        int i;
        //trim space
        for (i =0; i < n ;i ++){
            if (str.charAt(i) != ' '){
                break;
            }
        }
        if (i== n){
            return 0;
        }
        boolean negative = false;
        int res = 0;
        if (str.charAt(i) == '+' || str.charAt(i) == '-' || (str.charAt(i) <= '9' && str.charAt(i)>='0' )){
            if (str.charAt(i) == '-'){
                negative = true;
                i++;
            }else  if (str.charAt(i) == '+'){
                i++;
            }
            for (;i < n; i++){
                if (str.charAt(i) > '9' || str.charAt(i) < '0'){
                    if (negative){
                        return -res;
                    }else
                        return res;
                }
                if (res < Integer.MAX_VALUE/10){
                        res = (str.charAt(i)-'0')+res*10;
                }else {
                    if (res == Integer.MAX_VALUE/10 && str.charAt(i) - '0' <= Integer.MAX_VALUE % 10 ) {
                            res = (str.charAt(i) - '0') + res * 10;
                    }else {
                        if (negative){
                            return Integer.MIN_VALUE;
                        }else
                            return Integer.MAX_VALUE;
                    }
                }
            }
            if (negative){
                return -res;
            }else
                return res;
        }else{
            return 0;

        }
    }

}
