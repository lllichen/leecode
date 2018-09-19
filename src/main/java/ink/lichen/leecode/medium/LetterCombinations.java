package ink.lichen.leecode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by lichen@daojia.com on 2018-9-18.
 */
public class LetterCombinations {

//    public List<String> letterCombinations(String digits) {
//        Map<Character, String> map = new HashMap<>();
//        map.put('2', "abc");
//        map.put('3', "def");
//        map.put('4', "ghi");
//        map.put('5', "jkl");
//        map.put('6', "mno");
//        map.put('7', "pqrs");
//        map.put('8', "tuv");
//        map.put('9', "wxyz");
//
//        Set<String> result = new HashSet<>();
//
//        for (int i = 0; i < digits.length(); i++) {
//            char c = digits.charAt(i);
//            String val = map.get(c);
//            if (result.size() == 0) {
//                for (char t : val.toCharArray()) {
//                    result.add(t + "");
//                }
//            } else {
//                Set<String> temp = new HashSet<>();
//                for (String sval : result) {
//                    for(char z : val.toCharArray())
//                    {
//                        temp.add(sval+z);
//                    }
//                }
//                result = temp;
//            }
//        }
//
//        return new ArrayList<>(result);
//    }

    String[] codes = new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.equals("")){
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        backtrace(digits, result, "", 1, digits.length());
        return result;
    }

    private void backtrace(String digits, List<String> list, String str, int deep, int n){
        if(deep == n){
            for(char c : codes[digits.charAt(deep-1) - '0' -2].toCharArray()){
                list.add(str+c);
            }
        }else{
            int val =digits.charAt(deep-1) - '0' -2;
            for(char c : codes[val].toCharArray()){
                backtrace(digits, list, str+c, deep+1, n);
            }
        }
    }

    public static void main(String[] args) {
        LetterCombinations letterCombinations = new LetterCombinations();
        List<String> res =letterCombinations.letterCombinations("23");
        System.out.println();
    }
}
