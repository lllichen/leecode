package ink.lichen.leecode.other;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by lichen@daojia.com on 2018-10-11.
 */
public class Test {

        public void testFor(List<Integer> list){
            long start = System.currentTimeMillis();
            int t = 0;
            for (int i = 0 ; i < list.size(); i++){
                if (list.get(i) > 500000){
                    t = t+1;
                }
            }
            System.out.println(t);
            long end = System.currentTimeMillis() - start;
            System.out.println("for: "+end);
        }

        public void testLambda(List<Integer> list){

//            list.stream().collect(Collection)

            Stream<Integer> s = list.parallelStream();
            long start = System.currentTimeMillis();

            long sum = 0;
            sum = s.filter(val -> val > 500000).count();
            System.out.println(sum);

            long end = System.currentTimeMillis() - start;
            System.out.println("lambda: "+end);
        }


        public static void main(String[] args) {

//            List<Integer> list = new ArrayList<Integer>();
//            for(int i = 0; i < 1000000; i++){
//                list.add((int)(Math.random() * 1000000));
//            }
//
//            Test test = new Test();


//            test.testFor(list);
//            test.testFor(list);
//            test.testFor(list);
//
//            test.testLambda(list);
//            test.testLambda(list);
//            test.testLambda(list);

            int a[]= IntStream.range(0, 100_000_000).filter(p -> p % 2==0).toArray();

            long t0 = System.nanoTime();

            //初始化一个范围100万整数流,求能被2整除的数字，toArray（）是终点方法

            a = IntStream.range(0, 100_000_000).filter(p -> p % 2==0).toArray();
            long t1 = System.nanoTime();

            //和上面功能一样，这里是用并行流来计算


            int b[]=IntStream.range(0, 100_000_000).parallel().filter(p -> p % 2==0).toArray();
            long t2 = System.nanoTime();

            //我本机的结果是serial: 0.06s, parallel 0.02s，证明并行流确实比顺序流快

            System.out.printf("serial: %.2fs, parallel %.2fs%n", (t1 - t0) * 1e-9, (t2 - t1) * 1e-9);


        }

}
