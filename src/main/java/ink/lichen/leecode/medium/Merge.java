package ink.lichen.leecode.medium;

import ink.lichen.leecode.support.Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-10-25.
 */
public class Merge {


    public List<Interval> merge(List<Interval> intervals) {
        // sort start&end
        int n = intervals.size();
        int[] starts = new int[n];
        int[] ends = new int[n];
        for (int i = 0; i < n; i++) {
            starts[i] = intervals.get(i).start;
            ends[i] = intervals.get(i).end;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        // loop through
        List<Interval> res = new ArrayList<Interval>();
        for (int i = 0, j = 0; i < n; i++) { // j is start of interval.
            if (i == n - 1 || starts[i + 1] > ends[i]) {
                res.add(new Interval(starts[j], ends[i]));
                j = i + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<Interval> list = new ArrayList();
//        list.add(new Interval(1,3));
//        list.add(new Interval(2,6));
//        list.add(new Interval(8,10));
//        list.add(new Interval(15,18));
        list.add(new Interval(1,4));
//        list.add(new Interval(4,5));
        Merge merge = new Merge();
        merge.merge(list);
    }
}
