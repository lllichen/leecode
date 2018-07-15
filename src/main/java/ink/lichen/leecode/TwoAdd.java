package ink.lichen.leecode;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by lichen@daojia.com on 2018-7-10.
 */
public class TwoAdd {


    public int[] twoSum(int[] nums, int target) {

        int[] ret = new int[2];

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if (map.containsKey( complement )){
                return new int[] {i,map.get( complement )};
            }
            map.put( nums[i],i );
        }

        return ret;
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

//        List<Integer> list = new ArrayList<Integer>(  );
//
//        List<Integer> list2 = new ArrayList<Integer>(  );
//
//        List<Integer> retList = new ArrayList<Integer>( );
//
//        while(l1.next != null){
//            list.add( l1.val );
//            l1 = l1.next;
//        }
//
//        while(l2.next != null){
//            list2.add( l2.val );
//            l2 = l2.next;
//        }
//
//
//        int rem = 0;
//        int div = 0;
//
//
//        for (int i = list2.size() ; i < list2.size() ; i--) {
//
//
//        }

//        for ( int i = 0; )

//        return ret;
        return null;
    }



    public boolean isValidSudoku(char[][] board) {

        Set<Character> cross = new HashSet<Character>();
        Set<Character> vertical = new HashSet<Character>();

        for (int i = 0 ; i < board.length; i ++){
            for (int j = 0 ; j < board[i].length;j++){

                if ( board[i][j]  >=1 && board[i][j]  <= 9 ){
                    if (cross.contains(board[i][j]) )
                        return false;
                    else
                        cross.add(board[i][j]);
                }
                if( board[j][i] != '.' ){
                    if (vertical.contains(board[j][i]))
                        return false;
                    else {
                        vertical.add(board[j][i]);
                    }
                }
            }
            cross.clear();
            vertical.clear();

        }

        return true;
    }

    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0,j = chars.length-1 ; i < chars.length; i++,j--){
            if (i >= j ){
                break;
            }
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
        }
        return new String(chars);
    }


    public int reverse(int x) {
        return 0;
    }


    public static void main(String[] args) {
        int x = -1;
        String val = String.valueOf(x);
        System.out.println(String.valueOf(Integer.MIN_VALUE));
        System.out.println(String.valueOf(Integer.MAX_VALUE));
        char[] chars = val.toCharArray();
        for (int i = 0,j = chars.length-1 ; i < chars.length; i++,j--){
            if (i >= j ){
                break;
            }
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
        }

        if ( chars[0] == '-' ) {
//            if ()
        }

    }

}


