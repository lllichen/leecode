package ink.lichen.leecode.medium;

/**
 * Created by lichen@daojia.com on 2018-9-12.
 */
public class IncreasingTriplet {

    public boolean increasingTriplet(int[] nums) {

        int m1 =Integer.MAX_VALUE;
        int m2 = Integer.MAX_VALUE;

        for (int a : nums)
        {
            if (m1 >= a){
                m1 =a;
            }
            else if (m2 >= a) m2 = a;
            else return true;
        }
        return false;
    }
}
