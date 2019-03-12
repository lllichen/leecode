package ink.lichen.leecode.test.test_old.test_2_19;

/**
 * Created by lichen@daojia.com on 2019-2-19.
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 */
public class LengthOfLongestSubstring {


    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        if ( n <= 1){
            return n;
        }
        int[] vals = new int[26];
        for (int i = 0 ; i < n ; i++){
            s.charAt(i);
        }

        return 0;
    }
}
