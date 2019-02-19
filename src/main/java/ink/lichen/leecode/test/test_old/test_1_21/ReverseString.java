package ink.lichen.leecode.test.test_old.test_1_21;

/**
 * Created by lichen@daojia.com on 2019-1-21.
 */
public class ReverseString {


    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int left = 0,right = n-1;
        while (left <right){
            char tmp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = tmp;
        }
        return new String(chars);
    }
}
