package ink.lichen.leecode.test.test_1_3;

/**
 * Created by lichen@daojia.com on 2019-1-3.
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 */
public class LongestPalindrome {

    public String longestPalindrome(String s) {
//        String res = "";
//        int n = s.length();
//        if ( n == 0){
//            return res;
//        }
//        for (int i = 0 ; i < n ; i++ ){
//
//        }
//
//        return "";

        int n=s.length();
        boolean[][] pal=new boolean[n][n];
        //pal[i][j] 表示s[i...j]是否是回文串
//        int maxLen=0;
        String res = "";
        for (int i=0;i<n;i++){  // i作为终点
            int j=i;    //j作为起点
            while (j>=0){
                if (s.charAt(j)==s.charAt(i)&&(i-j<2||pal[j+1][i-1])){
                    pal[j][i]=true;
                    if (res.length() < i-j + 1){
                         res = s.substring(j,i+1);
                    }
                }
                j--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        System.out.println(longestPalindrome.longestPalindrome("abaca1ba"));
    }
}
