package ink.lichen.leecode.test.test_1_3;

import java.util.concurrent.Executors;

/**
 * Created by lichen@daojia.com on 2019-1-3.
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 */
public class LongestCommonPrefix {


    public String longestCommonPrefix(String[] strs) {
        String res = "";
        int n = strs.length;
        if ( n == 0) {
            return res;
        }
        if (n == 1){
            return strs[0];
        }
        int min = 0;
        for (int i = 0 ; i < n ; i++){
            if (strs.length < min){
                min = strs.length;
            }
        }
        if (min == 0){
            return res;
        }

        String temp = strs[0];
        for (int i = 0 ; i < min; i++)
        {
            temp.charAt(i);
            for (int j = 1 ; j < n; j++){
                if (strs[j].charAt(i) != temp.charAt(i)){
                    return temp.substring(0,i);
                }
            }
        }
        return res;
    }

}
