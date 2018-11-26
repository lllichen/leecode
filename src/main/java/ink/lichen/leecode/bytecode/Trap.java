package ink.lichen.leecode.bytecode;

public class Trap {


    public int trap(int[] height) {
        int n = height.length;
        if (n <= 1){
            return n;
        }
        int left = 0;
        int right = n -1;
        int leftMax= 0;
        int rightMax = 0;
        int res = 0;
        while (left < right){
            if (height[left] < height[right]){
                leftMax = Math.max(height[left],leftMax);
                res += leftMax - height[left];
                left++;
            }else {
                rightMax = Math.max(height[right],rightMax);
                res += rightMax - height[right];
                right--;
            }
        }

        return res;
    }


}
