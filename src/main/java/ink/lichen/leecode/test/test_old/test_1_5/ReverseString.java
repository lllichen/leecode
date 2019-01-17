package ink.lichen.leecode.test.test_old.test_1_5;

/**
 * Created by lichen@daojia.com on 2019-1-5.
 *
 * 输入: "hello"
 * 输出: "olleh"
 *
 */
public class ReverseString {


    public String reverseString(String s) {
        int n = s.length();
        if (n <= 1){
            return s;
        }
        char[] chars = s.toCharArray();
        int left = 0 , right = n-1;
        while (left < right){
            char t = chars[left];
            chars[left] = chars[right];
            chars[right] = t;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverseString("hello"));
    }
}
