package ink.lichen.leecode.test.test_old.test_1_21;

/**
 * Created by lichen@daojia.com on 2019-1-21.
 *
 *给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * s = "leetcode"
 * 返回 0.
 *
 * s = "loveleetcode",
 * 返回 2.
 */
public class FirstUniqChar {

    public int firstUniqChar(String s) {
        int[] temp = new int[26];
        for (int i = 0 ; i < s.length(); i ++){
            temp[s.charAt(i)-'a']++;
        }
        for (int i = 0 ; i < s.length(); i ++){
            if (temp[s.charAt(i)-'a']==1)
                return i;
        }
        return -1;
    }
}
