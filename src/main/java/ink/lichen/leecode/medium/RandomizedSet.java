package ink.lichen.leecode.medium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RandomizedSet {

    Set<Integer> set;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        set = new HashSet<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        return set.add(val);
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        return set.remove(val);
    }

    /** Get a random element from the set. */
    public int getRandom() {
        if (set.size() > 0){
            Integer[] obj =set.toArray(new Integer[set.size()]);
            return obj[(int)(Math.random()*obj.length)];
        }
        return -1;
    }
}
