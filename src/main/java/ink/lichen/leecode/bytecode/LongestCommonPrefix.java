package ink.lichen.leecode.bytecode;

/**
 * Created by lichen@daojia.com on 2018-11-23.
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        int n = strs.length;
        if (n==0){
            return "";
        }
        if (n == 1){
            return strs[0];
        }

        int min = Integer.MAX_VALUE;
        for (String temp : strs){
            if (temp.length()<min){
                min = temp.length();
            }
            if (min == 0){
                return "";
            }
            if (min == 1){
                return temp;
            }
        }

        int i = 0;

        while (i<min){
            char val = strs[0].charAt(i);
            for (int j = 1 ; j < n; j++ ){
                if(strs[j].charAt(i) != val){
                    return strs[0].substring(0,i);
                }
            }
            i++;
        }
        if (i == min){
            return strs[0].substring(0,i);
        }
        return "";
    }
}
