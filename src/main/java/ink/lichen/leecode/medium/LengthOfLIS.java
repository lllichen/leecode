package ink.lichen.leecode.medium;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by lichen@daojia.com on 2018-10-29.
 */
public class LengthOfLIS {

    public int lengthOfLIS(int[] nums) {

        return 0;
    }

    public static void main(String[] args) {
        ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap();
        Collection collection = map.values();
        map.put(1,1);
        System.out.println(collection.size());
        map.put(2,3);
        System.out.println(collection.size());
    }
}
