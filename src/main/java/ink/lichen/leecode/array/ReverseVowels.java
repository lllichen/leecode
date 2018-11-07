package ink.lichen.leecode.array;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {


    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>();
        Collections.addAll(set,'a','e','i','o','u','A','E','I','O','U');
        int n = s.length();
        int lo = 0, hi = n-1;
        char[] chars = s.toCharArray();
        while (lo <= hi){
            Character b = chars[lo];
            Character e = chars[hi];
            if (!set.contains(b)){
                lo++;
            }else if (!set.contains(e)){
                hi--;
            }else {
                Character temp = b;
                chars[lo] = e;
                chars[hi] = temp;
                lo++;
                hi--;
            }
        }
        return String.copyValueOf(chars);
    }

}
