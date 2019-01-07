package ink.lichen.leecode.test.test_1_6;

public class Merge {


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m + n;
        if ( n < 0){
            return;
        }
        int right1 = m-1;
        int right2 = n-1;
        int right = p-1;
        while (right1 >=0 && right2 >=0){
            if (nums1[right1] > nums2[right2]){
                nums1[right--] = nums1[right1--];
            }else{
                nums1[right--] = nums2[right2--];
            }
        }
        while (right1 >=0){
            nums1[right--] = nums2[right2--];
        }

    }
}
