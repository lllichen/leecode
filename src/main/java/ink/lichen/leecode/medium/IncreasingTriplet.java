package ink.lichen.leecode.medium;

/**
 * Created by lichen@daojia.com on 2018-9-12.
 */
public class IncreasingTriplet {

    public boolean increasingTriplet(int[] nums) {

        if (nums.length< 3){
            return false;
        }

       int first = Integer.MAX_VALUE;
       int second = Integer.MAX_VALUE;

       for (int num : nums){
           if (first> num){
               first = num;
           }else if ( num > first && num < second ){
               second = num;
           }else if (num > second){
               return true;
           }
       }
       return false;
    }
}
