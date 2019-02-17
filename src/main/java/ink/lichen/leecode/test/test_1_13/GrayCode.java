package ink.lichen.leecode.test.test_1_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GrayCode {


    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList();
        for (int i = 0; i < 1 << n; i++){
            System.out.println(Integer.toBinaryString(i));
            System.out.println(Integer.toBinaryString( i >> 1));
            System.out.println(Integer.toBinaryString(i ^ i >> 1));
            System.out.println();
            res.add(i ^ i >> 1);
        }
        return res;
    }

    public static void main(String[] args) {
        new GrayCode().grayCode(3);
//        System.out.println(Integer.toBinaryString(8));
//        System.out.println(1<<3);
        System.out.println(1^1);
    }
}
