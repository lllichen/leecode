package ink.lichen.leecode.test.test_12_26;

import ink.lichen.leecode.support.Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * 1,2,8,15
 * 3,6,10,18
 */
public class Merge {


    public List<Interval> merge(List<Interval> intervals) {
        int n = intervals.size();

        int[] begin = new int[n];
        int[] end = new int[n];
        int i = 0;
        for (Interval interval : intervals){
            begin[i] = interval.start;
            end[i++] = interval.end;
            i++;
        }
        Arrays.sort(begin);
        Arrays.sort(end);
        List<Interval> res = new ArrayList<>();
        int startIdx = 0;
        int endIdx = 0;
        for (int j = startIdx+1 ; j < n; j++){
            if (begin[j]>end[endIdx]){
                Interval tmp = new Interval(begin[startIdx],end[endIdx]);
                res.add(tmp);
                startIdx = j;
            }
            endIdx++;
        }
        res.add(new Interval(begin[startIdx],end[endIdx]));
        return res;
    }


}
