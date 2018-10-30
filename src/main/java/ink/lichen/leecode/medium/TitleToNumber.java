package ink.lichen.leecode.medium;

/**
 * Created by lichen@daojia.com on 2018-10-30.
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 * 输入: "A"
 * 输出: 1
 */
public class TitleToNumber {

    public int titleToNumber(String s) {
        //s中字符个数
        int len=s.length();
        //保存最终结果
        int result=0;
        //从个位数开始累加计算
        for(int i=len-1;i>=0;i--){
            //Math.pow(a,b)是计算a的b次幂，这里底数是26
            result+=(s.charAt(i)-'A'+1)*Math.pow(26,len-1-i);
        }
        return result;
    }

    public static void main(String[] args) {
        TitleToNumber titleToNumber = new TitleToNumber();
        titleToNumber.titleToNumber("A");
    }
}
