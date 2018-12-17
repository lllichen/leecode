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
        if (n == 0){
            return "";
        }
        int min = strs[0].length();
        for (String str : strs){
            if (min > str.length()){
                min = str.length();
            }
        }
        int i = 0;
        for (; i < min; i++){
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
