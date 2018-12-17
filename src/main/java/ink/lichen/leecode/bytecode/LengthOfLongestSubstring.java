package ink.lichen.leecode.bytecode;

/**
 * Created by lichen@daojia.com on 2018-11-23.
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * i = 0; j = 0; ans = 1; index['a'] = 1;
 * i = 0; j = 1; ans = 2; index['b'] = 2;
 * i = 0; j = 2; ans = 3; index['c'] = 3;
 * i = 1; j = 3; ans = 3; index['a'] = 4;
 * i = 2; j = 4; ans = 3; index['b'] = 5;
 * i = 3; j = 5; ans = 3; index['c'] = 6;
 * i = 5; j = 6; ans = 3; index['b'] = 7;
 * i = 6; j = 7; ans = 3; index['b'] = 8;
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
