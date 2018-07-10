package ink.lichen.leecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lichen@daojia.com on 2018-7-10.
 */
public class TwoAdd {


    public int[] twoSum(int[] nums, int target) {

        int[] ret = new int[2];

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if (map.containsKey( complement )){
                return new int[] {i,map.get( complement )};
            }
            map.put( nums[i],i );
        }

        return ret;
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        List<Integer> list = new ArrayList<Integer>(  );

        List<Integer> list2 = new ArrayList<Integer>(  );

        List<Integer> retList = new ArrayList<Integer>( );

        while(l1.next != null){
            list.add( l1.val );
            l1 = l1.next;
        }

        while(l2.next != null){
            list2.add( l2.val );
            l2 = l2.next;
        }


        int rem = 0;
        int div = 0;


        for (int i = list2.size() ; i < list2.size() ; i--) {


        }

//        for ( int i = 0; )

//        return ret;
        return null;
    }



}


