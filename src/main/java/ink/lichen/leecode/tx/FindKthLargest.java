package ink.lichen.leecode.tx;

public class FindKthLargest {


    public int findKthLargest(int[] nums, int k) {
        int n = nums.length, left = 0, right = n-1;
        if (n <2){
            return n;
        }
        quickSelect(nums,left,right,k);
        return nums[k-1];
    }

    private static final int CUTOFF = 10;

    private void quickSelect( int[] nums,int left, int right, int k){
        if (left + CUTOFF <= right){
            int pivot = median3(nums,left,right);
            int i = left,j = right-1;
            for (;;){
                while (nums[++i] > pivot){};
                while (nums[--j] < pivot){};
                if (i < j){
                    swap(nums,i,j);
                }else
                    break;
            }
            swap(nums,i,right-1);
            if ( k <= i){
                quickSelect(nums,left,i-1,k);
            }else if (k > i+1)
                quickSelect(nums,i+1,right,k);

        }else{
            insertionSort(nums, left, right);
        }
    }


    private void insertionSort(int[] nums, int left, int right){
        int j ;
        for (int i = left+1;i <= right; i++){
            int temp = nums[i];
            for ( j = i; j > left && nums[j-1] < temp ; j--){
                nums[j] = nums[j-1];
            }
            nums[j] = temp;
        }
    }


    private int median3(int[] nums, int left,int right){

        int mid = (left + right) >> 1;
        if (nums[mid] > nums[left] ){
            swap(nums,mid,left);
        }
        if ( nums[right] > nums[left] ){
            swap(nums,right,left);
        }

        if (nums[right] > nums[mid] ){
            swap(nums,right,mid);
        }
        swap(nums,mid,right-1);
        return nums[right-1];
    }

    private void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }




}
