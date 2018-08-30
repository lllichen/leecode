package ink.lichen.leecode;

/**
 * Created by lichen@daojia.com on 2018-8-29.
 */
public class BinaryStringSum {

    public String addBinary(String a, String b) {
        if (a == null || a.length() == 0)
        {
            return b;
        }

        if (b == null || b.length() == 0)
        {
            return a;
        }

        char[] ret = new char[(a.length()>b.length()?a.length():b.length()) + 1];

        char[] as = a.toCharArray();
        char[] bs = b.toCharArray();

        int i = as.length-1;
        int j = bs.length-1;
        int z = ret.length-1;
        boolean carry = false;
        while (i >= 0 || j >= 0){
            char tmpa;
            char tmpb;
            if (i < 0 ){
                tmpa = '0';
            }else{
                tmpa = as[i];
            }

            if (j < 0 ){
                tmpb = '0';
            }else{
                tmpb = bs[j];
            }

            if (tmpa == '0' || tmpb == '0'){
                if (carry){
                    ret[z] = '1';
                    carry = false;
                }else {
                    ret[z] = '0';
                }

            }else if (tmpa == '1' && tmpb == '1') {
                if (carry){
                    ret[z] = '1';
                    carry = true;
                }else {
                    ret[z] = '0';
                    carry = true;
                }
            }else {
                if (carry){
                    ret[z] = '0';
                    carry = true;
                }else {
                    ret[z] = '1';
                }
            }
            i --;
            j --;
            z --;
        }

        if (ret[0] == '0')
            return new String( ret ).substring( 1,ret.length );
        return new String( ret );
    }

    public static void main(String[] args) {
        String  a = "111";
        String b = "000";
        char c = '1';
        char d = '1';
        int s  = c&d;
        System.out.println(1&0);


    }

}
