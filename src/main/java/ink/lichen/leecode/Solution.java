package ink.lichen.leecode;

import jdk.nashorn.internal.objects.NativeJSON;
import jdk.nashorn.internal.parser.JSONParser;

import java.util.*;

/**
 * Created by lichen@daojia.com on 2018-7-24.
 */
public class Solution {
    private int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;

    }

    public Solution(){

    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        List<Integer> numsList = new LinkedList<>();
        for (int i = 0 ; i < nums.length;i++){
            numsList.add( nums[i] );
        }
        int[] rets = new int[nums.length];
        for (int i = 0 ; i < nums.length;i++ ){
            int index = (int)(Math.random()*(numsList.size() ));
            rets[i] = numsList.get( index );
            numsList.remove( index );
        }
        return rets;
    }

    public List<String> fizzBuzz(int n) {

        return new java.util.AbstractList<String>() {
            @Override
            public String get(int index) {
                if(index % 15 ==0 ){
                    return "FizzBuzz";
                }else{
                    if (index % 3 == 0){
                        return "Fizz";
                    }else if (index % 5 == 0){
                        return "Buzz";
                    }else{
                        return String.valueOf(index);
                    }
                }
            }

            @Override
            public int size() {
                return 0;
            }
        };
    }

//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000

    public int char2int(char val){
        switch (val){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default:return 0;
        }
    }

    public int romanToInt(String s) {
        int val = 0;
        if (Objects.isNull( s )){
            return val;
        }
        for (int i = 0; i < s.length(); i++){
            if (i+1 < s.length() && char2int(s.charAt( i+1 ))> char2int(s.charAt( i )) ){
                val = val + char2int( s.charAt( i+1 ) )-char2int( s.charAt( i ) );
                i++;
            }else {
                val = char2int( s.charAt( i ) )+val;
            }

        }
        return val;
    }
    public int hammingWeight(int n) {
        String val = Integer.toBinaryString( n );
        int count =0;
        for (int i = 0; i < val.length(); i++){
            if(val.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }

    public char ret(char d){
        switch (d){
            case ')':return '(';
            case '}':return '{';
            case ']':return '[';
            default:return '1';
        }
    }



    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i =0; i < s.length(); i++){
            if (s.charAt( i ) == '(' || s.charAt( i) == '{' || s.charAt( i) == '[' )
            {
                stack.push( s.charAt( i ) );
            }else {
                if (stack.isEmpty()){
                    return false;
                }else {
                    char newVal = stack.pop();
                    if (newVal != ret( s.charAt( i ) ) )
                    {
                        return false;
                    }
                }
            }
        }
        if (!stack.isEmpty()){
            return false;
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().isValid( "()" ));
    }

}
