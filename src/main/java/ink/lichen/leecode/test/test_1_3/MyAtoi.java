package ink.lichen.leecode.test.test_1_3;

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
        for (i =0; i <= n ;i ++){
            if (str.charAt(i) == ' '){
                i++;
            }else {
                break;
            }
        }



        return 10;
    }
}
