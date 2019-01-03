package ink.lichen.leecode.test.test_1_3;

/**
 * Created by lichen@daojia.com on 2019-1-3.
 */
public class FindMedianSortedArrays {


    public double findMedianSortedArrays(int[] A, int[] B) {
        int MIN_VALUE = 0x80000000;
        int MAX_VALUE = 0x7fffffff;

        int N1 = A.length;
        int N2 = B.length;
        if (N1 > N2){
            return findMedianSortedArrays(B,A);
        }

        if (N1 == 0){
            return ((double) B[(N2-1)/2] + (double) B[N2/2] ) /2;
        }
        int size = N1 + N2;

        int cutL = 0, cutR = N1;
        int cut1 = N1/2;
        int cut2 = size/2 - cut1;

        while (cut1 <= N1) {
            cut1 = (cutR - cutL) / 2 + cutL;
            cut2 = size / 2 - cut1;

            double L1 = (cut1 == 0) ? MIN_VALUE : A[cut1 - 1];
            double L2 = (cut2 == 0) ? MIN_VALUE : B[cut2 - 1];
            double R1 = (cut1 == N1) ? MAX_VALUE : A[cut1];
            double R2 = (cut2 == N2) ? MAX_VALUE : B[cut2];

            if (L1 > R2){
                cutR = cut1 - 1;
            }else if (L2 > R1){
                cutL = cut1 + 1;
            }else {
                if (size%2 == 0){
                    L1 = (L1 > L2 ? L1 : L2);
                    R1 = (R1 < R2 ? R1 : R2);
                    return (L1 + R1)/2;
                }else {
                    R1 = (R1 < R2? R1: R2);
                    return R1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FindMedianSortedArrays findMedianSortedArrays = new FindMedianSortedArrays();
        double val = findMedianSortedArrays.findMedianSortedArrays(new int[]{1,2,2,2,3,3,4,5,6,7,8,9,10},new int[]{2,3,4,5,6,7});
        System.out.println(val);
    }
}
