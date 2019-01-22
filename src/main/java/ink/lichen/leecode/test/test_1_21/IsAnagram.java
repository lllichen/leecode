package ink.lichen.leecode.test.test_1_21;

/**
 * Created by lichen@daojia.com on 2019-1-22.
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 */
public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        int[] ch = new int[26];
        int n = s.length();
        int m = t.length();
        if (n != m) {
            return false;
        }

        for (int i = 0; i < n; i++) {
            ch[s.charAt(i) - 'a']++;
            ch[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
