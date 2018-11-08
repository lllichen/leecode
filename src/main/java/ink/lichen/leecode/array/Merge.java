package ink.lichen.leecode.array;

/**
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 */
public class Merge {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

//        int idx_1 = m-1;
//        int idx_2 = n-1;
//
//        for (int i= m+n-1 ; i >=0 ;i--){
//            if ( idx_2 < 0){
//                if (idx_1 < 0){
//                    nums1[i] = nums2[idx_2];
//                    idx_2--;
//                }else{
//                    nums1[i] = nums1[idx_1];
//                    idx_1--;
//                }
//            }else{
//                if (nums1[idx_1]>nums2[idx_2]){
//                    nums1[i] = nums1[idx_1];
//                    idx_1--;
//                }else {
//                    nums1[i] = nums2[idx_2];
//                    idx_2--;
//                }
//            }
//        }

    }

    public static void main(String[] args) {
        Merge merge = new Merge();
        merge.merge(new int[]{0},0,new int[]{1},1);
    }
}
