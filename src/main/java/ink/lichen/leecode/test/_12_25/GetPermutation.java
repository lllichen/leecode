package ink.lichen.leecode.test._12_25;

/**
 * Created by lichen@daojia.com on 2018-11-26.
 *
 *
     给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。

     按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：

 *   "123"
 *   "132"
 *
 *   "213"
 *   "231"
 *
 *   "312"
 *   "321"
 *
 * 输入: n = 3, k = 3
 * 输出: "213"
 *
 * 1*2*3=6
 *  2 = 6/(3-0)
 *  chose = 3/2 = 1
 *  k =
 *  1 = 2/(3-1)
 */
public class GetPermutation {

    public String getPermutation(int n, int k) {
        int[] res = new int[n];
        int perNumCount = 1;
        for (int i = 0 ; i < n ; i++){
            res[i] = i+1;
            perNumCount *= res[i];
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < n ; i ++){
            perNumCount = perNumCount/(n - i);
            int chose = k / perNumCount;
            sb.append(res [chose]);
            for(int j = chose; i < n-i-1; i++){
                res[j] = res[j+1];
            }
            k = k % perNumCount;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
//        GetPermutation getPermutation = new GetPermutation();
//        System.out.println(getPermutation.getPermutation(3,3));
        System.out.println(6%3);
    }

}
