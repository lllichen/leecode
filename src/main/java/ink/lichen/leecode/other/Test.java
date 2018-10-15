package ink.lichen.leecode.other;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-10-11.
 */
public class Test {




        public void testFor(List<Integer> list){
            for (int i = 0 ; i < list.size(); i++){
                i = i + 1;
            }
        }

        public void testLambda(List<Integer> list){
            int sum = 0;
            list.stream().forEach((val)->val = val+1);
        }


        public static void main(String[] args) {

            List<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < 50000000; i++){
                list.add((int)(Math.random() * 1000000));
            }

            Test test = new Test();

//            long start = System.currentTimeMillis();
//
//            test.testFor(list);
//            long end = System.currentTimeMillis() - start;
//            System.out.println("for: "+end);

//
            long start1 = System.currentTimeMillis();

            test.testLambda(list);
            long end1 = System.currentTimeMillis() - start1;
            System.out.println("lambda: "+end1);

            long start2 = System.currentTimeMillis();

            test.testLambda(list);
            long end2 = System.currentTimeMillis() - start2;
            System.out.println("lambda: "+end2);
        }

}
