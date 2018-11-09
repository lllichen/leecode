package ink.lichen.leecode.array;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FindKthLargest {


//    public int findKthLargest(int[] nums, int k) {
//        int n = nums.length;
//        int j;
//        for (int i = 1;i < n ; i++ ){
//            int temp = nums[i];
//            for (j = i; j > 0 && temp< nums[j-1]; j--){
//                nums[j] = nums[j-1];
//            }
//            nums[j] = temp;
//        }
//
//        return nums[n-k];
//    }

    private static  final int CUTOFF = 10;

    public int findKthLargest(int[] nums, int k) {
        int n = nums.length,left = 0,right = n-1;
        if (n <2){
            return n;
        }
        quickSelect(nums,left,right,k);
        return nums[k-1];
    }

    private void quickSelect(int[] nums,int left,int right,int k){
        if (left + CUTOFF <= right){
            int pivot = median3(nums,left,right);
            int i = left,j = right-1;
            for (;;){
                while (nums[++i] > pivot){}
                while (nums[--j] < pivot){}
                if (i<j)
                    swap(nums,i,j);
                else
                    break;
            }

            swap(nums,i,right-1);
            if (k <= i)
                quickSelect(nums,left,i-1,k);
            else if (k > i+1)
                quickSelect(nums, i+1,right,k);
        }else {
            insertionSort(nums,left,right);
        }
    }

    private void insertionSort(int[] nums, int left, int right){
        int j;
        for (int i = left+1; i <=right; i++ ){
            int temp = nums[i];
            for (j = i;j>0 && temp>nums[j-1];j--){
                nums[j] = nums[j-1];
            }
            nums[j] = temp;
        }
    }


    private int median3(int[] nums,int left,int right){
        int center = (left + right)/2;
        if (nums[center] > nums[left]){
            swap(nums,center,left);
        }
        if (nums[right] > nums[left]){
            swap(nums,right,left);
        }
        if (nums[right] > nums[center]){
            swap(nums,right,center);
        }
        swap(nums,center,right-1);
        return nums[right-1];
    }

    private final void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int[] val = new int []{3,2,1,5,6,4,9,10,20,18,17,15,13};
        FindKthLargest findKthLargest = new FindKthLargest();
        System.out.println(findKthLargest.findKthLargest(val,2));
    }


}
