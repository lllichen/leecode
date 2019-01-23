package ink.lichen.leecode.test.test_1_23;

/**
 * Created by lichen@daojia.com on 2019-1-23.
 */
public class StrStr {


    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if (m > n){
            return -1;
        }

        for (int i = 0 ; i < n; i++){
            if (haystack.charAt(i) == needle.charAt(0)){
                int j;
                for (j = 1 ; i+j < n && j < m ; j++){
                    if (haystack.charAt(i+j) == needle.charAt(j)){
                        break;
                    }
                }
                return i+j;
            }
        }
        return haystack.indexOf(needle);
    }

}
