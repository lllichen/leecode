package ink.lichen.leecode.test.test_1_5;

/**
 * Created by lichen@daojia.com on 2019-1-5.
 *
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc"
 *
 */
public class ReverseWords {

    public String reverseWords(String s) {
        int n = s.length();
        if (n <= 1){
            return s;
        }
        char[] words = s.toCharArray();
        int begin = 0;
        for (int i = 0 ; i < n ; i++){
            if (words[i] == ' '){
                reverseString(words,begin,i-1);
                begin = i+1;
            }
        }
        return new String(words);
    }

    public void reverseString(char[] words, int begin,int end) {
        int left = begin , right = end;
        while (left < right){
            char t = words[left];
            words[left] = words[right];
            words[right] = t;
            left++;
            right--;
        }
    }

}
