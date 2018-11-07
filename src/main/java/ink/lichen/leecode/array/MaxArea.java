package ink.lichen.leecode.array;

public class MaxArea {


    public int maxArea(int[] height) {

        int max = 0;
        int n = height.length, lo = 0, hi = n - 1;
        while (lo < hi) {
            if (height[lo] < height[hi]) {
                int val = (hi - lo) * height[lo];
                if (max < val) {
                    max = val;
                }
                lo++;
            } else if (height[lo] >= height[hi]) {
                int val = (hi - lo) * height[lo];
                if (max < val) {
                    max = val;
                }
                hi--;
            }
        }
        return max;
    }
}
