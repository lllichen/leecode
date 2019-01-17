package ink.lichen.leecode.test.test_old.test_12_26;

/**
 * Created by lichen@daojia.com on 2018-12-26.
 */
public class Trap {


    public int trap(int[] height) {
        int n = height.length, left = 0, right = n - 1, area = 0;
        int leftH = 0, rightH = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (leftH <= height[left]) leftH = height[left];
                else area += leftH - height[left];
                left++;
            }else {
                if (rightH <= height[right]) rightH = height[right];
                else area += rightH - height[right];
                right--;
            }
        }
        return area;
    }

}
