package ink.lichen.leecode.bytecode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lichen@daojia.com on 2018-11-23.
 */
public class LengthOfLongestSubstring {



    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128];
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println((int)'A');
        System.out.println((int)'Z');

        System.out.println((int)'a');
        System.out.println((int)'z');
    }

}
