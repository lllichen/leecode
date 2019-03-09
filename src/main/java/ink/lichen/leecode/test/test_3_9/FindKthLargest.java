package ink.lichen.leecode.test.test_3_9;

import java.util.PriorityQueue;

public class FindKthLargest {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue(k);
        for (int i = 0 ; i < k ; i++){
            queue.add(nums[i]);
        }
        for (int i = k ; i <  nums.length; i++){
            Integer val = queue.element();
            if (val < nums[i] ){
                queue.remove();
                queue.add(nums[i]);
            }
        }
        return queue.element();
    }

    public static void main(String[] args) {
        System.out.println(new FindKthLargest().findKthLargest(new int[]{3,2,1,5,6,4} , 2));
    }
}
