package ink.lichen.leecode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lichen@daojia.com on 2018-9-12.
 */
public class LengthOfLongestSubstring {

//    public int lengthOfLongestSubstring(String s) {
//
//        if (s == null || s.length() == 0){
//            return 0;
//        }
//
//        int max = 0;
//        int temp = 0;
//        int z = -1;
//        Map<Character,Integer> map = new HashMap<>();
//        for (int i = 0 ;i < s.length(); i++){
//            Integer idx = map.get(s.charAt(i));
//            if (idx != null &&   idx > z ){
//                if (temp > max){
//                    max = temp;
//                }
//                z = idx;
//                temp = i-idx;
//                map.put(s.charAt(i),i);
//            }else {
//                temp++;
//                map.put(s.charAt(i),i);
//            }
//
//        }
//        if (temp > max){
//            max = temp;
//        }
//
//        return max;
//    }

    public int lengthOfLongestSubstring(String s) {
        int n=s.length(), ans=0;
        int[] index=new int[128];
        for(int i=0,j=0; j<n; j++){
            i=Math.max(i,index[s.charAt(j)]);
            ans=Math.max(ans,j-i+1);
            index[s.charAt(j)]=j+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring l = new LengthOfLongestSubstring();
        System.out.println(l.lengthOfLongestSubstring("abcabcbb"));
    }
}
