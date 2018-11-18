package ink.lichen.leecode.tx;

public class FindKthLargest {


    public int findKthLargest(int[] nums, int k) {
        int n = nums.length, left = 0, right = n-1;
        if (n <2){
            return n;
        }

        return nums[k-1];
    }

    private static final int CUTOFF = 10;

    private void quickSelect( int[] nums,int left, int right, int k){
        if (left + CUTOFF <= right){

        }else{
            insertionSort(nums, left, right);
        }
    }

    private void insertionSort(int[] nums, int left, int right){
        int j ;
        for (int i = left;i <= right; i++){
            int temp = nums[i];
            for ( j = left+1; j > left && nums[j-1] < temp ; j--){
                nums[j] = nums[j-1];
            }
            nums[j] = temp;
        }
    }


}
