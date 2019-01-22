package ink.lichen.leecode.test.test_1_22;

/**
 * Created by lichen@daojia.com on 2019-1-22.
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写
 */
public class IsPalindrome {

    public boolean isPalindrome(String s) {
        int n =s.length();
        if (n == 0){
            return true;
        }
        if (n == 1){
            return false;
        }
        s = s.toLowerCase();
        int i = 0 ,j = s.length()-1;
        while (i < j){
            while (i<= j && !isValid(s.charAt(i))){
                i++;
            }
            while (j>=i && !isValid(s.charAt(j))){
                j--;
            }
            System.out.println(s.charAt(i)+":"+s.charAt(j));
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private boolean isValid(char c){
        if ( c >='0' && c <= '9'){
            return true;
        }
        if ( c >='a' && c <= 'z'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        new IsPalindrome().isPalindrome("A man, a plan, a canal: Panama");
    }
}
