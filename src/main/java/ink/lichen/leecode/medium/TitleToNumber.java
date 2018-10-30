package ink.lichen.leecode.medium;

/**
 * Created by lichen@daojia.com on 2018-10-30.
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 * 输入: "A"
 * 输出: 1
 */
public class TitleToNumber {

    public int titleToNumber(String s) {
        int len=s.length();
        int result=0;
        for(int i=len-1;i>=0;i--){
            result+=(s.charAt(i)-'A'+1)*Math.pow(26,len-1-i);
        }
        return result;
    }

    public static void main(String[] args) {
        TitleToNumber titleToNumber = new TitleToNumber();
        titleToNumber.titleToNumber("A");
    }
}
