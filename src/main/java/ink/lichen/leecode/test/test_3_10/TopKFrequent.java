package ink.lichen.leecode.test.test_3_10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {


    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        for(int val: nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        for (Map.Entry entry : map.entrySet()){
            queue.add(entry);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0 ; i < k ; i++){
            result.add(queue.poll().getKey());
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new TopKFrequent().topKFrequent(new int[]{1,1,1,2,2,3},2));
    }
}
