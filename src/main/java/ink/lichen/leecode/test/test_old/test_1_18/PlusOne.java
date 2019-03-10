package ink.lichen.leecode.test.test_old.test_1_18;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * Created by lichen@daojia.com on 2019-1-18.
 */
public class PlusOne {


    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if (n == 0){
            return new int[]{};
        }
        boolean isAllNine = true;
        for (int val : digits){
            if (val != 9){
                isAllNine = false;
                break;
            }
        }
        if (isAllNine){
            int[] res = new int[n+1];
            res[0] = 1;
            return res;
        }
        int cur = 1;
        for (int i = n - 1; i >= 0 ; i--){
            digits[i] = digits[i] + cur;
            if (digits[i] == 10){
                digits[i] = 0;
            }else {
                break;
            }
        }

        return digits;
    }


    public static Map<String, Long> allocate(Long amount, Map<String, Long> rateMap) {
        Map<String,Long> result = new HashMap<>();
        Long sum = 0L;
        Long amountSum = 0L;

         Set<String> set = rateMap.keySet();
         for (String key: set){
             Long value = rateMap.get(key);
             sum += value;
         }

         String[] keys = (String[]) set.toArray();
         Random random = new Random();

        for (String key: set){
            Long value = rateMap.get(key);
            double rate = value*1.0/sum;
            result.put(key,new Double(rate*amount).longValue());
            amountSum+=Double.doubleToLongBits(rate*amount);
        }
        Long remain = amount-amountSum;

        String randomKey = keys[random.nextInt(keys.length)];
         result.put(randomKey,rateMap.get(randomKey)+remain) ;
        return result;
    }

    public static void main(String[] args) {
        new PlusOne().plusOne(new int[]{9});
    }
}
