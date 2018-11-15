package ink.lichen.leecode.tx;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-11-15.
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        result.add(new ArrayList<>());

        for (int i : nums){
            List<List<Integer>> tmp = new ArrayList<>();

            for(List temp : result){
                tmp.add(temp);
            }
            for (List temp : result){
                List tm = new ArrayList<>();
                tm.addAll(temp);
                tm.add(i);
                tmp.add(tm);
            }
            result = tmp;
        }

        return result;
    }
}
