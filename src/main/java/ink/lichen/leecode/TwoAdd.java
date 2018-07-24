package ink.lichen.leecode;

import java.util.*;

/**
 * Created by lichen@daojia.com on 2018-7-10.
 */
public class TwoAdd {


    public int[] twoSum(int[] nums, int target) {

        int[] ret = new int[2];

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey( complement )) {
                return new int[]{i, map.get( complement )};
            }
            map.put( nums[i], i );
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

    public static int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet(  );

        int length = 0;
        int dup = 0;

        for (int i = 0; i < nums.length - dup; i++){
            if (set.contains( nums[i] )){
                for (int j = i ; j < nums.length-dup-1; j++){
                    nums[j] = nums[j+1];
                }
                i--;
                dup++;
            }else {
                set.add( nums[i] );
                length++;
            }
        }
        return length;
    }


    public int[] plusOne(int[] digits) {


        int length = digits.length;
        int val = digits[length-1 ]++;
        if (val != 10)
        {
            digits[length-1]=val;
            return digits;
        }

        for (int i = length-1 ; i > 0 ; i--)
        {
            if(val > 10){
                digits[i] = 0;
                val = digits[i-1]++;
            }else{
                digits[i] = val;
                return digits;
            }
        }
        int[] ret = new int[digits.length];
        ret[0] = 1;

        return ret;
    }

    public void rotate(int[][] matrix) {
        int[][] copy =  new int[matrix.length][matrix.length];

        for (int i = 0 ; i < matrix.length; i++)
        {
            for (int j = 0 ; j < matrix[i].length;j++)
            {
                copy[i][j] = matrix[i][j];
            }
        }

        print(copy);

        for (int i = 0 ; i < copy.length; i++){
            for (int j = 0; j <copy[i].length; j++ ){

                matrix[j][copy.length-i]=copy[i][j];
            }
        }
        print(copy);
    }


    public void print(int[][] copy){
        for (int i = 0 ; i < copy.length; i++){
            for (int j = 0; j <copy[i].length; j++ ){
                System.out.print(copy[i][j]+"\t");
            }
            System.out.println();
        }
    }


    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int[] chars = new int[26];

        for (int i = 0; i <s.length(); i++){
            Character val =  s.charAt( i );
            Character tVal =  t.charAt( i );

            chars[122-val]++;
            chars[122-tVal]--;
        }
        for (int val : chars){
            if (val!=0){
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(String s) {
        if (s == ""){
            return true;
        }
        if(s.length() == 1 ){
            return false;
        }

        for (int i = 0,j = s.length()-1; i<=j;){

            while ( i <= j && !isValid( s.charAt( i )) ){
                i++;
            }

            if ( j >= i && !isValid( s.charAt( j ) ) ){
                j--;
            }

//            Character.isLetterOrDigit(  )
//            Character c = s.charAt( i );
//            c.compareTo(  )

            if (s.charAt( i ) != s.charAt( j ))
                return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }

    public boolean isValid(char c){
        if ((c>='0' && c <= '9') || (c >= 'a' && c <= 'z') || c >= 'A' && c <= 'Z'){
            return true;
        }else {
            return false;
        }
    }

    public void deleteNode(ListNode node) {

        ListNode tmp = node;
        ListNode prev = null;

        while (tmp.next != null){
            if (tmp.val == 5) {
                if (prev == null){
                    node = node.next;
                }else{
                    prev.next = tmp.next;
                }
                return;
            } else {
                prev = tmp;
                tmp = tmp.next;
            }
        }
    }

//    输入：1->2->4, 1->3->4
//    输出：1->1->2->3->4->4

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }

        ListNode head = null;
        if (l1.val <= l2.val){
            head = l1;
            head.next = mergeTwoLists( l1.next,l2 );
        }else {
            head = l2;
            head.next = mergeTwoLists( l1,l2.next );
        }
        return head;
    }

    //输入: 1->2->2->1
    //输出: true
    public boolean isPalindrome(ListNode head) {


        return false;
    }



    public boolean hasCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        fast = fast.next.next;
        slow = slow.next;

        while (fast!=null && fast.next != null){

            if(fast.next == slow || fast.next.next == slow){
                return true;
            }else {
                fast = fast.next.next;
                slow = slow.next;
            }
        }
        return false;
    }

    public int maxDepth(TreeNode root) {
        int max = 0;
        if (root == null){
            return 1;
        }
        if (maxDepth( root.right ) >= maxDepth( root.left )){
            return maxDepth( root.right )+1;
        }else {
            return maxDepth( root.left )+1;
        }
    }

    public int firstBadVersion(int n) {
        if (n == 1){
            return 1;
        }
        if(isBadVersion(1)){
            return 1;
        }

        long begin = 1;
        long end = n;
        long mid = (1+n)/2;

        boolean midFlag = isBadVersion ( mid );
        boolean mid1Flag = isBadVersion ( mid+1 );

        while ( !(midFlag == false && mid1Flag == true) && begin < end  )
        {
            if (midFlag  == true)
            {
                end = mid -1;
            }
            else if (midFlag == false)
            {
                begin = mid+1;
            }
            mid = (begin+end)/2;
            midFlag = isBadVersion(mid);
            mid1Flag = isBadVersion(mid+1);
        }
        return Math.toIntExact( mid+1 );
    }

    private boolean isBadVersion(long mid) {
        if (mid >=  1702766719){
            return true;
        }
        return false;
    }


    public static int Fibonacci(int n)
    {
        if(n<=0)
            return n;
        int []Memo=new int[n+1];
        for(int i=0;i<=n;i++)
            Memo[i]=-1;
        return fib(n, Memo);
    }
    public static int fib(int n,int []Memo)
    {

        if(Memo[n]!=-1)
            return Memo[n];
        //如果已经求出了fib（n）的值直接返回，否则将求出的值保存在Memo备忘录中。
        if(n<=2)
            Memo[n]=1;

        else Memo[n]=fib( n-1,Memo)+fib(n-2,Memo);

        return Memo[n];

    }

    public boolean isValidSudoku(char[][] board) {

        Set<Character> cross = new HashSet<Character>();
        Set<Character> vertical = new HashSet<Character>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j] >= 1 && board[i][j] <= 9) {
                    if (cross.contains( board[i][j] ))
                        return false;
                    else
                        cross.add( board[i][j] );
                }
                if (board[j][i] != '.') {
                    if (vertical.contains( board[j][i] ))
                        return false;
                    else {
                        vertical.add( board[j][i] );
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



    private int[] nums;

    Set<Integer> set = new HashSet();


    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        while (set.size() != nums.length){
            set.add( (int) (Math.random()*nums.length) )  ;
        }
        int[] rtn = new int[nums.length];

        int i = 0;

        for (Integer val : set){
            rtn[i++] = nums[val];
        }
        return rtn;
    }



    //       5
    //      / \
    //     4   8
    //    /   / \
    //   11  13  4
    //  /  \      \
    // 7    2      1

    public boolean hasPathSum(TreeNode root, int sum) {

        if (root.left == null && root.right == null) {
            if (root.val == sum)
                return true;
            else
                return false;
        }

        if (root.left != null) {
            root.left.val = root.val + root.left.val;
            if (hasPathSum( root.left, sum ))
            {
               return true;
            }
        }
        if (root.right != null) {
            root.right.val = root.val + root.right.val;
            if (hasPathSum( root.right, sum ))
            {
                return true;
            }
        }
        return false;
    }



}


//class MinStack {
//
//    int min = 0;
//
//    int capacity;
//
//    List<Integer> list;
//
//    int val;
//
//
//    /**
//     * initialize your data structure here.
//     */
//    public MinStack() {
//        list = new ArrayList<>( 100 );
//        val = -1;
//    }
//
//    public void push(int x) {
//        if (val == -1) {
//            min = x;
//        }
//
//        if (x < min) {
//            min = x;
//        }
//        if (val < capacity - 1) {
//            list.set( ++val, x );
//        } else {
//            list.add( x );
//            val++;
//            capacity++;
//        }
//    }
//
//    public void pop() {
//        Integer popVal = list.get( val );
//        if (popVal == min) {
//            min = list.get( 0 );
//            for (int i = 0; i < val; i++) {
//                if (list.get( i ) < min) {
//                    min = list.get( i );
//                }
//            }
//        }
//        val--;
//    }
//
//    public int top() {
//        return list.get( val );
//    }
//
//    public int getMin() {
//        return min;
//    }
//
//
//}
