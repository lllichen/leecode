package ink.lichen.leecode.array;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FindKthLargest {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int n = nums.length;
        for (int i = 0 ; i < k ; i++){
            queue.add(nums[i]);
        }

        for (int i = k ; i < n; i++ ){
            int val = queue.element();
            if (val < nums[k]){
                queue.remove();
                queue.add(val);
            }
        }
        return queue.element();
    }

    public static void main(String[] args) {
        int[] val = new int []{3,2,1,5,6,4};
        FindKthLargest findKthLargest = new FindKthLargest();
        findKthLargest.findKthLargest(val,2);
    }

//
//    public int findKthLargest(int[] nums, int k) {
//        int n = nums.length;
//        int index = quickSort(nums,0,n-1,k);
//        return nums[index];
//    }
//
//    private int quickSort(int[] nums, int left, int right, int k){
//        if (left >= k){
//            return left;
//        }
//        int p = partition(nums,left,right);
//        if (p+1 == k){
//            return p;
//        }
//        if (p + 1 > k){
//            return quickSort(nums,left,p-1,k);
//        }else {
//            return quickSort(nums,p+1,right,k);
//        }
//    }
//
//    private int partition(int[] nums,int left, int right){
//        int v = nums[left];
//        int j = left;
//        int i = left+1;
//        while (i <= right){
//            if (nums[i] >= v){
//                int temp = nums[i];
//                nums[i] = nums[j+1];
//                nums[j+1] = temp;
//            }
//            i += 1;
//        }
//        int temp = nums[left];
//        nums[left] = nums[j];
//        nums[j] = temp;
//        return j;
//    }
}
