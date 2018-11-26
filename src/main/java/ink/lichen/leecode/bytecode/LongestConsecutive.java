package ink.lichen.leecode.bytecode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lichen@daojia.com on 2018-11-26.
 * 给定一个未排序的整数数组，找出最长连续序列的长度。
 * 要求算法的时间复杂度为 O(n)。
 */
public class LongestConsecutive {


    public int longestConsecutive(int[] nums) {

        int maxlen = 0;
        Set<Integer> set = new HashSet<Integer>();
        // 先将所有数字加入数组中
        for(int n : nums){
            set.add(n);
        }
        // 对于每个数我们都在集合中一一检查它的上下边界
        for(int n : nums){
            // 暂存n，供检查下边界时使用
            int curr = n, len = 0;
            // 一个一个检查上边界
            while(set.contains(curr)){
                len++;
                set.remove(curr++);
            }
            // 一个一个检查下边界
            curr = n - 1;
            while(set.contains(curr)){
                set.remove(curr--);
                len++;

            }
            maxlen = Math.max(len, maxlen);
        }
        return maxlen;
    }

    public static void main(String[] args) {
        LongestConsecutive longestConsecutive = new LongestConsecutive();
        System.out.println(longestConsecutive.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}
