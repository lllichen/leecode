package ink.lichen.leecode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-9-12.
 */
public class LongestPalindrome {

    public String longestPalindrome(String s) {

        if (s == null || s.length() < 2)
            return s;

        // 添加头^尾$两个不同的字符用于消除边界判断
        String temp = "^" + s + "$";

        int c = 0, r = 0, len = s.length() * 2 + 1 + 2, centerIndex = 0, maxLen = 0;
        int[] p = new int[len];

        for (int i = 1; i < len - 1; i++) {
            int iMirror = 2 * c - i;

            p[i] = r > i ? Math.min(r - i, p[iMirror]) : 0;

            // 基于当前点为中心扩展寻找回文
            int left = i - 1 - p[i];
            int right = i + 1 + p[i];
            while (temp.charAt(left / 2) == temp.charAt((right - 1) / 2)) {
                p[i]++;
                left--;
                right++;
            }

            // 如果扩展后的右边界值大于当前右边界值则更新
            if (i + p[i] > r) {
                c = i;
                r = i + p[i];
            }

            // 寻找最大值与中心点
            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }

        int beginIndex = (centerIndex - 1 - maxLen) / 2;

        return s.substring(beginIndex, beginIndex + maxLen);
    }
}
