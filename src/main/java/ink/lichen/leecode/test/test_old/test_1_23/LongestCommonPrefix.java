package ink.lichen.leecode.test.test_old.test_1_23;

/**
 * Created by lichen@daojia.com on 2019-1-23.
 */
public class LongestCommonPrefix {


    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n == 0){
            return "";
        }
        int min = strs[0].length();
        for (String str : strs){
            if (min > str.length()){
                min = str.length();
            }
        }
        int i;
        for (i = 0; i < min; i++){
            char t = strs[0].charAt(i);
            for (int j = 1; j < n; j++){
                if (t != strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0].substring(0,i);
    }
}
