package ink.lichen.leecode.bytecode;

import ink.lichen.leecode.support.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-11-26.
 *
 *
     给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。

     按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：

     "123"
     "132"
     "213"
     "231"
     "312"
     "321"
 *
 * 输入: n = 3, k = 3
 * 输出: "213"
 *
 */
public class GetPermutation {


    private List<Integer> k = new ArrayList<>();

    public String getPermutation(int n, int k) {
        int sum = 1;
        for (int i = 1 ; i < n ; i++){
            sum*=i;
        }

        int val = k/sum;
        int t = k%sum;

        return "";
    }

}
