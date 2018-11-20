package ink.lichen.leecode.tx;

/**
 * Created by lichen@daojia.com on 2018-11-20.
 */
public class ReverseWords {

    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int n = s.length();
        int mark = 0;
        int cur = 0;
        while (cur < n){
            if (cur == ' '){
                mark = cur;
            }
            reverseString()
        }

        return "";
    }

    public void reverseString(char[] chars,int left, int right) {
        for (int i = 0,j = chars.length-1 ; i < chars.length; i++,j--){
            if (i >= j ){
                break;
            }
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
        }
    }
}
