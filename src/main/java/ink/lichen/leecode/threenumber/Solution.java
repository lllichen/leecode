package ink.lichen.leecode.threenumber;

import java.util.*;

/**
 * Created by lichen@daojia.com on 2018-7-25.
 */
public class Solution {


    //set
    Set<Character> set = new HashSet<>();

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new ArrayList<>();
        List<Set<Character>> list = new ArrayList<>();

        Set<Character> set = new HashSet<>( );

        for (String str : strs)
        {
            for ( int i = 0 ; i < str.length() ; i++ )
            {
//                set<>
            }

        }

        return res;

    }

    public static void main(String[] args) {
        Random random = new Random( );
        for (int i = 0 ; i < 100; i++)
            System.out.println(random.nextInt( 10 ));
    }
}
