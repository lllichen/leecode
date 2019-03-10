package ink.lichen.leecode.test.test_3_10;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxSlidingWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0){
            return new int[]{};
        }
        int [] result = new int[n-k+1];
        PriorityQueue<Integer> queue = new PriorityQueue<>(k,Comparator.reverseOrder());
        for(int i = 0 ; i < k ; i++){
            queue.add(nums[i]);
        }
        for (int i = k;i < n ; i++){
            result[i-k] = queue.peek();
            queue.add(nums[i]);
        }
        result[n-k] = queue.peek();
        return result;
    }

    public static void main(String[] args) {
        new MaxSlidingWindow().maxSlidingWindow(new int[]{1,-1},1);
    }
}
