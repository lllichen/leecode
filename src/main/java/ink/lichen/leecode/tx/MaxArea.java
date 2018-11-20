package ink.lichen.leecode.tx;

/**
 * Created by lichen@daojia.com on 2018-11-20.
 * 输入: [1,8,6,2,5,4,8,3,7]
 * 输出: 49
 *
 */
public class MaxArea {

    public int maxArea(int[] height) {
        int max = 0;
        int cur;
        int n = height.length,lo = 0,hi = n-1;
        while (lo <hi){
            if (height[lo] >= height[hi]){
                cur = height[hi]*(hi-lo);
                hi--;
            }else {
                cur = height[lo]*(hi-lo);
                lo++;
            }
            if (cur > max){
                max = cur;
            }
        }
        return max;
    }
}
