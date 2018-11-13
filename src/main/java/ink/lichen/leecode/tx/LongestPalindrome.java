package ink.lichen.leecode.tx;

/**
 * Created by lichen@daojia.com on 2018-11-12.
 */
public class LongestPalindrome {

    private String res = "";

    public String longestPalindrome(String s) {
       if (s == null || s.length() == 0){
           return s;
       }
       for (int i = 0 ; i < s.length(); i++){
           help(s,i,i);
           help(s,i,i+1);
       }
       return res;
    }

    private void help(String s,int left, int right){
        while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        String cur = s.substring(left+1,right);
        if (cur.length()> res.length()){
            res = cur;
        }
    }



}
