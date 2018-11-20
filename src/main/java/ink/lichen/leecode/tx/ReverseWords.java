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
            if (chars[cur] == ' '){
                reverseChar(chars,mark,cur-1);
                mark = cur+1;
            }
            cur++;
        }
        reverseChar(chars,mark,cur-1);
        return new String(chars);
    }

    public void reverseChar(char[] chars, int left, int right) {
        for (int i = left,j = right ; i <= right; i++,j--){
            if (i >= j ){
                break;
            }
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
        }
    }

    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();
        System.out.println(reverseWords.reverseWords("Let's take LeetCode contest"));
    }
}
