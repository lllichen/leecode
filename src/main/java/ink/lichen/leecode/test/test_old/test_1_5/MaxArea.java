package ink.lichen.leecode.test.test_old.test_1_5;

/**
 * Created by lichen@daojia.com on 2019-1-5.
 *
 * 输入: [1,8,6,2,5,4,8,3,7]
 * 输出: 49
 */
public class MaxArea {

    public int maxArea(int[] height) {
        int n = height.length;
        if ( n <= 1){
            return 0;
        }

        int leftHeight = 0,rightHeight = 0;
        int left = 0, right = n-1;
        int max = 0;
        int area = 0;
        while (left < right){
            leftHeight = leftHeight < height[left]? height[left]:leftHeight;
            rightHeight = rightHeight < height[right]? height[right]:rightHeight;
            if (height[left] <= rightHeight){
                area = height[left] * (right-left);
                if (max < area){
                    max = area;
                }
                left++;
            }
            if (height[right]< leftHeight){
                area = height[right] * (right-left);
                if (max < area){
                    max = area;
                }
                right--;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        MaxArea maxArea = new MaxArea();
        maxArea.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
    }
}
