package ink.lichen.leecode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-9-12.
 */
public class LongestPalindrome {

    public String longestPalindrome(String s) {

        char[] chars = new char[1000];
        int max = 0;
        for (int i = 1 ;i < s.length(); i++){
            if ( ( i+1 < s.length() ) && s.charAt(i-1) == s.charAt(i+1) ) {
                System.out.println(i);
            }
        }

        return new String(chars);
    }
}
