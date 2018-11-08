package ink.lichen.leecode.array;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FindKthLargest {

    private static  final int CUTOFF = 10;

    public int findKthLargest(int[] nums, int k) {
        int n = nums.length,left = 0,right = n-1;
        if (n <2){
            return n;
        }
        return quickSelect(nums,left,right,k);
    }

    private int quickSelect(int[] nums,int left,int right,int k){
        if (left + CUTOFF <= right){
            int pivot = median3(nums,left,right);
        }
    }

    private int median3(int[] nums,int left,int right){
        int center = (left + right)/2;
        if (nums[center] < nums[left]){

        }
        if (nums[right] < nums[left]){

        }
        if (nums[right] < nums[center]){

        }
    }

    private void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int[] val = new int []{3,2,1,5,6,4};
        FindKthLargest findKthLargest = new FindKthLargest();
        findKthLargest.findKthLargest(val,2);
    }


}
